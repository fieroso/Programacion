public class Ejercicio5 {
    public static void main(String[] args) {
        Student student1 = new Student("Felipe", "Enriquez", 5);
        // student1.name = "Felipe";
        // student1.lastName ="Enriquez";
        // student1.numberOfSubjects = 5;
        // student1.setName("Felipe");
        // student1.setLastName("Enriquez");
        // student1.setNumberOfSubjects(5);
        Student student2 = new Student("Anastasia", "Tsygankov", 3);
        // student2.name = "Anastasia";
        // student2.lastName = "Tsygankov";
        // student2.numberOfSubjects = 3;
        // student2.setName("Anastasia");
        // student2.setLastName("Tsygankov");
        // student2.setNumberOfSubjects(3);
        System.out.println("Hola Mundo");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}

class Student {
    private String name;
    private String lastName;
    private int numberOfSubjects;

    // public void setName (String name) {
    // this.name = name;
    // }
    // public String getName(){
    // return name;
    // }
    // public void setLastName (String lastName) {
    // this.lastName = lastName;
    // }
    // public String getLastName(){
    // return lastName;
    // }
    // public void setNumberOfSubjects (int numberOfSubjects) {
    // this.numberOfSubjects = numberOfSubjects;
    // }
    // public int getNumberOfSubjects(){
    // return numberOfSubjects;
    // }
    public Student(String name, String lastName, int numberOfSubjects) {
        this.name = name;
        this.lastName = lastName;
        this.numberOfSubjects = numberOfSubjects;
    }
    public String toString() {
        String result = "El alumno con nombre " + this.name
                + " y con apellido " + this.lastName
                + " cursa " + this.numberOfSubjects
                + " asignaturas";
        return result;
    }
}
// Crear alumnos que tengan Nombre, Apellido y Número de Asignaturas
// Matriculadas
// 2 alumnos, Felipe Enriquez (5 Asignaturas) y Anastasia Tsygankov (3
// Asignaturas)
// Imprimir en pantalla con el formato: El alumno "name" con apellido
// "lastName" cursa "numberOfSubjects" asignaturas.
