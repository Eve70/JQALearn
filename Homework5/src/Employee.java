public class Employee extends Person {
    double daySalary;
    double hours;

    Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Bobi", 42, true, 14.30);

        public void calculateOvertime ( double hours){
            boolean workOvertime;
            boolean isOver18;
            newDaySalary;
            if (workOvertime = true && isOver18 = true) {
                newDaySalary = daySalary + (hours * 1.5);
            } else if (workOvertime = true && isOver18 = false) {
                newDaySalary = 0;
            } else {
                newDaySalary = daySalary + (hours * 1);
            }
        }

        public void showEmployeeInfo () {
            System.out.println(employee.name + employee.age + employee.isMan + employee.daySalary);
        }
    }
}