import java.util.Scanner;
public class MatrixMul {
    public static void main(String args[]) {
        int rows1,columns1,rows2,columns2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows for Matrix A:");
        rows1 = input.nextInt();
        System.out.println("Enter the no of columns for Matrix A:");
        columns1 = input.nextInt();
        
        System.out.println("Enter the no of rows for Matrix B:");
        rows2 = input.nextInt();
        System.out.println("Enter the no of columns for Matrix B:");
        columns2 = input.nextInt();
        
        int A[][]=new int [rows1][columns1];
        System.out.println("Enter the A Matrix values:");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns1;j++){
                A[i][j]=input.nextInt();
            }
        }
        int B[][]=new int [rows2][columns2];
        System.out.println("Enter the B Matrix values:");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<columns2;j++){
                B[i][j]=input.nextInt();
            }
        }
        int C[][]=new int [rows1][columns2];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns2;j++){
                for(int k=0;k<columns1;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Multiplication of the A matrix and B matrix is:");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns2;j++){
                    System.out.print(C[i][j]+"\t");
               }
               System.out.print("\n");
        }
    }
}