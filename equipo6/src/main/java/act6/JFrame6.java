package act6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.DecimalFormat;

public class JFrame6 extends JFrame {

	private JPanel contentPane;
	private JTextField altura;
	private JTextField peso;
	private JTextField respuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame6 frame = new JFrame6();
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
	public JFrame6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura(metros)");
		lblNewLabel.setBounds(40, 66, 119, 14);
		contentPane.add(lblNewLabel);
		
		
		//Text field altura
		altura = new JTextField();
		altura.setBounds(40, 91, 86, 20);
		contentPane.add(altura);
		altura.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		lblNewLabel_1.setBounds(188, 66, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		
		//Text field peso
		peso = new JTextField();
		peso.setBounds(188, 91, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(200, 148, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		//Text field respuesta
		respuesta = new JTextField();
		respuesta.setBounds(237, 145, 86, 20);
		contentPane.add(respuesta);
		respuesta.setColumns(10);
		
		
		//Boton Calcular IMC
		JButton btn = new JButton("Calcular IMC");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double v1 = Double.parseDouble(peso.getText());
				Double v2 = Double.parseDouble(altura.getText());
				
				Double res = v1/(v2*v2);
				
				DecimalFormat decimalFormat =  new DecimalFormat("#.###");
				
				String res1=decimalFormat.format(res);
				
				respuesta.setText(res1);
			}
		});
		
		btn.setBackground(new Color(255, 255, 128));
		btn.setBounds(40, 144, 134, 23);
		contentPane.add(btn);
	}
}
