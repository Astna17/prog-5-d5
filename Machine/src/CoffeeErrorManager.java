import java.util.Map;

public class CoffeeErrorManager {
    public static void checkBalance(float balance, CoffeeType type) {
        if (balance < type.getPrice()) {
            throw new CoffeeMachineException("101 - InsufficientFundsError: Insufficient sale to" +type.getCoffeeName());
        }
    }

    public static void checkSelection(String input) {
        try {
            CoffeeType.valueOf(input);
        } catch (Exception e) {
            throw  new CoffeeMachineException("102 - InvalidSelectionError: Drink not found : " + input);
        }
    }

    public static void checkStock(Map<CoffeeType, Integer> stock, CoffeeType type) {
        if (!stock.containsKey(type) || stock.get(type) <= 0) {
            throw new CoffeeMachineException("103 - OutOfIngredientsError: Stock limited " + type.getCoffeeName());
        }
    }
} 