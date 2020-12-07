
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age;
    private String gender;

    public Person(String perName, int perAge, String perGender) {
        name = perName;
        age = perAge;
        gender = perGender;
    }
    
    public String toString() {
        return "Name: " + name + " Age: " + age + " Gender: " + gender;
    
    }
}
