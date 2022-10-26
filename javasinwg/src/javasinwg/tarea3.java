package javasinwg;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tarea3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tarea3 frame = new tarea3();
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
	public tarea3() {
 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema Operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(35, 38, 258, 35);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(60, 79, 140, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(60, 102, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(60, 125, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		chckbxNewCheckBox.setBounds(60, 183, 140, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño Grafico");
		chckbxNewCheckBox_1.setBounds(60, 207, 140, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administracion");
		chckbxNewCheckBox_2.setBounds(60, 230, 158, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu Especialidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(35, 152, 238, 33);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(497, 102, 58, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas al ordenador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(337, 51, 238, 35);
		contentPane.add(lblNewLabel_2);
		
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		comboBox.addItem("7");
		comboBox.addItem("8");
		comboBox.addItem("9");
		comboBox.addItem("10");
		
		JButton btnNewButton = new JButton("Enviar Formulario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ms = "Datos Ingresados: \n";
				ms+="Sistema Operativo: " ;
				ms+=(rdbtnNewRadioButton.isSelected())?"Window":"";
				ms+=(rdbtnNewRadioButton_1.isSelected())?"Linux":"";
				ms+=(rdbtnNewRadioButton_2.isSelected())?"Mac":"";
				ms+="\nHabilidades: ";
				ms += (chckbxNewCheckBox.isSelected())?" -Programacion-":"";
				ms += (chckbxNewCheckBox_1.isSelected())?" -Diseño Grafico-":"";
				ms += (chckbxNewCheckBox_2.isSelected())?" -Administracion-":"";
				ms += "\n";
				ms += "Horas en el Ordenador " + (String) comboBox.getSelectedItem();
				JOptionPane.showConfirmDialog(null, ms);
			}
		});
		btnNewButton.setBounds(388, 133, 119, 26);
		contentPane.add(btnNewButton);
	}
}
