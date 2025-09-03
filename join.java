

public class join {
     final public static void main(String[] args) {
     System.out.println("Hi cs d");
for(int i=0;i< args.length;i++){
    System.out.println(args[i]);
}
        
    }
}
class Aa{
    public static void main(String[] args) {
        System.out.println("Aa data");
        join.main(new String[]{"Hello","yash"});
    }
}
