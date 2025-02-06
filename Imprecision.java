
/**
 * Program to show imprecision with large numbers
 *
 * @author (your name)
 * @version (a version number or a date)
 * @since
 */
public class Imprecision
{
    public static void main (String[] args){
        double x = 12345.6789e200;
        double y,z;
        
        y=1/x;
        z=x*y;
        
        System.out.println("The value of x is: " + x);
        //do the same for y and z
        System.out.println("The value of 1-z is:" + (1-z)); 
    }
}
