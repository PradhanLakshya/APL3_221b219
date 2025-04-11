public class Coffee extends Decorator {
    
    public Coffee(Offering offering) {
        super(offering);  
    }
    
    public String getName() {
        return offering.getName() + " with Coffee";
    }
    
    public int getPrice() {
        return offering.getPrice() + 35;
    }
}
