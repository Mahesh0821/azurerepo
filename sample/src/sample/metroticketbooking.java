package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class metroticketbooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticketbooking window = new metroticketbooking();
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
	public metroticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel.setBounds(102, 11, 207, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(57, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(57, 131, 60, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(57, 185, 83, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER TIKS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(57, 238, 103, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(170, 77, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "AMEERPET", "JNTU", "MOOSAPET", "UPPAL", "ESI"}));
		cb2.setBounds(170, 182, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "AMEERPET", "JNTU", "MOOSAPET", "UPPAL", "ESI"}));
		cb1.setBounds(170, 128, 86, 22);
		frame.getContentPane().add(cb1);
		
		JSpinner jsp1 = new JSpinner();
		jsp1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		jsp1.setBounds(183, 236, 73, 20);
		frame.getContentPane().add(jsp1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				int nt=(int)jsp1.getValue();
				int bill=0;
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please Check Stations");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "NAME :"+name+"\nSource :"+source+"\nDestination :"+destination+"\n no.of tiks :"+nt+"\nAmount :"+bill+"\n!!--HAPPY JOURNEY--!!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(170, 360, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\met.jpg"));
		lblNewLabel_6.setBounds(266, 73, 158, 221);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
