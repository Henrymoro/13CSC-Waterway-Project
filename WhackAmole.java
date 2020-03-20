
/**
 * Write a description of class WhackAmole here.
 *
 * @author Molly Henry
 * @version V2 4/03/20
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
import java.util.Random;

public class WhackAmole extends JFrame implements ActionListener,MouseListener 
{
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    Scanner inputStream = new Scanner(System.in);
    
    Canvas theGraphic;
    
    int x = 350;
    int y = 350;
    
    Random random = new Random(); 
    
    final String fileName = "covid-19.png";
    ImageIcon image = new ImageIcon(fileName);
    /**
     * Constructor for objects of class WhackAmole
     */
    public WhackAmole()
    {
        
        
        setTitle("My Window");
        
        this.getContentPane().setPreferredSize(new Dimension(700,700));
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        
        
        
        addMouseListener(this);
        
        
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));
        Canvas theGraphic = new Canvas();
        panel.add(theGraphic);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
    public void mouseExited(MouseEvent e) {System.out.println("exit");}
    public void mouseEntered(MouseEvent e) {System.out.println("enter");}
    public void mouseReleased(MouseEvent e) {System.out.println("release");}
    public void mousePressed(MouseEvent e) {System.out.println("press");}
    public void mouseClicked(MouseEvent e) {
        int mousex = e.getX();
        int mousey = e.getY();
        
        if (mousex > x && mousex < x+100 && mousey >y && mousey < y + 100){
            createDialogExample("Wow, you clicked on the virus");
            int randomInteger = random.nextInt(1000);
            y = random.nextInt(600);
            x = random.nextInt(600);
            repaint();
        }else{
            createDialogExample("You missed");
            int randomInteger = random.nextInt(600);
            y = random.nextInt(600);
            x = random.nextInt(600);
            repaint();
        }
        
        System.out.println("click at " + mousex + ", " + mousey);
    }
    public void createDialogExample(String words){
        JDialog box = new JDialog(this);
        box.setBounds(1000,400,300,300);
        TextArea area = new TextArea(words);
        box.add(area);
        box.toFront();
        box.setVisible(true);
        box.setTitle("Cube");
    }
    public void paint (Graphics g) {
        super.paint(g);
        image.paintIcon(this,g,x,y);
        
    }
    /**public void red (Graphics g) {
        super.paint(g);
        image.paintIcon(this,g,a,b);
        
    }*/
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
            case "Down" : 
                System.out.println("Down");
                y = y + 50;
                repaint();
                break;
            case "Up" : 
                System.out.println("Up");
                y = y - 50;
                repaint();
                break;
            case "Left" : 
                System.out.println("Left");
                x = x - 50;
                repaint();
                break;
            case "Right" : 
                System.out.println("Right");
                x = x + 50;
                repaint();
                break;
            default : 
                System.out.println("Invalid");
                createDialogExample("Invalid");
                break;
        }
    }
}
