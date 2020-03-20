
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
        menuItem.setAccelerator(KeyStroke.getKeyStroke('s'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Open");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('o'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Import");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('i'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Delete");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("DEL"));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Exit");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('e'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menu = new JMenu("Edit");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Font Size");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('='));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Font Colour");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('c'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menu = new JMenu("Insert");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Image");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('g'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Text");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('t'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
    public void createDialogExample(String words){
        JDialog box = new JDialog(this);
        box.setBounds(400,400,150,70);
        TextArea area = new TextArea(words);
        box.add(area);
        box.toFront();
        box.setVisible(true);
        box.setTitle("Cube");
    }
    public void actionPerformed(ActionEvent e){
        String cmd=e.getActionCommand();
        switch (cmd) {
            case "Save" : 
                System.out.println("File Saved");
                createDialogExample("File Saved");
                break;
            case "Open" : 
                System.out.println("File Opened");
                createDialogExample("File Opened");
                break;
            case "Import" : 
                System.out.println("File Imported");
                createDialogExample("File Imported");
                break;
            case "Delete" : 
                System.out.println("File Deleted");
                createDialogExample("File Deleted");
                break;
            case "Exit" : 
                System.exit(0);
                break;
            case "Font Size" : 
                System.out.println("Font size");
                createDialogExample("Font Size");
                break;
            case "Font Colour" : 
                System.out.println("Font colour");
                createDialogExample("Font Colour");
                break;
            case "Image" : 
                System.out.println("Image Inserted");
                createDialogExample("Image Inserted");
                break;
            case "Text" : 
                System.out.println("Text");
                createDialogExample("Insert Text");
                break;
            default : 
                System.out.println("Invalid");
                createDialogExample("Invalid");
                break;
        }
    }
}
