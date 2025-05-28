public enum CoffeeType {
    ESPRESSO("C2", "Espresso", 4),
    LATTE("C3", "Latte", 2),
    CAPPUCCINO("C4", "Cappuccino", 3);

    private final String codeCoffeeType;
    private final String coffeeName;
    private final float price;
    CoffeeType(String codeCoffeeType, String coffeeName, float price) {
        this.codeCoffeeType = codeCoffeeType;
        this.coffeeName = coffeeName;
        this.price = price;
    }

    public String getCodeCoffeeType() {
        return codeCoffeeType;
    }
    public String getCoffeeName() {
        return coffeeName;
    }
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return coffeeName + "("+ price + "$)";
    }
}
