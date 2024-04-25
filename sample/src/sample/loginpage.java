package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.TextArea;

public class loginpage {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
			}
		});
		frame.setBounds(100, 100, 450, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UsserName");
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.BOLD, 15));
		lblNewLabel_1.setBounds(96, 61, 81, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.BOLD, 15));
		lblNewLabel_2.setBounds(96, 118, 69, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(187, 66, 147, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("MS Gothic", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String pwd=p1.getText();
				if(name.equals("Mahesh")&&pwd.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Valid user");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid user");
				}
			}
		});
		btnNewButton.setBounds(161, 183, 111, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(149, 11, 121, 37);
		frame.getContentPane().add(lblNewLabel);
		
		p1 = new JPasswordField();
		p1.setToolTipText("");
		p1.setBounds(187, 120, 147, 26);
		frame.getContentPane().add(p1);
	}
}
