public class Icecream extends Decorator {
    
    public Icecream(Offering offering) {
        super(offering);  
    }
    
    public String getName() {
        return offering.getName() + " with Icecream";
    }
    
    public int getPrice() {
        return offering.getPrice() + 25;
    }
}
