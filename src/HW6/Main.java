package HW6;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard(528394, 500.8);
        CreditCard card3 = new CreditCard(789.6);
        card1.deposit(500.5);
        card2.deposit(100.0);
        card3.withdraw(500.0);
        System.out.println();
        card1.info();
        System.out.println();
        card2.info();
        System.out.println();
        card3.info();
        System.out.println();
        ATM atm = new ATM(5, 5, 5);
        boolean resultAtm = atm.withdraw(610);
        System.out.println();
        System.out.println(resultAtm);
        atm.info();
    }
}