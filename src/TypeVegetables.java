public enum TypeVegetables {
    CARROT("Морковь"),
    CUCUMBER("Огурец"),
    PEPPER("Перец"),
    TOMATO("Томат");

    private final String typeVegetables;

    TypeVegetables(String typeVegetables) {
        this.typeVegetables = typeVegetables;
    }

    public String getTypeVegetables() {
        return typeVegetables;
    }
}
