package ayhan.model;

public class Devoloper {
    private String name;
    private int age;
    private double salary;
    private int workExperience;

    public Devoloper() {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workExperience = workExperience;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Devoloper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workExperience=" + workExperience +
                '}';
    }
}
