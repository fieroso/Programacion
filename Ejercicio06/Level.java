public class Level {
    private String type;
    private int id_level;

    public Level(String type, int id_level) {
        this.type = type;
        this.id_level = id_level;
    }

    public String toString() {
        String result = this.type;
        return result;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}