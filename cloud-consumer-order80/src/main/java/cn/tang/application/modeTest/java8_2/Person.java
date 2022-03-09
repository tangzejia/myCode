package cn.tang.application.modeTest.java8_2;

public class Person {

    private String name;
    private Integer age;
    private String hight;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHight() {
        return hight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public Person() {
    }

    public Person(String name, Integer age, String hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hight='" + hight + '\'' +
                '}';
    }
}
