public class Main {
    public static void main(String[] args) {

        Student student = new Student("avi" ,20 ,90);
        student.printDetails();
        System.out.println(student.isExcellent());
        student.birthday();
        student.printDetails();
    }
}