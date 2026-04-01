import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo
{
    public static void main(String args[])
    {
        // 1. Create PriorityQueue object to store Strings
        PriorityQueue<String> q = new PriorityQueue<String>();

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
            System.out.println("4. Head (Peek)");
            System.out.println("5. Poll");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch(ch)
            {
                case 1:
                    // Add element
                    System.out.print("Enter element to insert: ");
                    el = sc.nextLine();
                    q.add(el);
                    System.out.println("Element added.");
                    break;

                case 2:
                    // Remove specific element
                    System.out.print("Enter element to remove: ");
                    el = sc.nextLine();
                    if(q.remove(el))
                        System.out.println("Element removed.");
                    else
                        System.out.println("Element not found.");
                    break;

                case 3:
                    // Display queue
                    System.out.println("Priority Queue: " + q);
                    break;

                case 4:
                    // Display head using peek()
                    if(q.isEmpty())
                        System.out.println("Queue is empty.");
                    else
                        System.out.println("Head element: " + q.peek());
                    break;

                case 5:
                    // Remove and return head using poll()
                    if(q.isEmpty())
                        System.out.println("Queue is empty.");
                    else
                        System.out.println("Removed head: " + q.poll());
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Wrong choice.");
            }

        } while(ch != 0);

        sc.close();
    }
}