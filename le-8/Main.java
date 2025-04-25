interface Swan {
    public void swim();
}

interface Crow {
    public void eat();
    public void cry();
    public void fly();
}

public class Main {
    public static void client(Swan swan) {
        swan.swim(); 
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Crow crow = new IndianCrow(); 
        CrowAdapter crowAdapter = new CrowAdapter(crow);

        client(crowAdapter);
    }
}
