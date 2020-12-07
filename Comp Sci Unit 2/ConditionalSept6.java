
/**
 * ConditionalSept6 Letter Grade
 *
 * Ishika Patel
 * Sept 6
 */
public class ConditionalSept6
{
    public static void main (String[] args)
    {
    int testScore = 42;
    if (testScore >= 90)
    { 
        System.out.println("Grade A");
    } else {
        if (testScore < 90 && testScore >= 80)
        { 
            System.out.println("Grade B");
        } else {
            if (testScore < 80 && testScore >=70)
            {
                System.out.println("Grade C");
            } else {
                if (testScore < 70 && testScore >= 60)
                {
                    System.out.println("Grade D");
} else {
    System.out.println("Grade F");
}
}
}
}
}
}