package HW6;

public class ATM {
    int count20;
    int count50;
    int count100;

    ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    ATM() {
        this.count20 = 0;
        this.count50 = 0;
        this.count100 = 0;
    }

    void deposit(int add20, int add50, int add100) {
        this.count20 = count20 + add20;
        this.count50 = count50 + add50;
        this.count100 = count100 + add100;
        System.out.println("В банкомат внесено:");
        System.out.println(add20 + " купюр номиналом 20 рублей, " + add50 + " купюр номиналом 50 рублей, " + add100 + " купюр номиналом 100 рублей, ");
    }

    boolean withdraw(int addcash) {
        System.out.println("Запрос на сумму снятия " + addcash + " рублей");
        for (int need100 = Math.min(addcash, count100); need100 >= 0; need100--) {
            for (int need50 = Math.min((addcash - need100 * 100) / 50, count50); need50 >= 0; need50--) {
                int remaining = addcash - need100 * 100 - need50 * 50;
                if (remaining % 20 != 0) {
                    continue;
                }
                int need20 = remaining / 20;
                if (need20 <= count20) {
                    count100 -= need100;
                    count50 -= need50;
                    count20 -= need20;
                    System.out.println("Успешная выдача " + addcash + " рублей." + "\nВыдано купюр:");
                    if (need100 > 0) {
                        System.out.println("Номиналом 100 рублей - " + need100);
                    }
                    if (need50 > 0) {
                        System.out.println("Номиналом 50 рублей - " + need50);
                    }
                    if (need20 > 0) {
                        System.out.println("Номиналом 20 рублей - " + need20);
                    }
                    return true;
                }
            }
        }
        System.out.println("Невозможно снять сумму.");
        return false;
    }

    void info() {
        System.out.println("В банкомате купюры:");
        if (count20 > 0) {
            System.out.println("Номиналом 20 рублей - " + count20);
        }
        if (count50 > 0) {
            System.out.println("Номиналом 50 рублей - " + count50);
        }
        if (count100 > 0) {
            System.out.println("Номиналом 100 рублей - " + count100);
        }
    }
}

//СПОСОБ СНИЗУ РАБОТАЕТ НЕКОРРЕКТНО

//        int need100 = Math.min(addcash / 100, count100);
//        addcash -= need100 * 100;
//        int need50 = Math.min(addcash / 50, count50);
//        addcash -= need50 * 50;
//        int need20 = Math.min(addcash / 20, count20);
//        addcash -= need20 * 20;
//        if (addcash == 0) {
//            count100 -= need100;
//            count50 -= need50;
//            count20 -= need20;
//            System.out.println("Успешная выдача " + cash + " рублей." + "\nВыдано купюр:");
//            if (need100 > 0) {
//                System.out.println("Номиналом 100 рублей - " + need100);
//            }
//            if (need50 > 0) {
//                System.out.println("Номиналом 50 рублей - " + need50);
//            }
//            if (need20 > 0) {
//                System.out.println("Номиналом 20 рублей - " + need100);
//            }
//            return true;
//        } else {
//            System.out.println("Невозможно снять сумму");
//            return false;
//        }
//    }
//}
