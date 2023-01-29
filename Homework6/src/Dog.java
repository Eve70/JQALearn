public class Dog implements Animal {
    void bringStick(){
        System.out.println("Dog is bringing a stick.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
    System.out.println("Dog jumps around.");
    }
}
