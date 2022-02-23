package Aggregate;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Objects;

public class people implements Comparable{
    private String name;
    private int age;

    public people() {
    }

    public people(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof people) {
            people p = (people) o;
            if (this.name.equals(p.name) && this.age == p.age) ;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n1 = this.name.hashCode();
        int n2 = this.age;

        return n1+n2;
}


    @Override
    //先按姓名比较，再按年龄比较
    public int compareTo(Object o) {
        people p =(people) o;
        int n1 = this.getName().compareTo(p.getName());
        int n2 = this.age-p.age;
        return n1==0?n2:n1;
    }
}
