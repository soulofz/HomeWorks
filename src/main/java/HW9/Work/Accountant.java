package HW9.Work;

public class Accountant implements Jobtitleable {
    String title = "Accountant";
    String name = "Egor";

    @Override
    public void titleInfo() {
        System.out.println("Job-title of " + name + " is " + title + ".");
    }
}
