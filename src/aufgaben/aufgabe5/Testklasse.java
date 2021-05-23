package aufgaben.aufgabe5;

import java.util.*;

public class Testklasse {

	public static void main(String[] args) 
	{
		SetOperations set1 = new SetOperations();
		
		set1.fill();
		set1.fillBothUnion();
		set1.print();
		
		set1.fillBothIntersection();
		set1.print();
		
		set1.fillBothDifference();
		set1.print();

	}

}
