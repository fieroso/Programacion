
import java.util.Scanner; 
    public class EjercicioIfElse {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println(" ¿Has Comido? ");
    String respuesta = entrada.nextLine();
    if (respuesta.equals("Si")) {System.out.printf("\n No tengo hambre");}
    else if (respuesta.equals("No")) {System.out.printf("\n Tengo hambre");}
    else {System.out.printf("\n ¿Qué dices?");}
    entrada.close();
    }
}
