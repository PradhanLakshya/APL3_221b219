public class Gin extends Decorator {
    
    public Gin(Offering offering) {
        super(offering);  
    }
    
    public String getName() {
        return offering.getName() + " with Gin";
    }
    
    public int getPrice() {
        return offering.getPrice() + 25;
    }
}
