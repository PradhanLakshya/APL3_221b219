public class Main {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); // show() of Mother is called, displays "Hello World"

        Child ch = new Child();
        ch.show(); // show() of Child is called, displays "Hello JUET"
    }
}
