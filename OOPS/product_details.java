// class Product{
//     int pcode;
//     String pname;
//     int price;

//     Product(int pcode, String pname, int price){
//         this.pcode = pcode;
//         this.pname = pname;
//         this.price = price;
//     }


// }

// public class Abhay_Product {
//     public static void main(String [] args){
//         Product p1 = new Product(101, "13 Pro", 80000);
//         Product p2 = new Product(101, "14 Pro", 100000);
//         Product p3 = new Product(101, "15 Pro", 1200000);
        

//         Product lowest = p1;

//         if(p2.price < lowest.price){
//             lowest = p2;

//         }

//         if(p3.price < lowest.price){
//             lowest = p3;
//         }

//         System.out.println("Product with lowest price: ");
//         System.out.println("Price : " + lowest.price);
//         System.out.println("Name : " + lowest.pname);
//         System.out.println("Code : " + lowest.pcode);


//     }
// }

class product {
 
    int pcode;
    String pname;
    int price;

    product(int pcode, String pname, int price){
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

}

public class product_details{
    public static void main (String [] Args){
        product p1= new product(101,"Alchemist",100);
        product p2 = new product(102,"Rich Dad Poor Dad",1000);
        product p3 = new product(103,"Ikigai",69);
        
        
        product lowest = p1;

        if(p2.price<lowest.price){
            lowest = p2;
        }

        if(p3.price<lowest.price){
            lowest = p3;
        }

        System.out.println("book with lowest price ");
        System.out.println("book code :" + lowest.pcode);
        System.out.println("book name :" + lowest.pname);
        System.out.println("book price :" + lowest.price);
        

        



    }
    



}