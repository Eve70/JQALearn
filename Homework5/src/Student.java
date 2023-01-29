public class Student extends Person {
    double score;

    Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
    }

    public static void main(String[] args){
        Student student = new Student();

        public void showStudentInfo(){
            System.out.println(student.name + student.age + student.isMan + student.score);
        }
    }

}
