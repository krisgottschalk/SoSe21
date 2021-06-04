package aufgaben.aufgabe6;

import java.util.*;

public class PizzaMenu
{
	public static boolean existingPizza(Map<String,Double> menu, String pizza)
	{
		Set<Map.Entry<String, Double>> entries = menu.entrySet();
		for(Map.Entry<String, Double> eintrag: entries)
		{
			if(eintrag.getKey() == pizza) return true;
		}
		return false;
	}
	
	public static void printPrice(Map<String, Double> menu, String pizza)
	{
		if(existingPizza(menu, pizza))
		{
			System.out.printf("%s: %3.2f Euro %n", pizza, menu.get(pizza)); //menu.get(Object key) prints the value to which the key is mapped
		}
		else
		{
			System.out.println(pizza + ": Diese Pizza gibt es nicht.");
		}
	}
	
	public static void printMenu(Map<String, Double> menu)
	{
		System.out.println("##############");
		if(menu.size()==1)
		{
			System.out.println("Das Menu enthält " + menu.size() + " Pizza." ); //1 Pizza, nicht Pizzen
		}
		else
		{
			System.out.println("Das Menu enthält " + menu.size() + " Pizzen." );
		}
		
		for(Map.Entry<String, Double> eintrag: menu.entrySet())
		{
			System.out.printf("Pizza %s: %3.2f Euro %n", eintrag.getKey(), eintrag.getValue());
		}
		System.out.println("##############");
	}
	
	public static void affordablePizza(Map<String,Double> menu, double maxPrice)
	{
		Set<String> allePizzen = new HashSet<>();
		System.out.println("Eingegebener Betrag: " + maxPrice + " Euro");
		for(Map.Entry<String, Double> eintrag : menu.entrySet())
		{
			if(eintrag.getValue()<= maxPrice) //Bsp für Auto-Boxing!
			{
				allePizzen.add(eintrag.getKey());
			}
		}
		if(allePizzen.size()==0)
		{
			System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
		}
		else
		{
			System.out.println("Mögliche Pizzen: " + allePizzen);
		}
	}
	
	public static void main(String[] args) 
	{
		Map<String, Double> menu = new HashMap<>();
		menu.put("Margherita", 7.00);
		menu.put("Veggie", 7.50);
		menu.put("Salami", 8.50);
		menu.put("Schinken", 8.50);
		
		Map<String, Double> menu2 = new HashMap<>();
		menu2.put("Margherita", 7.00);
		
		System.out.println(existingPizza(menu, "Margherita"));
		printPrice(menu, "Margherit"); //Trial of method
		printMenu(menu2);
		
		menu.put("Schinken", 8.20); //neuer Wert für Pizza Schinken
		printMenu(menu);
		
		affordablePizza(menu, 8.20);
		
		menu.clear();
		menu.put("Verde", 7.00);
		menu.put("Hawaii", 8.20);
		menu.put("Tradizionale", 8.50);
		
		Map<String, Double> menu3 = new HashMap<>();
		menu3.putAll(menu); //kopiert alle Pizzen in neues Menü
		menu3.remove("Hawaii");
		printMenu(menu3);
		
	}
	
	

}
