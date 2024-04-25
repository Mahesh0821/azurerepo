package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class studentform {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentform window = new studentform();
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
	public studentform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(121, 200, 163));
		frame.setBounds(100, 100, 450, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 13));
		lblNewLabel.setBounds(101, 11, 220, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(49, 54, 65, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(49, 85, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(49, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(49, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Language");
		lblNewLabel_5.setBounds(49, 199, 65, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(143, 53, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(143, 83, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setToolTipText("");
		r1.setSelected(true);
		r1.setBounds(116, 159, 58, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setSelected(true);
		r2.setBounds(180, 159, 80, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBounds(116, 197, 46, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Python");
		c2.setBounds(164, 197, 65, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("Java");
		c3.setBounds(231, 197, 58, 23);
		frame.getContentPane().add(c3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IOT", "EEE", "DS", "AIML"}));
		cb1.setBounds(143, 119, 80, 22);
		frame.getContentPane().add(cb1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				String langs=" ";
				if(r1.isSelected())
				{
					gender="Male";
				}
				if(r2.isSelected())
				{
					gender="Female";
				}
				if(c1.isSelected())
				{
					langs+="C ";
				}
				if(c2.isSelected())
				{
					langs+="Python ";
				}
				if(c3.isSelected())
				{
					langs+="Java ";
				}
				JOptionPane.showMessageDialog(btnNewButton, "ROLL :"+roll+"\nNAME :"+name+"\nBRANCH :"+branch+"\nGENDER :"+gender+"\nPROG LANGS :"+langs);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(303, 229, 106, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
