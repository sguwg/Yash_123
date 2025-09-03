package Interface;
//if one method in interface 
interface Interf1{
int x=112;//default publilc static variable
void method1();//default public abstract

}
interface Interf2{
int x=115;//default publilc static variable
void method3();//default public abstract

}


public class Test1 implements Interf1,Interf2 {
    public static void main(String[] args) {
        System.out.println("Main entry point");
    System.out.println(Interf1.x);
    int x=113;
    System.out.println(x);
    }
    public void method1(){
        System.out.println("This is method1");
    }
    public void method2(){

    }
    
}
