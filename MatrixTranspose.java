import java.util.Scanner;
public class MatrixTranspose{
    public static void main(String args[]){
        int rows,columns;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        rows=sc.nextInt();
        System.out.println("Enter the no of columns:");
        columns=sc.nextInt();
        int A[][]= new int[rows][columns];
        int T[][]= new int[rows][columns];
        System.out.println("Enter the values of Matrix A:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                A[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                T[i][j]=A[j][i];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(T[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}