
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        x = 0;
        
        Scanner inputStream = new Scanner(System.in);
        System.out.println("The window is called:");
        String windowName = inputStream.nextLine();
        System.out.println("The dimensions are:");
        int dimensionsX = Integer.parseInt(inputStream.nextLine());
        int dimensionsY = Integer.parseInt(inputStream.nextLine());
        
        setTitle(windowName);
        
        this.getContentPane().setPreferredSize(new Dimension(dimensionsX,dimensionsY));
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
