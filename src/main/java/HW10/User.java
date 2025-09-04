package HW10;

import java.util.Objects;
import java.util.Random;

public class User implements Cloneable {
    private String name;
    private String surname;
    private int age;
    private Id id;

    User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        Random random = new Random();
        this.id = new Id(random.nextInt(0, 100_000_000));
    }

    User() {
        Random random = new Random();
        this.id = new Id(random.nextInt(0, 100_000_000));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected User deepClone() throws CloneNotSupportedException {
        User clone = new User(this.name, this.surname, this.age);
        clone.id = new Id(id.getValue());
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Id getId() {
        return id;
    }

    public void setId(int value) {
        id.setValue(value);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}