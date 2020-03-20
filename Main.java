
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener 
{
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("The window is called:");
        String windowName = inputStream.nextLine();
        System.out.println("The dimensions are:");
        int dimensionsX = Integer.parseInt(inputStream.nextLine());
        int dimensionsY = Integer.parseInt(inputStream.nextLine());
        
        setTitle(windowName);
        
        this.getContentPane().setPreferredSize(new Dimension(dimensionsX,dimensionsY));
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        
        menu = new JMenu("File");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Save");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Open");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Import");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menu = new JMenu("Edit");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Delete");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("New...");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Transform");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String cmd=e.getActionCommand();
        System.out.println("Task completed");
    }
}
