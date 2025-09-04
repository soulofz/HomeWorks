package HW9.Work;

public class Director implements Jobtitleable {
    String title = "Director";
    String name = "Dima";

    @Override
    public void titleInfo() {
        System.out.println("Job-title of " + name + " is " + title + ".");
    }
}
