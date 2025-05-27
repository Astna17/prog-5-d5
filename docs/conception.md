 Coffee Machine – System Design
1.  MAIN COMPONENTS
🔹 pay – Payment Module
Role: Validate and register a payment before allowing coffee selection.
CLI 
Input: Payment amount
Output: Payment status (validated / rejected)

🔹 c2, c3, c4 – Coffee Choices
c2: Espresso

c3: Cappuccino

c4: Hot Chocolate

🔹 getCoffee() – Business Logic
Checks if the payment is valid

Verifies that the selected drink is in stock

Triggers coffee preparation and delivers it to the user

2.  USE CASES
UC1: Pay for a drink
Actor: User
Goal: Insert an amount to unlock access to drinks

UC2: Choose a drink
Actor: User
Goal: Select a valid drink option (c2, c3, c4)

UC3: Receive the drink
Actor: User + Machine
Goal: Get the prepared beverage from the machine

UC4: Handle an error
Actor: Machine
Goal: Detect and display any issues (invalid input, insufficient funds)

3.  HANDLED ERRORS
EG1	Insufficient payment	"Insufficient amount. Please try again."
EG2	Out of stock	"This drink is currently unavailable."
EG3	Invalid choice	"Unknown option. Please try again."

4.  OBJECT MODEL
 Class: Coffee
name	String	Name of the drink
price	Float	Price in euros
stock	Int	Available quantity

 Class: CoffeeMaker
drinks	Map<String, Coffee>	List of available coffees

Methods:

getCoffee(drinkName: string): string

displayChoices(): void

 Class: Payment
amount	Float	Amount inserted by user

Method:

isSufficient(price: float): boolean