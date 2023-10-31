package homework_week_8.encapsulation26;

public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    // set method for roll to access private variable
    //rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    // set method for age to access private variable
    //age
    public void setAge(int age) {
        this.age = age;
    }

}
