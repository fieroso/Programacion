public class Exercise {
    private String type;
    private int id_exercise;
    private Level level;
    private Content content;
    private Category category;

    public Exercise(String type, int id_exercise, Level level, Content content, Category category) {
        this.type = type;
        this.id_exercise = id_exercise;
        this.level = level;
        this.content = content;
        this.category = category;
    }

    public String toString() {
        String result = "El ejercicio " + this.id_exercise
                + " es de tipo " + this.type + ", categoría " + this.category.getType() + ", con un contenido "
                + this.content.getType() + " y un nivel de dificultad " + this.level.getType();
        return result;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
