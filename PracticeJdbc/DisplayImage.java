package jdbc.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.ImageView;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
class Connectionprovider {
	private static Connection con;

	public static Connection getConnection() {
		try {
			if (con == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/samiinfo", "root", "root");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

public class DisplayImage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayImage frame = new DisplayImage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public DisplayImage() {
		setAlwaysOnTop(true);
		setTitle("Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton imageShowButton = new JButton("Search");
		imageShowButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		imageShowButton.setForeground(Color.BLACK);
		imageShowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();
				int id=Integer.parseInt(str);
				ImageIcon icon=Helper.getImageIconById(id, Connectionprovider.getConnection());
				if(icon==null) {
					JOptionPane.showMessageDialog(null, "No Image Found");
				}else {
					
				}
				lblNewLabel.setIcon(icon);
			}
		});
		contentPane.add(imageShowButton);
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel);
	}
}
