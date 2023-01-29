public class Person {
    public String name;
    public int age;
    public boolean isMan;

    Person(String name, int age, boolean isMan){
        name = "Ivan";
        age = 25;
        isMan = true;
    }

    public static void main(String[] args) {
        Person person = new Person("Ivaylo", 36, true);

        public void showPersonInfo () {
            System.out.println (person.name + person.age + person.isMan);
        }
    }
}