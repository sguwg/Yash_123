class Mymethods{
 private int id;
 private String name;

 public Mymethods(int i){
    id=i;
    name="vghjhbhj";
 }
 public Mymethods(String noName,int i){
    id =i ;
    
    name=noName;
 }
 public Mymethods(){
    id =97 ;
    name= "dhjbhjbhj";
 }
 public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        id = n;
    }
    public void setName(String i){
        name = i;
    }
}
class car extends Mymethods{
       
}
public class constructors {
    public static void main(String[] args) {
          // Mymethods yash= new Mymethods(68);
           Mymethods yash= new Mymethods();
    // yash.setId(45);
    // yash.setName("aryan");
    System.out.println(yash.getId());
    System.out.println(yash.getName());
    }
    
}
