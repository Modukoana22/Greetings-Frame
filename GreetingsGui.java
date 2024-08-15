
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingsGui extends JFrame{
    
    //creat panels
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    
    //heading
    private JLabel headingLbl;
    //declare name components
    private JLabel nameLbl;
    private JTextField nameFld;
    
    //declare surname components
    private JLabel surnameLbl;
    private JTextField surnameFld;
   
    //declare textarea components
    private JTextArea greetingsTxtArea;
    
    //declare button components
    private JButton greetBtn;
    private JButton cleartBtn;
    private JButton exitBtn;    
    

    public GreetingsGui() {
        setSize(350, 400);
        setResizable(true);
        setTitle("My First Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
      
        headingLbl = new JLabel("Greeting App");
        
        namePnl = new JPanel(new FlowLayout());
        nameLbl = new JLabel("Name: ");
        nameFld = new JTextField(20);
        
        surnamePnl = new JPanel(new FlowLayout());
        surnameLbl = new JLabel("Surname");
        surnameFld = new JTextField(20);
        
        headingPnl.add(headingLbl, BorderLayout.CENTER);
        
        //adding name components
        namePnl.add(nameLbl);
        namePnl.add(nameFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameFld);
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        //text area portion
        greetingsPnl = new JPanel( new BorderLayout());
        greetingsTxtArea = new JTextArea(10, 30);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello Modukoana Gamlashe");
        //greetingsTxtArea.setMargin(new Insets(200, 150, 200, 150));
        greetingsPnl.add(greetingsTxtArea);
        greetingsPnl.setBorder(new TitledBorder(new LineBorder(Color.black, 1), " Greetings"));
        btnPnl = new JPanel(new FlowLayout());
        
        greetBtn = new JButton("Greet");
        btnPnl.add(greetBtn);
        
        cleartBtn = new JButton("Clear");
        btnPnl.add(cleartBtn);
        
        exitBtn = new JButton("Exit");
        btnPnl.add(exitBtn);
        
        mainPnl = new JPanel(new BorderLayout());
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        //add panels to frame
       
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        

        setVisible(true);
   }
    
    
}
