

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Offering offering=new Coffee();
		offering = new Rum(offering);
		System.out.println(offering.getName() +" "+offering.getPrice());
	}
}