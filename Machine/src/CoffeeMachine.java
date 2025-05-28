import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
    private int balance = 0;
    private CoffeeType selectedCoffee;
    private final Map<CoffeeType, Integer> stock;

    public CoffeeMachine() {
        stock = new HashMap<>();
        for (CoffeeType type : CoffeeType.values()) {
            stock.put(type, 5); 
        }
    }

    public void pay(int amount) {
        balance += amount;
        System.out.println(" Paiement reçu : " + amount + " unité(s). Solde actuel : " + balance);
    }

    public void select(String input) {
        CoffeeErrorManager.checkSelection(input);
        CoffeeType type = CoffeeType.valueOf(input.toUpperCase());

        CoffeeErrorManager.checkBalance(balance, type);
        CoffeeErrorManager.checkStock(stock, type);

        selectedCoffee = type;
        stock.put(type, stock.get(type) - 1); 
        System.out.println(" " + type.getCoffeeName() + " sélectionné.");
    }

    public void dispense() {
        if (selectedCoffee == null) {
            throw new CoffeeMachineException("104 - MachineError: Aucune boisson sélectionnée.");
        }

        balance -= selectedCoffee.getPrice();
        System.out.println(" Votre " + selectedCoffee.getCoffeeName() + " est prêt !");
        selectedCoffee = null;
    }
}
