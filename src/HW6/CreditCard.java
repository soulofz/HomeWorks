package HW6;

import java.util.Random;

public class CreditCard {
    int accNumber;
    double accBalance;

    CreditCard(int accNumber, double accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    CreditCard() {
        Random random = new Random();
        int max = Integer.MAX_VALUE;
        this.accNumber = random.nextInt(0, max);
        this.accBalance = 0;
    }

    CreditCard(double accBalance) {
        Random random = new Random();
        int max = Integer.MAX_VALUE;
        this.accNumber = random.nextInt(0, max);
        this.accBalance = accBalance;
    }

    void deposit(double cash) {
        if (cash > 0) {
            accBalance += cash;
            System.out.println("Зачислено: " + cash + " рублей");
        } else {
            System.out.println("Сумма должна быть положительной.");
        }
    }

    void withdraw(double cash) {
        if (cash < 0) {
            System.out.println("Сумма должна быть положительной.");
        } else if (accBalance < cash) {
            System.out.println("Недостаточно средств.");
        } else {
            accBalance -= cash;
            System.out.println("С вашего баланса снято " + cash + " рублей.");
        }
    }

    void info() {
        System.out.println("Номер счета: " + accNumber);
        System.out.println("Текущий баланс: " + accBalance + " рублей");
    }
}
