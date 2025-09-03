import java.util.Scanner;
public class first{
    public static void main(String[] args){
        int i, j, k;
        Scanner sc=new Scanner(System.in);;
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Array[][][] = new int[a][b][c];
         for(i=0;i<c;i++)
            for(j=0;j<b;j++)
                for(k=0;k<a;k++)
                    Array[i][j][k]=i*j*k;
        for(i=0;i<c;i++){
            for(j=0;j<b;j++){
                for(k=0;k<a;k++)
                System.out.print(Array[i][j][k] + " ");
                System.out.println();

            }System.out.println();
        }
                 

    }
}

