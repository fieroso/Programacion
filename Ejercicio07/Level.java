public class Level {
    private String type;

    public Level(String type) {
        this.type = type;

    }

    @Override
    public String toString() {
        String result = "El nombre del nivel es " + this.type;
        return result;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
