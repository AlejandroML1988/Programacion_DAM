package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Miventana {

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
					Miventana window = new Miventana();
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
	public Miventana() {
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
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 11, 184, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(36, 36, 350, 161);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Código Departamento:");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(7, 7, 336, 45);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento:");
		lblNewLabel_2.setBounds(7, 56, 336, 44);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad departamento:");
		lblNewLabel_3.setBounds(7, 104, 336, 50);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(160, 119, 167, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(160, 68, 167, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBackground(new Color(255, 128, 192));
		textField_2.setBounds(160, 19, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Los siguientes datos han sido enviados");
				System.out.println("Codigo departamento: " + textField_2.getText()); //getText selecciona el campo Text del textField
				System.out.println("Nombre departamento: " + textField_1.getText());
				System.out.println("Localidad departamento: " + textField.getText());
			}
		});
		btnNewButton.setBounds(75, 227, 116, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBorrarDatos = new JButton("Borrar datos");
		btnBorrarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton borrar");
				textField_2.setText(null);
				textField_1.setText(null);
				textField.setText(null);
				System.out.println("Los datos han sido borrados");
				
			}
		});
		btnBorrarDatos.setBounds(242, 227, 116, 23);
		frame.getContentPane().add(btnBorrarDatos);
	}
}
