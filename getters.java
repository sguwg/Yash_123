class group{
    private int id;
    private String name;
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
public class getters {
public static void main(String[] args) {
    group yash= new group();
   // yash.id=45;
    //yash.name="aryan";-->throws error due to private access modifier
    yash.setId(45);
    yash.setName("aryan");
    System.out.println(yash.getId());
    System.out.println(yash.getName());
}

    
    
}