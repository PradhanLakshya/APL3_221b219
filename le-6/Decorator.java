public abstract class Decorator extends Offering {
    protected Offering offering;

    public Decorator(Offering offering) {
        this.offering = offering;
    }
}
