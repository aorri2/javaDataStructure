package Hash;

import java.util.Objects;

public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        System.out.println("hashcode() called - hash : "+hash);
        return hash;
    }
}

