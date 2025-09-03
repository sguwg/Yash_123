public class methods {

     static int sum(int a, int b){
        int z;
        if(a>b){
            z=a+b;
        }
        else{
            z=a*b+a;
        }
        return z;

    }
    public static void main(String[] args) {
        int x=6;
        int y=7;
        int c;
        c=sum(x,y);
        System.out.println(c);
    }
    
}
