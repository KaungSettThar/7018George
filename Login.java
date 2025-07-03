package samplePrj;
import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JPasswordField txtPassword;
	private final JButton btnCancel = new JButton("Cancel");
	private JLabel lblNewLabel;
	static boolean fisrstTime = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Enter User Name");
		lblName.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 18));
		lblName.setBounds(10, 33, 193, 33);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(296, 33, 130, 33);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Enter Password");
		lblPassword.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 18));
		lblPassword.setBounds(10, 108, 193, 33);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(296, 108, 130, 33);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtName.getText().equals("Admin") && txtPassword.getText().equals("123")) {
					JOptionPane.showMessageDialog(null, "Login Successfully!");
				AddShop addShop = new AddShop();
				addShop.setVisible(true);
				dispose();
				}
				
				else if(txtName.getText().equals("User") && txtPassword.getText().equals("Only4u")) {
					JOptionPane.showMessageDialog(null, "Login Successfully!");
				
				ViewShopList viewShopList = new ViewShopList();
				viewShopList.setVisible(true);
				dispose();
			}
				else
					JOptionPane.showMessageDialog(null, "User Name or Passowrd is incorrect");
			}
		});
		btnLogin.setBackground(new Color(102, 255, 204));
		btnLogin.setForeground(new Color(255, 0, 102));
		btnLogin.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 16));
		btnLogin.setBounds(139, 184, 120, 39);
		contentPane.add(btnLogin);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtPassword.setText(null);
			}
		});
		btnCancel.setBackground(new Color(102, 255, 204));
		btnCancel.setForeground(new Color(255, 0, 102));
		btnCancel.setBounds(300, 185, 136, 36);
		contentPane.add(btnCancel);
		btnCancel.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 16));
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/user.png")));
		lblNewLabel.setBounds(10, 141, 120, 128);
		contentPane.add(lblNewLabel);
	}
}
