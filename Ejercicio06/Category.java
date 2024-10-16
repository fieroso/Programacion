public class Category {
    private String type;
    private int id_category;

    public Category(String type, int id_category) {
        this.type = type;
        this.id_category = id_category;
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