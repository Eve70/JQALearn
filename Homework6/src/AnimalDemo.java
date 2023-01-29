public class AnimalDemo {
        public static void main(String[] args) {
            Bird bird = new Bird();
            Dog dog = new Dog();
            Cat cat = new Cat();

            bird.makeSomeNoise();
            bird.play();
            bird.fly();
            bird.synk(4,2);
            dog.makeSomeNoise();
            dog.play();
            dog.bringStick();
            cat.makeSomeNoise();
            cat.play();
            cat.climp();
        }
}
