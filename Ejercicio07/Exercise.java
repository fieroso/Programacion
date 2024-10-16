public class Exercise {
    private String statement;
    private Level level;

    public Exercise(String statement, Level level) {
        this.statement = statement;
        this.level = level;
    }

    public String toString() {
        String result = "El ejercicio " + this.statement
                + " tiene un nivel de dificultad " + this.level.getType();
        return result;
    }
    public void setLevel(Level level) {
        this.level = level;
    }
}
