abstract class Main
{
	public static void main(String[] args) {
	    Whiskey w = new Whiskey();
	    w.templateMethod(30);
	    System.out.println("");
	    Beer b = new Beer();
	    b.templateMethod(40);
	}
}
