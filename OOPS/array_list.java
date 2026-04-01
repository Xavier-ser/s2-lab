import java.util.*;
import java.util.Scanner;

public class array_list
{
    public static void main(String args[])
    {
        // 1. Create empty ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();

        // 2. Declare variables
        String el;
        int ch;

        Scanner sc = new Scanner(System.in);

        // 3. Start do-while loop
        do
        {
            // 4. Display menu
            System.out.println("\n------ MENU ------");
            System.out.println("1. Add Element");
            System.out.println("2. Display Size");
            System.out.println("3. Get Element by Index");
            System.out.println("4. Find Index of Element");
            System.out.println("5. Check Element Exists");
            System.out.println("6. Remove Element by Value");
            System.out.println("7. Remove Element by Index");
            System.out.println("8. Display List");
            System.out.println("9. Clear List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();
            sc.nextLine(); // consume newline

            // 5. Perform operations based on choice
            switch(ch)
            {
                case 1:
                    System.out.print("Enter element to add: ");
                    el = sc.nextLine();
                    list.add(el);
                    System.out.println("Element added.");
                    break;

                case 2:
                    System.out.println("Size of ArrayList: " + list.size());
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int index1 = sc.nextInt();
                    if(index1 >= 0 && index1 < list.size())
                        System.out.println("Element at index " + index1 + ": " + list.get(index1));
                    else
                        System.out.println("Invalid index.");
                    break;

                case 4:
                    System.out.print("Enter element to find index: ");
                    el = sc.nextLine();
                    int pos = list.indexOf(el);
                    if(pos != -1)
                        System.out.println("Element found at index: " + pos);
                    else
                        System.out.println("Element not found.");
                    break;

                case 5:
                    System.out.print("Enter element to check: ");
                    el = sc.nextLine();
                    if(list.contains(el))
                        System.out.println("Element exists in list.");
                    else
                        System.out.println("Element does not exist.");
                    break;

                case 6:
                    System.out.print("Enter element to remove: ");
                    el = sc.nextLine();
                    if(list.remove(el))
                        System.out.println("Element removed.");
                    else
                        System.out.println("Element not found.");
                    break;

                case 7:
                    System.out.print("Enter index to remove: ");
                    int index2 = sc.nextInt();
                    if(index2 >= 0 && index2 < list.size())
                    {
                        list.remove(index2);
                        System.out.println("Element removed.");
                    }
                    else
                        System.out.println("Invalid index.");
                    break;

                case 8:
                    System.out.println("ArrayList: " + list);
                    break;

                case 9:
                    list.clear();
                    System.out.println("ArrayList cleared.");
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