class A1{
    void a1(){
        System.out.println("Coming from n1 Method");

    }
    class B1 extends A1{
        @Override
        void a1(){
            System.out.println("Coming from a2 method");

        }
        
    }


}
public class DynaPoly {
    public static void main(String[] args) {
        System.out.println("A");
        A1  b1 =new B1();
        b1.a1();
    }
    
}
