package HW8.Сonstructor;

public class Dog {
    //Способ 1:
    //Данные по типу числа пи(вызываются без констуруктора)
    public static final String EAT = "Meat.";
    public static final String VOICE = "Woof.";

    //Способ 2:
    // Приватный конструктор(чтобы нельзя было создать.)
   private Dog(){
   }
   //Публичные методы(без обращения к объекту)
   public static void eat(){
        System.out.println("Dog likes eat meat.");
   }
   public static void voice(){
       System.out.println("Dog says Woof!");
   }
}
