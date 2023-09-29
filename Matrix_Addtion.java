import java.util.Scanner;
public class MatrixAddition {
    public static void main(String args[]) {
        int rows,columns;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        rows = input.nextInt();
        System.out.println("Enter the no of columns:");
        columns = input.nextInt();
        int A[][]=new int [rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                A[i][j]=input.nextInt();
            }
        }
        int B[][]=new int [rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                B[i][j]=input.nextInt();
            }
        }
        int C[][]=new int [rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}