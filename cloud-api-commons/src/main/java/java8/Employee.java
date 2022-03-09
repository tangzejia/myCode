package java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Employee {
   int id;
   String name;
   int age;
   double slaray;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSlaray() {
        return slaray;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSlaray(double slaray) {
        this.slaray = slaray;
    }

    public Employee() {
    }

    public Employee(int id, String name, int age, double slaray) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.slaray = slaray;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", slaray='" + slaray + '\'' +
                '}';
    }
}
