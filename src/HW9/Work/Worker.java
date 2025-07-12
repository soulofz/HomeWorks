package HW9.Work;

public class Worker implements Jobtitleable {
    String title = "Worker";
    String name = "Alex";

    @Override
    public void titleInfo() {
        System.out.println("Job-title of " + name + " is " + title + ".");
    }
}
