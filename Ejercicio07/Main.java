public class Main {
    public static void main(String[] args) {
        Level level1 = new Level("fácil");
        Exercise exercise10 = new Exercise("Dame Patatas", level1);
        System.out.println(exercise10.toString());
        System.out.println("El ejercicio es Difícil, su nivel es incorrecto");
        Level level2 = new Level("difícil");
        System.out.println(level2.toString());
        exercise10.setLevel(level2);
        System.out.println(exercise10.toString());    
    }
}
