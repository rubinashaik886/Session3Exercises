import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.

        String input = JOptionPane.showInputDialog("Type Something");
        int userInput = Integer.parseInt(input);
        System.out.println(userInput + 1);

        //Parse the input as an int.
        //Print its value +1



        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.


    }
}
