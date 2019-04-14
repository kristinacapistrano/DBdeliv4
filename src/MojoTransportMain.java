import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MojoTransportMain frame = new MojoTransportMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    /**
     * Create the frame.
     */
    public MojoTransportMain() {
        setName("MainFrame");
        getContentPane().setBackground(UIManager.getColor("Button.background"));
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(UIManager.getColor("Button.darkShadow"));
        mainPanel.setForeground(UIManager.getColor("Button.highlight"));

        getContentPane().add(mainPanel, BorderLayout.CENTER);
        
        JButton WaterTransport = new JButton("Water Transport");
        WaterTransport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        mainPanel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JButton LandButton = new JButton();
        LandButton.setPreferredSize(new Dimension(60, 29));
        LandButton.setInheritsPopupMenu(true);
        LandButton.setText("Land Transport");
        LandButton.setMaximumSize(new Dimension(130, 29));
        
        LandButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LandFrame land = new LandFrame();
                land.setVisible(true);
                LandButton.add(land);

            }
        });
        
        JLabel lblMojoTransportCo = new JLabel("Mojo Transport Co. ");
        lblMojoTransportCo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        lblMojoTransportCo.setHorizontalAlignment(SwingConstants.CENTER);
        lblMojoTransportCo.setForeground(UIManager.getColor("Button.highlight"));
        mainPanel.add(lblMojoTransportCo);
        mainPanel.add(LandButton);
        
        JButton AirTransport = new JButton("Air Transport");
        mainPanel.add(AirTransport);
        mainPanel.add(WaterTransport);
        setOpacity(1.0f);
        setTitle("Mojo Transport ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 750, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        
        
        
  
    }

    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
        	public void mousePressed(MouseEvent e) {
        		if (e.isPopupTrigger()) {
        			showMenu(e);
        		}
        	}
        	public void mouseReleased(MouseEvent e) {
        		if (e.isPopupTrigger()) {
        			showMenu(e);
        			
        		}
        	}
        	private void showMenu(MouseEvent e) {
        		popup.show(e.getComponent(), e.getX(), e.getY());
        	}
        });
    }
}
