import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MojoTransportMain extends JFrame {

    private JPanel contentPane;
    private static JdbcController controller;

    MojoTransportMain(){    
		JFrame f=new JFrame("Basic Query UI"); 
					//submit button
		JButton b=new JButton("Submit");    
		b.setBounds(418,78,140, 30);
		JButton b2=new JButton("Submit");    
		b2.setBounds(418,164,140, 30);
		JButton b3=new JButton("Show Ground Companies");    
		b3.setBounds(20,10,200, 30);
					//enter name label
		JLabel label = new JLabel();		
		label.setText("Enter Model to find Vehicle");
		label.setBounds(177, 52, 184, 29);
		JLabel label2 = new JLabel();
		label2.setText("Enter Vehicle for Purpose");
		label2.setBounds(177, 130, 184, 39);
					//empty label which will show event after button clicked
		JTextArea label1 = new JTextArea();
		label1.setBackground(UIManager.getColor("Button.background"));
		label1.setBounds(104, 232, 424, 225);
					//textfield to enter name
		JTextField textfield= new JTextField();
		textfield.setBounds(154, 77, 230, 30);
		JTextField textfield2= new JTextField();
		textfield2.setBounds(154, 163, 230, 30);
					//add to frame
		f.getContentPane().add(label1);
		f.getContentPane().add(label2);
		f.getContentPane().add(textfield);
		f.getContentPane().add(textfield2);
		f.getContentPane().add(label);
		f.getContentPane().add(b);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.setSize(600,600);    
		f.getContentPane().setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent we)
		    {
		    //	controller.cleanUp();
		    }
		});
		
							//action listener
		b.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
			       JdbcController control = new JdbcController("root", "Alwaysme1234!");
			       Connection conn =  control.getConn();
			       Statement smt = null;
			       ResultSet rs = null;
			       String sql =  "Select Make, Model from ground_transportation";
			       try {
                    smt = conn.createStatement();
                    rs = smt.executeQuery(sql);
                    while(rs.next()) {
                        System.out.println("name is: " + rs.getString(1) + ", address: " + rs.getString(2));
                    }
                    smt.close();
                    rs.close();
                    conn.close();
                    
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
			       
				    String param = textfield.getText();
				    //String labeltext = controller.findVehicleFromModel(param);
					//label1.setText("Vehicle with model is: " + labeltext);				
			}          
	      });
		
		b2.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				    String param = textfield2.getText();
				   // String labeltext = controller.findTasks(param);
					//label1.setText("Purpose: " + labeltext);				
			}          
	      });
		
		b3.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {				    
				 //   String labeltext = controller.showGC();
					//label1.setText(labeltext);				
			}          
	      });
		}         
	
	
		public static void main(String[] args) {
			controller = new JdbcController(args[0], args[1]);
		    new MojoTransportMain();    
		} 
        
        
        
        
  
    }


