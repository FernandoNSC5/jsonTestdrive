package gson.object;

public class Person {

    private String name;
    private Character gender;
    private int age;

    public Person(String pName, Character pGender, int pAge)
    {
        this.name = pName;
        this.gender = pGender;
        this.age = pAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getName() + " "
                + getGender() + " "
                + getAge();

    }

}
