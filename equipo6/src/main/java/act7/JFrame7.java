package act7;

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

public class JFrame7 extends JFrame {

	private JPanel contentPane;
	private JTextField convertir;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame7 frame = new JFrame7();
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
	public JFrame7() {
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cantidad a convertir
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(36, 51, 138, 14);
		contentPane.add(lblNewLabel);
		
		convertir = new JTextField();
		convertir.setBounds(169, 48, 74, 20);
		contentPane.add(convertir);
		convertir.setColumns(10);
		
		
		//Resultado
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(36, 96, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		resultado = new JTextField();
		resultado.setBounds(169, 93, 74, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		
		//Boton euros a ptas
		JButton btn_ep = new JButton("Euros a ptas");
		btn_ep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double v1 = Double.parseDouble(convertir.getText());
				
				double res1 = v1*166.386;
				
				DecimalFormat decimalFormat =  new DecimalFormat("#.###");
				String r1=decimalFormat.format(res1);
				
				resultado.setText(r1);;
			}
		});
		btn_ep.setBackground(new Color(189, 209, 240));
		btn_ep.setBounds(36, 154, 138, 23);
		contentPane.add(btn_ep);
		
		
		//Boton ptas a euros
		JButton btn_pe = new JButton("Ptas a euros");
		btn_pe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double v1 = Double.parseDouble(convertir.getText());
				
				double res1 = v1/166.386;
				DecimalFormat decimalFormat =  new DecimalFormat("#.###");
				
				String r1=decimalFormat.format(res1);
				
				resultado.setText(r1);
				
			}
		});
		btn_pe.setBackground(new Color(213, 249, 215));
		btn_pe.setBounds(216, 154, 138, 23);
		contentPane.add(btn_pe);
	}

}
