abstract class Beverage
{
	void pour(int qty) {
	    System.out.println("pour "+ qty + " ml of beverage");
	}
	protected abstract void addCondiment();
	protected void stir() {}
	void serve() {
	    System.out.println("serve through waiter");
	}
	
	public void templateMethod(int qty) {
	    pour(qty);
	    addCondiment();
	    stir();
	    serve();
	}
}
