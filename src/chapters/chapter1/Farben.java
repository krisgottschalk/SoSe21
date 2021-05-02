package chapters.chapter1;

public enum Farben {
    KREUZ(12), PIK(11), HERZ(10), KARO(9);
    private int farbwert;

    private Farben(int wert)
    {
        this.farbwert=wert;
    }   

   @Override
    public String toString()
    {
        char c = ' ';
        switch(this)
        {
            case KREUZ  : c ='\u2663';  break;
            case PIK    : c ='\u2664';  break;
            case HERZ   : c ='\u2665';  break;
            case KARO   : c ='\u2666';  break;
        }
        return String.valueOf(c);
    }
   
   public static void main(String[] args) 
	{
		Farben color1 = Farben.HERZ;
		Farben color2 = Farben.KARO;
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color1.toString());

	}
    
   
}

