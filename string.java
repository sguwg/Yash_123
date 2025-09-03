import java.util.Scanner;
public class string{
    public static void main(String[]args){
    String name= "AGHVXMHBAasHGGGXMJGDH";
    name=name.toLowerCase();
    System.out.println(name);
    String text="a r y a n y a s h";
    text=text.replace(" ", "");
    text=text.replace("y","a");
    System.out.println(text);
    String letter="Dear <|name|>,thanks a name!";
    letter=letter.replace("<|name|>", "Yash");
    System.out.println(letter);
    String index= "GFHSGFASJ  AGvhhsgx   gfhjjnb";
    System.out.println(index.indexOf("  "));
    System.out.println(index.indexOf("    "));
    String space="Dear Yash,\n\t this java course is good.\n\t Thanks.";
    System.out.println(space);
    Scanner sc =new Scanner(System.in);
    String  or =sc.nextLine();
    System.out.println("Hello "+or+" ,How are you?");
    
    System.out.println(name.substring(3,20));
    System.out.println(name.lastIndexOf("xm",21));
}
}
