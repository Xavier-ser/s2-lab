import java.util.Scanner;

public class matrix_symmetric_or_not {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows and columns: ");
        int rows = sc.nextInt();

        int a[][] = new int[rows][rows];
    
        System.out.println("Enter the elements of first matrix: ");
        for (int i = 0; i<rows; i++){
            for (int j=0; j<rows; j++){
                System.out.print("Enter the element " + i+j +": ");
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();


        int flag=0;
        for (int i = 0; i<rows; i++){
            for (int j=0; j<rows; j++){

                if (a[i][j] != a[j][i]){
                    flag = 1;
                }
            }
        }
        

        if( flag == 0){
            System.out.println("haiiii matrix symmetric ayalloooo ( ◠‿◠ ) ");
        }

        if(flag != 0){
            System.out.println("Ayyoo matrix symmetric aayilla (¬_¬\") ");
        }
    }

}