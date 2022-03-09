package cn.tang.application.modeTest.java8;

import lombok.*;


public class Employee {
    private  String name;
    private  String id;
    private  Integer age;

    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public Employee() {
    }

    public Employee(String name, String id, Integer age, Status status) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }

    public Employee(String name, String id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }
}


 enum Status{

    BUSY,
    FREE;

}