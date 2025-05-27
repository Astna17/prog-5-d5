CONCEPTION DU SYSTÈME – Machine à Café


 1. COMPOSANTS PRINCIPAUX
 pay   - Module de Paiement

Rôle : Valider et enregistrer un paiement avant de permettre l'accès au café.

Technos possibles : simulateur de paiement, ou insertion de pièces.

Entrée : Montant 

Sortie : État du paiement (validé / refusé)

c2, c3, c4 – Choix du café
c2 : Expresso

c3 : Cappuccino

c4 : Chocolat chaud

getCoffee() – Business Logic
Vérifie que le paiement est validé.

Vérifie que les stocks sont suffisants.

Déclenche la fabrication de la boisson.


 2. USE CASES 
UC1 : Payer une boisson -> User
UC2 : Choissir une boisson -> User
UC3 : Recevoir la boisson -> Machine/User
UC4 : Gérer une erreur -> Machine


 3. ERREURS GÉRÉES
EG1 : Payment insuffisant -- "Montant insuffisant, veulliez réessayer." --
EG2 : Stock de boisson vide -- "Boisson indisponible actuellement." --
EG3 : Choix invalide -- "Option non reconnue, Réessayez." --

 4. Modèle Objet
    - Classe Coffee:
        name : String
        price : float
        stock : int

    - CLasse CoffeMaker:
        drinks : Map<String, Coffee>
        *Méthode*
        getCoffee
        displayChoice

    - Class Payment
        amount : float 
        *Méthode*
        isSufficient
