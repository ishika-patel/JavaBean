
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonDriver
{
    public static void main(String[] args) {
   Adult testingObject = new Adult("Mary", 26,"Female","Teacher", 35000);
   System.out.println(testingObject.toString());
   
   Child testingObject2 = new Child("George", 7, "male", "Pine Grove Elementary");
   System.out.println(testingObject2.toString());
   
   Child testingObject3 = new Child("Sue", 17, "Female", "Eastern High");
   System.out.println(testingObject3.toString());
}
}