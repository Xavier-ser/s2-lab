import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo
{
    public static void main(String args[])
    {
        // 1. Create LinkedHashSet object to store Strings
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        // 2. Declare variables
        String el;
        int ch;

        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();
            sc.nextLine();   // clear input buffer

            switch(ch)
            {
                case 1:
                    // Add element
                    System.out.print("Enter element to insert: ");
                    el = sc.nextLine();

                    if(set.add(el))
                        System.out.println("Element added.");
                    else
                        System.out.println("Element already exists (duplicates not allowed).");
                    break;

                case 2:
                    // Remove element
                    System.out.print("Enter element to remove: ");
                    el = sc.nextLine();

                    if(set.remove(el))
                        System.out.println("Element removed.");
                    else
                        System.out.println("Element not found.");
                    break;

                case 3:
                    // Display set
                    System.out.println("LinkedHashSet: " + set);
                    break;

                case 4:
                    // Search element
                    System.out.print("Enter element to search: ");
                    el = sc.nextLine();

                    boolean contains = set.contains(el);

                    if(contains)
                        System.out.println("Element found in set.");
                    else
                        System.out.println("Element not found in set.");
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(ch != 0);

        sc.close();
    }
}