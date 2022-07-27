package qa.Robots.enums;

public enum Food {
    PORRIDGE("Каша"),
    SPAGHETTI("Спагетти");

    private final String food;

    Food(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}


