class Dbc{

 int a;
String Name;
public Dbc(){

  a=4;
  Name="Yash";

}
 public int GetId(){
    return a;

 }

}

public class construct {
    public static void main(String[] args) {
        Dbc cd=new Dbc();

     System.out.println(cd.GetId());

    }
}
