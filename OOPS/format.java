import java.util.*; 
interface Bill  
{ 
int calculate(int qty, int price); 
} 
class Product implements Bill  
{ 
int pId; 
String name; 
int quantity; 
int unitPrice; 
int total; 
public int calculate(int qty, int price) 
{ 
return qty * price; 
} 
void read() 
{ 
Scanner sc=new Scanner(System.in); 
System.out.print("Enter Product ID: "); 
pId = sc.nextInt(); 
System.out.print("Enter Product Name: "); 
name = sc.next(); 
System.out.print("Enter Quantity: "); 
quantity = sc.nextInt(); 
System.out.print("Enter Unit Price: "); 
unitPrice = sc.nextInt(); 
total = calculate(quantity, unitPrice); 
} 
void display()  
{ 
System.out.println(pId + "\t" + name + "\t" + quantity + "\t" + unitPrice + 
"\t" + total); 
} 
} 
public class intfac 
{ 
public static void main(String[] args)  
{ 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter Order Number: "); 
int orderNo = sc.nextInt(); 
System.out.print("Enter Date: "); 
String date = sc.nextLine(); 
System.out.print("Enter number of products: "); 
int n = sc.nextInt(); 
Product[] p = new Product[n]; 
int netAmount = 0; 
for (int i = 0; i < n; i++)  
{ 
p[i] = new Product(); 
System.out.println("\nEnter details of product " + (i + 1)); 
p[i].read(); 
netAmount += p[i].total; 
} 
// Display Bill 
System.out.println("\nOrder No: " + orderNo); 
System.out.println("Date: " + date); 
System.out.println("---------------------------------------------"); 
System.out.println("ProductId\tName\tQty\tPrice\tTotal"); 
System.out.println("---------------------------------------------"); 
for (int i = 0; i < n; i++) { 
p[i].display(); 
} 
System.out.println("---------------------------------------------"); 
System.out.println("\t\t\tNet Amount: " + netAmount); 
} 
}