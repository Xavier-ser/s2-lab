import java.util.ArrayList;
import java.util.Scanner;

// --------------------------------------------
// Generic Stack Class
// --------------------------------------------
class stack<T>
{
    ArrayList<T> A;   // ArrayList to store elements
    int top;          // index of top element
    int size;         // maximum size of stack

    // Constructor
    stack(int size)
    {
        this.size = size;
        this.top = -1;
        A = new ArrayList<T>(size);
    }

    // Push method
    void push(T element)
    {
        if(top + 1 == size)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            top++;
            if(A.size() > top)
                A.set(top, element);
            else
                A.add(element);
        }
    }

    // Top method
    T top()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return null;
        }
        else
        {
            return A.get(top);
        }
    }

    // Pop method
    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            top--;
        }
    }

    // Empty method
    boolean empty()
    {
        return (top == -1);
    }

    // toString method
    public String toString()
    {
        if(top == -1)
            return "Stack is Empty";

        String str = "";

        for(int i = 0; i < top; i++)
        {
            str += A.get(i) + " -> ";
        }

        str += A.get(top);

        return str;
    }
}


// --------------------------------------------
// Main Class
// --------------------------------------------
public class generic_stack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Read maximum size
        System.out.print("Enter maximum size of stack: ");
        int size = sc.nextInt();

        // Create stack of Integer type
        stack<Integer> s = new stack<Integer>(size);

        // Push elements
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element: ");
            int element = sc.nextInt();
            s.push(element);
        }

        // Print stack
        System.out.println("Stack after pushing elements:");
        System.out.println(s);

        // Pop one element
        s.pop();

        // Print stack after pop
        System.out.println("Stack after popping one element:");
        System.out.println(s);
    }
}