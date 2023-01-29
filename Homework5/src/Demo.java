import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo<E, i> {
    // array of 10 elements of type Person
    class ArrayDemo {
        public void main(String[] args) {
            Person[] personArray;
            personArray = new Person[10];
            personArray[0] = new Person("Pesho", 28, true);
            personArray[1] = new Person("Maria", 29, false);
            personArray[2] = new Person("Ivanka", 20, false);
            personArray[3] = new Person("Krisi", 19, false);
            personArray[4] = new Person("Krasi", 24, true);
            personArray[5] = new Person("Sasho", 33, true);
            personArray[6] = new Person("Georgi", 40, true);
            personArray[7] = new Person("Stanka", 50, false);
            personArray[8] = new Person("Martin", 37, true);
            personArray[9] = new Person("Anna", 16, false);
        }

        // 2 objects of type Person, Student and Employee created and added to array
        Person person1 = new Person("Stoyan", 19, true);
        Person person2 = new Person("Irina", 21, false);
        Student student1 = new Student("Lili", 23, false, 5.5);
        Student student2 = new Student("Gogo", 34, true, 5.0);
        Employee employee1 = new Employee("Nikola", 14, true, 9.5);
        Employee employee2 = new Employee("Aleksa", 26, false, 19.4);

        List<E> newPersonArray = new ArrayList<E>(Arrays.asList(Arrays.copyOf(personArray)));

        public void getNewPersonArrayElements() {
            newPersonArray.add((E) person1);
            newPersonArray.add((E) person2);
            newPersonArray.add((E) student1);
            newPersonArray.add((E) student2);
            newPersonArray.add((E) employee1);
            newPersonArray.add((E) employee2);
            return;
        }

        // Get method for the respective type of object Person, Student or Employee
            for (int i = 0; i < newPersonArray.length; i++) {
                if (score != 0) {
                    showStudentInfo();
                } else if (daySalary != 0) {
                    showEmployeeInfo();
                } else {
                    showPersonInfo();
                }

            // Calculate employee overtime pay
            for (int i = 0; i < newPersonArray.length; i++) {
                if (daySalary != 0) {
                    calculateOvertime(2);
                    System.out.println(newDaySalary);
                } else {
                    System.out.println("No overtime.");
                }
            }
        }
    }
}
