public class Principal {
    public static void main(String[] args) {
        Level level1 = new Level("fácil", 1);
        Category category1 = new Category("matemáticas", 1);
        Content content1 = new Content("explícito", 1);
        Exercise exercise1 = new Exercise("E-R", 1, level1, content1, category1);
        // System.out.println(category1.toString());
        // System.out.println(content1.toString());
        // System.out.println(level1.toString());
        exercise1.setLevel(level1);
        System.out.println(exercise1.toString());
    }
}