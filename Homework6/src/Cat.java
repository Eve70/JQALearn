public class Cat implements Animal {
    void climp(){
        System.out.println("Cat is climping.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Cat meows.");
    }

    @Override
    public void play() {
        System.out.println("Cat is chasing its tail.");
    }
}
