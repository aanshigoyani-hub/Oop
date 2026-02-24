import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double wp = sc.nextDouble();
        System.out.println("Enter height in inches : ");
        double hi = sc.nextDouble();
        double wkg = wp * 0.45359237 ;
        double hm = hi * 0.0254 ;
        double bmi = wkg / (hm * hm) ;
        System.out.printf("Your BMI is : %.2f", bmi);
        sc.close();
    }
}
