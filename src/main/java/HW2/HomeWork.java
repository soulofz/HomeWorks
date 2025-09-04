package HW2;

public class HomeWork {
    public static void main(String[] args) {
        // Task 1
        int b = 2;
        int c = 3;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);

        //Task 2
        int n = 32;
        int m = 10;
        System.out.println((n / 10) + (n % m));

        //Task 3
        int z = 398;
        int x = 10;
        System.out.println((z / 100) + (z / 10 % x) + (z % x));

        //Task 4
        double q = 5.7;
        int w = (int) (q + 0.5);
        System.out.println(w);

        //Task 5
        int o = 28;
        int p = 3;
        String info = (o / p) + " и " + (o % p) + " в остатке";
        System.out.println(info);

        //Task 6
        int f = 35290;
        int g = f % 60; //секунды
        int h = (f / 60) % 60; // минуты
        int j = f / 3600; //часы
        String time = j + ":" + h + ":" + g;
        System.out.println(time);

        //Task 7
        int s = 52;
        int r = s / 10;
        int y = s % 10;
        System.out.println(y + "" + r);
    }
}
