public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear una instancia del ordenador de mi casa
        Computer homeComputer;
        // Asignamos en la variable anterior la instancia el ordenador de mi casa
        homeComputer = new Computer();
        homeComputer.cpuName = "Intel";
        homeComputer.motherboardName = "Gigabyte";
        homeComputer.ramGB = 16;
        homeComputer.graphicCardName = "Nvidia";
        homeComputer.powerSupplyUnitW = 800;

        System.out.println("Info de mi ordenador de casa");
        System.out.println(homeComputer.toString());
        System.out.println(ImprimirInformacionOrdenador(homeComputer));

        // Crear una instancia del ordenador del colegio
        // Computer schoolComputer = new Computer();
        // System.out.println("Info del ordenador del colegio");
        // System.out.println(schoolComputer);
        // System.out.println(ImprimirInformacionOrdenador(schoolComputer));
    }

    public static String ImprimirInformacionOrdenador(Computer computer) {
        String result;
        result = "cpuName: " + computer.cpuName
                + ", motherboardName: " + computer.motherboardName
                + ", ramGB: " + computer.ramGB
                + ", graphicCardName: " + computer.graphicCardName
                + ", powerSupplyUnitW: " + computer.powerSupplyUnitW;
        return result;
    }
}

class Computer {
    String cpuName;
    String motherboardName;
    int ramGB;
    String graphicCardName;
    int powerSupplyUnitW;

    public String toString() {
        String result = "tostring - cpuName: " + this.cpuName
                + ", motherboardName: " + this.motherboardName
                + ", ramGB: " + this.ramGB
                + ", graphicCardName: " + this.graphicCardName
                + ", powerSupplyUnitW: " + this.powerSupplyUnitW;
        return result;
    }

}
