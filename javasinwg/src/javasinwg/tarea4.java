package javasinwg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tarea4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tarea4 frame = new tarea4();
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
	public tarea4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(27, 97, 107, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 97, 107, 51);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(416, 97, 136, 52);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(356, 107, 45, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("operacion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(161, 102, 59, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Indique los datos y toque calcular para obtener el resultado");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(39, 10, 513, 77);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(258, 367, 294, 77);
		contentPane.add(lblNewLabel_4);
		
		btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("+");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(27, 223, 85, 52);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("-");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton_1.setBounds(130, 223, 90, 52);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("X");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("X");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBounds(27, 299, 85, 52);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("/");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_3.setBounds(135, 299, 85, 52);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Calcular");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int a1 = Integer.parseInt(new String(textField.getText()));
					int a2 = Integer.parseInt(new String(textField_1.getText()));
					String key = lblNewLabel_1.getText();
					switch (key) {
					case "+": 
						textField_2.setText(String.valueOf(a1+a2));
						break;
					case "-":
						textField_2.setText(String.valueOf(a1-a2));
						break;
					case "X":
						textField_2.setText(String.valueOf(a1*a2));
						break;
					case "/":
						if(a2 == 0) {
							lblNewLabel_4.setText("Nose puede dividir en 0");
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
						}else {
							textField_2.setText(String.valueOf(a1/a2));
						}
					default:
						break;
					}
				} catch (Exception e2) {
					lblNewLabel_4.setText("Error al ingresar los datos Intente Otra vez");
					textField.setText("");
					textField_1.setText("");
				}

			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.setBounds(258, 258, 116, 53);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("Consola");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(302, 324, 163, 33);
		contentPane.add(lblNewLabel_3);
		

	}
	
}
