import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class calci {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setBounds(63, 30, 110, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_1.setBounds(232, 30, 110, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				ans=num1+num2;
				textField_2.setText(Integer.toString(ans));
				
			}
		});
		btnNewButton.setBounds(63, 119, 58, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				ans=num1*num2;
				textField_2.setText(Integer.toString(ans));
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(232, 119, 58, 34);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				ans=num1/num2;
				textField_2.setText(Integer.toString(ans));
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_2.setBounds(310, 119, 58, 34);
		frame.getContentPane().add(button_2);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				ans=num1-num2;
				textField_2.setText(Integer.toString(ans));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setBounds(150, 119, 58, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_2.setBounds(159, 184, 86, 34);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAns = new JLabel("Ans:");
		lblAns.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblAns.setBounds(91, 199, 58, 14);
		frame.getContentPane().add(lblAns);
	}
}
