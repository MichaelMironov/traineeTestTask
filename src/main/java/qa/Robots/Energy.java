package qa.Robots;

public enum Energy {
    ATOMIC("Уран",5),
    FUEL("Бензин", 4),
    ELECTRICITY("Электричество",5);

    private final int fullCharge;
    private final String name;
    Energy(String name, int count) {
        this.fullCharge = count;
        this.name = name;
    }

    public int getFullCharge() {
        return fullCharge;
    }

    public String getName() {
        return name;
    }
}
