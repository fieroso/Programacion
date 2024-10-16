public class Content {
    private String type;
    private int id_content;

    public Content(String type, int id_content) {
        this.type = type;
        this.id_content = id_content;
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