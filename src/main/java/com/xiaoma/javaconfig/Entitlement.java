package com.xiaoma.javaconfig;

/**
 *
 */
public class Entitlement {
    private String name;
    private int age;

    public Entitlement(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Entitlement() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Entitlement{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
