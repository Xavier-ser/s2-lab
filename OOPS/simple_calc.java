import java.awt.*;
import java.awt.event.*;

class SimpleCalculator extends Frame implements ActionListener
{
    // Text field
    TextField textField;

    // Buttons
    Button[] numberButtons = new Button[10];
    Button[] operationButtons = new Button[4];
    Button equalsButton, clearButton;

    // Variables for calculation
    double num1, num2, result;
    char operation;

    // Constructor
    SimpleCalculator()
    {
        // Set title and size
        setTitle("Simple Calculator");
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Create text field
        textField = new TextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Create panel with GridLayout
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Create number buttons (0-9)
        for(int i = 0; i < 10; i++)
        {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create operation buttons
        String[] operations = {"+", "-", "*", "/"};
        for(int i = 0; i < 4; i++)
        {
            operationButtons[i] = new Button(operations[i]);
            operationButtons[i].addActionListener(this);
        }

        // Create equals and clear buttons
        equalsButton = new Button("=");
        equalsButton.addActionListener(this);

        clearButton = new Button("C");
        clearButton.addActionListener(this);

        // Add buttons to panel (layout 4x4)
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(operationButtons[0]); // +

        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(operationButtons[1]); // -

        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(operationButtons[2]); // *

        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(clearButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(operationButtons[3]); // /

        add(buttonPanel, BorderLayout.CENTER);

        // Window closing event
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    // Action Listener Method
    public void actionPerformed(ActionEvent ae)
    {
        String command = ae.getActionCommand();

        // If digit pressed
        if(command.charAt(0) >= '0' && command.charAt(0) <= '9')
        {
            textField.setText(textField.getText() + command);
        }

        // If Clear pressed
        else if(command.equals("C"))
        {
            textField.setText("");
        }

        // If Equals pressed
        else if(command.equals("="))
        {
            num2 = Double.parseDouble(textField.getText());

            switch(operation)
            {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            textField.setText(String.valueOf(result));
        }

        // If Operation pressed
        else
        {
            num1 = Double.parseDouble(textField.getText());
            operation = command.charAt(0);
            textField.setText("");
        }
    }

    // Main Method
    public static void main(String args[])
    {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setVisible(true);
    }
}