
/**
 * Write a description of class Task2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task2
{
   public static void main(String[] args){
     String[][] names = {{"Chelsea", "Jimmy", "Paul"}, {"Sam", "Ruby", "Crystal"}, {"Billy", "Bob", "Tucker"}, {"Kami", "Devonte", "Leslie"},{"Cornelius", "Sara", "Mark"}};
     int count=0;
     for (int r=0; r<names.length; r++)
        for(int c=0; c<names[0].length; c++){
            if(names[r][c].startsWith("C") || names[r][c].startsWith("c")){
           count++;     
        }
}
System.out.print(count);
}
}