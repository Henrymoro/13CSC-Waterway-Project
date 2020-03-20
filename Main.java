
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
public class Main extends JFrame implements ActionListener, MouseListener 
{
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    Scanner inputStream = new Scanner(System.in);
    
    Canvas theGraphic;
    
    int x = 350;
    int y = 350;
    
    int a = 150;
    int b = 150;
    
    String test = ("test");
    
    final String fileName = "blueRect.png";
    ImageIcon image = new ImageIcon(fileName);
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        
        setTitle("My Window");
        
        this.getContentPane().setPreferredSize(new Dimension(700,700));
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        
        menu = new JMenu("File");
        menuBar.add(menu);
        
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
        
        menu = new JMenu("Move Blue Rectangle");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Up");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("UP"));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Down");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("DOWN"));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Left");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("LEFT"));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Right");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("RIGHT"));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menu = new JMenu("Move Red Rectangle");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("Up2");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('w'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Down2");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('s'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Left2");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('a'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem=new JMenuItem("Right2");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('d'));
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));
        Canvas theGraphic = new Canvas();
        panel.add(theGraphic);
        
        //JPanel panel = new JPanel();
        //panel.setPreferredSize(new Dimension(400,400));
        //Canvas theGraphic = new Canvas();
        //panel.add(theGraphic);
        
        addMouseListener(this);
        
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
        
        if (mousex > x && mousex < x+100 && mousey >y && mousey < y + 50){
            createDialogExample("Wow, you clicked on the blue rectangle");
        }
        
        System.out.println("click at " + mousex + ", " + mousey);
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
    public void paint (Graphics g) {
        super.paint(g);
        image.paintIcon(this,g,x,y);
    }
    public void red (Graphics g) {
        super.paint(g);
        image.paintIcon(this,g,a,b);
        
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
            case "Down2" : 
                System.out.println("Down");
                y = y + 50;
                repaint();
                break;
            case "Up2" : 
                System.out.println("Up");
                y = y - 50;
                repaint();
                break;
            case "Left2" : 
                System.out.println("Left");
                x = x - 50;
                repaint();
                break;
            case "Right2" : 
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
