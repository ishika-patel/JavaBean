
/**
 * Write a description of class Adult here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adult extends Person
{
    private String job;
    private int salary;
    
    public Adult(String perName, int perAge, String perGender, String aJob, int aSalary) {
        super(perName, perAge, perGender);
        job = aJob;
        salary = aSalary;
    }
    
    public String toString() {
        return super.toString() + " Job: " + job + " Salary: " + salary;
}
}
