import java.util.Scanner;
public class marks {
    public static void main(String [] args){

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Marks of first subject: ");
        float a =sc.nextFloat();
        System.out.println("Marks of second subject: ");
        float b=sc.nextFloat();
        System.out.println("Marks of third subject: ");
        float c=sc.nextFloat();
        System.out.println("Marks of fourth subject: ");
        float d=sc.nextFloat();
        System.out.println("Marks of fifth subject: ");
        float e=sc.nextFloat();
        float percent = ((a+b+c+d+e)/500)*100;
        System.out.println(percent);
    }
    }
}
