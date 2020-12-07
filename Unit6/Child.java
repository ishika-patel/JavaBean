
/**
 * Write a description of class Child here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Child extends Person
{
private String school;

    public Child(String perName, int perAge, String perGender, String cSchool) {
        super(perName, perAge, perGender);
        school = cSchool;
    }
    
    public String toString() {
        return super.toString() + " School: " + school;
}
}
