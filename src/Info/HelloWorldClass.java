package Info;

class HelloWorldClass {
    //main метод
    // Комбинации: main, psvm
    public static void main(String[] args) {
        //Комбинации: sout

        //Целые числа:
        //byte
        //short
        //int*
        //long
        int age = 14; //Переменная(Характеристика)

        //Дробные:
        //float
        //double*
        double pi = 3.14;

        //boolean //true/false
        boolean isAdult = true;
        //char simbol
        char symbol = 'a';
        //Объектный тип String
        String name = "Dima";
        System.out.println(symbol);

        //Преобразование
        //Явное
        int weight = 100;
        double weight2 = (double) weight; //Если из дробного в целое, то уберет весь остаток(2,99 -> 2)
        System.out.println(weight2);
        //Неявное
        int height = 186;
        String info = height + " рост";
        System.out.println(info);

        //Арифметические переменные
        int a = 50;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b); // остаток от деления
        System.out.println(++a); // инкремент (сначала добавляет потом печатает)
        System.out.println(--a); // дикремент
        System.out.println(a++); // постинкремент (сначала распечатает, потом добавит)
        System.out.println(a--); // постдикремент

        //Операторы сравнивания
        System.out.println(a > b); //boolean (true/false)
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //Логические операторы
        System.out.println((a > b) && (1 == 1)); // &&-логическое И
        System.out.println((b > a) || (1 == 1)); // ||-логическое ИЛИ
        System.out.println(!false); // ! перед true/false - обратное действие

        a *= 2; // возьми а, умножь на 2 и запиши значение в а
        a /= 2; // возьми а, подели на 2 и запиши значение в а
        a += 2; // возьми а, прибавь на 2 и запиши значение в а
        a -= 2; // возьми а, вычти на 2 и запиши значение в а
        System.out.println(a);

        //Тернарный оператор(3)
        //(условие)?(true):(false);
        System.out.println(10 - 3 == 8 ? "Yes" : "No");

        //ctrl+alt+L - форматирование кода согласно JavaCodeConvension

        //Сканер
        //Scanner scanner = new Scanner(System.in);
        //int age = scanner.nextInt();  scanner.next(); - до пробела nextLine(); - всю строку
        //scanner.hasNextInt(); - проверяет введено ли Int
        //System.out.println(age);
        //scanner.close()
    }
}
