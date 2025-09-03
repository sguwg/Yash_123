abstract class costumer{
    String CID;
    double Bprice;
    abstract void getId(String CID);
    abstract void getPrice(double Bprice);


}
class costumer_1 extends costumer{

    @Override
    void getId(String i) {
        i= "CAB101";
    
    }

    @Override
    void getPrice(double a) {
        a=500;
        
    }

    int Replace( double Bprice){
        return  (int) (Bprice -200);

    }
}

class costumer_2 extends costumer{

    @Override
    void getId(String i) {
     
    }

    @Override
    void getPrice(double a) {
        
    
    }
    
}
public class test {

    public static void main(String[] args) {
        

    }
}
