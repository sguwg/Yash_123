class Employee{
int marks;
String name;
 
public void printMarks(){
  System.out.println(marks);  

}
public void getName(){
     System.out.println(name);

}


}


public class opps {
    public static void main(String[] args) {
        Employee yash=new Employee();
        Employee aryan=new Employee();
        yash.marks=32;
        yash.name="hbdjkwwkl";
        aryan.marks=79;
        aryan.name="hjhjbj";
        yash.printMarks();
        yash.getName();
        aryan.printMarks();
        aryan.getName();
    }
    
    
}
