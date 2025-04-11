public class Rum extends Decorator {
    
    public Rum(Offering offering) {
        super(offering);  
    }
    
    public String getName() {
        return offering.getName() + " with Rum";
    }
    
    public int getPrice() {
        return offering.getPrice() + 55;
    }
}
