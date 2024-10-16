public class Ejemplo2 {
    public static void main(String[] args) {
        Student student;
        student = new Student();
        student.setName("Pepe");
        student.lastName = "Gomez";
        System.out.println(student);
        System.out.println(student.toString()); 
    }
}

class Student {
    public String name;
    public String lastName;

    public Student() {}

    public String toString() {
        return "Alumno: " + this.lastName + ", " + this.name;
    }

}
