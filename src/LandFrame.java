import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import javafx.scene.image.Image;

public class LandFrame extends JInternalFrame {

    /**
     * Launch the application.

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LandFrame frame = new LandFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
     */
    /**
     * Create the frame.
     */
    public LandFrame() {
        setResizable(true);
        
        setClosable(true);
        setTitle("Land Transport ");
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);
        
        JTextField txtEnterYourQuery = new JTextField();
        txtEnterYourQuery.setHorizontalAlignment(SwingConstants.CENTER);
        txtEnterYourQuery.setText("Enter your query");
        txtEnterYourQuery.setBounds(36, 16, 346, 26);
        getContentPane().add(txtEnterYourQuery);
        txtEnterYourQuery.setColumns(10);
        
        JButton btnEnter = new JButton("Enter");
        btnEnter.setBounds(146, 46, 117, 29);
        getContentPane().add(btnEnter);
        
        
        
    }
}
