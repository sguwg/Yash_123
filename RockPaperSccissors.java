import java.util.Random;
public class RockPaperSccissors {
    public static void main(String[] args) {
        int Rock=0, Paper=1, Scissors=2;
        Random num= new Random();
        int number=num.nextInt(3);
        int select=num.nextInt(3);
        System.out.println(number);
        System.out.println(select);
        // Rock vs Rock -->draw
        //Paper vs rock -->Paper wins
        //Sccissors vs Rock--> Rock wins
        //paper vs Sccissors -->Sccissors win
        //paper vs paper-->draw
        //sccissors vs sccissors-->draw
        if(number==Rock && select==Rock){
            System.out.println("Draw");
        } else if(number==Paper && select == Rock){
          System.out.println("Paper wins");

        }else if(number==Scissors && select==Rock){
            System.out.println("Rock wins");
        }else if(number==Rock && select==Paper){
            System.out.println("Paper wins");
        }else if(number==Paper && select==Paper){
            System.out.println("Draw");

        }else if(number==Scissors && select==Paper) {

         System.out.println("Paper wins");
        }else if(number==Rock && select==Scissors){
         System.out.println("Rock wins");
        }else if(number==Paper && select==Scissors){
            System.out.println("Scissors");
        }else if(number==Scissors && select==Scissors){
            System.out.println("Draw");
        }
        
    }

    
}
