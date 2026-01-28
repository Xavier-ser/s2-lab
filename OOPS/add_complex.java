import java.util.Scanner;


public class add_complex {

    int real;
    int imag;

    add_complex(int r,int i){
        real=r;
        imag=i;
    }

static add_complex add(add_complex c1, add_complex c2){
    return new add_complex(c1.real+c2.real, c1.imag+c2.imag);
} 
void display(){
    System.out.print(real+ "+" + imag + "i");

}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter real part of first number : ");
    int r1= sc.nextInt();

     System.out.println("enter imaginary part of first number : ");
    int i1= sc.nextInt();

     System.out.println("enter real part of second number : ");
    int r2= sc.nextInt();

     System.out.println("enter imaginary part of second number : ");
    int i2= sc.nextInt();

    add_complex c1 = new add_complex(r1, i1);
    add_complex c2 = new add_complex(r2, i2);

    add_complex sum = add(c1,c2);

    System.out.println("sum : ");
    sum.display();

    sc.close();
}
    
}
