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
		b.setBounds(150,100,140, 30);
		JButton b2=new JButton("Submit");    
		b2.setBounds(150,200,140, 30);
		JButton b3=new JButton("Show Ground Companies");    
		b3.setBounds(350,100,200, 30);
					//enter name label
		JLabel label = new JLabel();		
		label.setText("Enter Model to find Vehicle");
		label.setBounds(0, 10, 150, 100);
		JLabel label2 = new JLabel();
		label2.setText("Enter Vehicle for Purpose");
		label2.setBounds(0, 100, 150, 100);
					//empty label which will show event after button clicked
		JTextArea label1 = new JTextArea();
		label1.setBounds(100, 300, 400, 200);
					//textfield to enter name
		JTextField textfield= new JTextField();
		textfield.setBounds(154, 50, 130, 30);
		JTextField textfield2= new JTextField();
		textfield2.setBounds(154, 150, 130, 30);
					//add to frame
		f.add(label1);
		f.add(label2);
		f.add(textfield);
		f.add(textfield2);
		f.add(label);
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.setSize(600,600);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent we)
		    {
		    	controller.cleanUp();
		    }
		});
		
							//action listener
		b.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				    String param = textfield.getText();
				    String labeltext = controller.findVehicleFromModel(param);
					label1.setText("Vehicle with model is: " + labeltext);				
			}          
	      });
		
		b2.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				    String param = textfield2.getText();
				    String labeltext = controller.findTasks(param);
					label1.setText("Purpose: " + labeltext);				
			}          
	      });
		
		b3.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {				    
				    String labeltext = controller.showGC();
					label1.setText(labeltext);				
			}          
	      });
		}         
	
	
		public static void main(String[] args) {
			controller = new JdbcController(args[0], args[1]);
		    new MojoTransportMain();    
		} 
        
        
        
        
  
    }


