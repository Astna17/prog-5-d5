#  AUTOMATED COFFEE MACHINE (CLI)

##  Description

This project simulates an **automated coffee vending machine** with built-in payment functionality, running as a **Node.js CLI application**.

Users can:
-  Make a payment (`Pay`)
-  Select a drink: **Espresso**, **Cappuccino**, or **Hot Chocolate**
-  Receive the drink through the core business logic (`getCoffee`)

The system also handles key errors:
-  Insufficient payment
-  Out-of-stock drinks
-  Invalid choice

---

##  Requirements

To run this project, make sure you have the following:

- [Node.js](https://nodejs.org) (version **20.x.x** recommended)
- A terminal interface (Linux, macOS, or Windows CLI)
- Git (optional, for cloning the repository)

---

##  Launch Instructions

```bash
# 1. Clone the project
git clone https://github.com/Astna17/prog-5-d5.git

# 2. Enter the project directory
cd prog-5-d5

# 3. Run the CLI application
node index.js