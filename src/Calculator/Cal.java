package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal extends JFrame {
	private JTextField number_1;
	private JTextField number_2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal frame = new Cal();
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
	public Cal() {
		getContentPane().setLayout(null);
		setTitle("Kerem");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,300,350,300);
		JLabel lblNewLabel = new JLabel("Number 1");
		lblNewLabel.setBounds(0, 11, 59, 14);
		getContentPane().add(lblNewLabel);
		
		number_1 = new JTextField();
		number_1.setBounds(10, 36, 86, 20);
		getContentPane().add(number_1);
		number_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Number 2");
		lblNewLabel_1.setBounds(0, 67, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		number_2 = new JTextField();
		number_2.setBounds(10, 93, 86, 20);
		getContentPane().add(number_2);
		number_2.setColumns(10);
		
		JButton topla = new JButton("+");
		topla.setBounds(113, 7, 41, 36);
		getContentPane().add(topla);
		
		JButton cikar = new JButton("-");
		cikar.setBounds(152, 7, 41, 36);
		getContentPane().add(cikar);
		JButton carp = new JButton("*");
		carp.setBounds(113, 45, 41, 36);
		getContentPane().add(carp);
		
		JButton bol = new JButton("/");
		bol.setBounds(152, 45, 41, 36);
		getContentPane().add(bol);
		
		result = new JTextField();
		result.setBounds(239, 36, 86, 20);
		getContentPane().add(result);
		result.setColumns(10);
//Sayý1-Sayý2 Float deðer
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(239, 11, 46, 14);
		getContentPane().add(lblNewLabel_2);
//Iþlemler
			
		topla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(String.valueOf(tikla(1,number_1.getText(),number_2.getText())));	
			}
		});
		cikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(String.valueOf(tikla(2,number_1.getText(),number_2.getText())));
			}
		});
		bol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(String.valueOf(tikla(3,number_1.getText(),number_2.getText())));
			}
		});
		carp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(String.valueOf(tikla(4,number_1.getText(),number_2.getText())));
			}
		});
	}
	public double tikla(int a,String d,String e) {
		double b = Double.parseDouble(d);
		double c = Double.parseDouble(e);
		switch(a) {
		case 1:
			return b+c;
		case 2:
			return b-c;
		case 3:
			return b/c;
		case 4:
			return b*c;
		}
		return 0;
	}
}
