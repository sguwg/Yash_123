import java.util.Scanner;
public class sum{

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b && a>c){
            System.out.println("Greatest:"+a);
        }else{

        
        if(b>c){
            System.out.println("Greatest"+b);
        }
        else{
            System.out.println("Greatest:"+c);
    }
}
}
}
 class FSum{
    public static void main(String[] args) {
        int i;
        int count=0;
        int sum =0;
        for (i=1; i<100 ;i++){
            if(i%2 !=0){
               count++;
               sum+=i;
            }
        }
        System.out.println("SUM of 1 to 100 odd no is:"+ sum);
    }
}

class smallest{
    public static void main(String[] args) {
        int a[] =new int[5];
         a[0]= 0;
         a[1]=7;
         a[3]=9;
         a[4]=12;
         int i;
        int smallest=a[1];
        int largest= a[0];
        for(i=0;i<5;i++){
        if(smallest > a[i]){

            smallest=a[i];
        } 
        if(largest < a[i]){
            largest =a[i];
        }

        }
        System.out.println("Smallest:"+smallest);
        System.out.println("Largest:"+largest);
        
    }
}


 class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Count characters
        int count = str.length();
        System.out.println("Number of characters: " + count);
        
        // Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
        
        // Check for palindrome (ignoring case)
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        sc.close();
    }
}
 class SumCommandLine {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through all command-line arguments
        for (int i = 0; i < args.length; i++) {
            // Convert each argument from String to int
            sum += Integer.parseInt(args[i]);
        }

        // Display the sum
        System.out.println("Sum of command line arguments: " + sum);
    }
}

