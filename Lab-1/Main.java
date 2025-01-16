public class Main {
	private String name; 
	private int age; 
	public String getName() 
	{ return name;
	} 
	public void setName(String name) 
	{ this.name = name; }
	public int getAge() { 
		return age; 
	} 
	public void setAge(int age) {
		this.age = age; 
	} 
	public static void main(String[] args) {
		Main person = new Main(); 
	person.setName("John Doe"); 
	person.setAge(30); 
	System.out.println("Name: " + person.getName()); 
	System.out.println("Age: " + person.getAge()); 
	} 
}
