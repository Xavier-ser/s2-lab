import java.util.*; 
public class d2multi 
{ 
public void main() 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the number of rows and column of first array"); 
int row1=sc.nextInt(); 
int col1=sc.nextInt(); 
System.out.println("Enter the number of rows and column of second 
array"); 
int row2=sc.nextInt(); 
int col2=sc.nextInt(); 
int i ,j,k; 
if(col1!=row2) 
System.out.println(" Matrix multiplication not possible"); 
else 
{ 
int a[][]=new int[row1][col1]; 
int b[][]=new int[row2][col2]; 
int c[][]=new int[row1][col2]; 
System.out.println("Enter the elements of first array"); 
for(i=0;i<row1;i++) 
{ 
for(j=0;j<col1;j++) 
{ 
            a[i][j]=sc.nextInt(); 
        } 
    } 
         
         System.out.println("Enter the elements of second array"); 
        for(i=0;i<row2;i++) 
        { 
            for(j=0;j<col2;j++) 
            { 
            b[i][j]=sc.nextInt(); 
        } 
    } 
        for(i=0;i<row1;i++) 
        { 
            for(j=0;j<col2;j++) 
            { 
            c[i][j]=0; 
            for(k=0;k<col1;k++) 
            { 
                c[i][j]+=a[i][k]*b[k][j]; 
            } 
            } 
         } 
            System.out.println("the two matrix are"); 
        for(i=0;i<row1;i++) 
        { 
            for(j=0;j<col1;j++) 
            { 
            System.out.print(a[i][j]+" "); 
} 
System.out.println(); 
} 
for(i=0;i<row2;i++) 
{ 
for(j=0;j<col2;j++) 
{ 
System.out.print(b[i][j]+" "); 
} 
System.out.println(); 
} 
for(i=0;i<row1;i++) 
{ 
for(j=0;j<col2;j++) 
{ 
System.out.print(c[i][j]+" "); 
} 
System.out.println(); 
} 
} 
} 
}