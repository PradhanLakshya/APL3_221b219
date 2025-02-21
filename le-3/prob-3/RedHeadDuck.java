public class RedHeadDuck extends Duck implements FlyBehaviour, QuackBehaviour {
    @Override
    public void fly() {
        System.out.println("RedHead Duck flies.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}
