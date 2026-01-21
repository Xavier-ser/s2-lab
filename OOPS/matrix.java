import java.util.Scanner;

public class matrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the no. of cols: ");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int c[][] = new int[rows][cols];

        System.out.println("Enter the elements of first matrix: ");
        for (int i = 0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print("Enter the element " + i+j +": ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix: ");
        for (int i = 0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print("Enter the element " + i+j +": ");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<rows; i++){
            for (int j=0; j<cols; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of the matrices: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<rows; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
