public class Bird implements Animal {
    @Override
    public void makeSomeNoise() {
        System.out.println("Bird sings.");
        }

    @Override
    public void play() {
        System.out.println("Bird flies in circles.");
    }

    void fly() {
        System.out.println("Bird flies.");
    }
    void synk(int numberOfBirds1) {
        System.out.println(numberOfBirds1 + " birds are synkining");
    }
    void synk(int numberOfBirds1, int numberofBirds2){
        System.out.println((numberOfBirds1+numberofBirds2) + " birds are synking");
    }
}
