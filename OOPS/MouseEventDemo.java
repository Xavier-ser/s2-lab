import javax.swing.*;
import java.awt.event.*;

class MouseEventDemo extends JFrame
{
    // Constructor
    MouseEventDemo()
    {
        // Set title
        setTitle("Mouse Events Demo");

        // Set size
        setSize(400, 300);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add MouseListener using MouseAdapter
        addMouseListener(new MouseAdapter()
        {
            // Mouse Clicked
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            // Mouse Pressed
            public void mousePressed(MouseEvent e)
            {
                System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            // Mouse Released
            public void mouseReleased(MouseEvent e)
            {
                System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            // Mouse Entered
            public void mouseEntered(MouseEvent e)
            {
                System.out.println("Mouse Entered at: (" + e.getX() + ", " + e.getY() + ")");
            }

            // Mouse Exited
            public void mouseExited(MouseEvent e)
            {
                System.out.println("Mouse Exited at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Add WindowListener using WindowAdapter
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Window is closing...");
            }
        });
    }

    // Main method
    public static void main(String[] args)
    {
        // Ensure GUI is created in Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                MouseEventDemo frame = new MouseEventDemo();
                frame.setVisible(true);
            }
        });
    }
}