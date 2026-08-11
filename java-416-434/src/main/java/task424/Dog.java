package task424;

public class Dog {
    private int age;

    public int getAge() {return age;}

    public void setAge(int age) {
        if (age>0) this.age = age;
        else this.age=0;
    }
}
