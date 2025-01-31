package voicesystem;

public class Voice2 {
    private Animal[] animals = new Animal[5];

    // Step 1: Prepare the voice system (initialize animals)
    private void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    // Step 2: Make all animals speak
    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }

    // Template Method (Ensures order)
    public void templateMethod() {
        prepareVoice();  // Ensure animals are initialized first
        hear();          // Play all voices
    }
}
