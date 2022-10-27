package act8;

import java.awt.EventQueue;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class JFrame8 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame8 frame = new JFrame8();
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
	public JFrame8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cantidad a convertir
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(59, 71, 152, 26);
		contentPane.add(lblNewLabel);
		
		JTextPane convertir = new JTextPane();

		convertir.setBounds(197, 59, 157, 38);
		contentPane.add(convertir);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(70, 135, 141, 19);
		contentPane.add(lblNewLabel_1);
		
		JTextPane resultado = new JTextPane();
		resultado.setBounds(197, 121, 157, 44);
		contentPane.add(resultado);
		
		JButton btnNewButton = new JButton("Euros a ptas");

		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(43, 195, 114, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ptas a euros");

		btnNewButton_1.setBackground(new Color(128, 255, 128));
		btnNewButton_1.setBounds(167, 195, 114, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar");

		btnNewButton_2.setBounds(298, 195, 114, 38);
		contentPane.add(btnNewButton_2);
		
		//Euros a ptas	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Double v1 = Double.parseDouble(convertir.getText());
					double res1 = v1*166.386;
					DecimalFormat decimalFormat =  new DecimalFormat("#.###");
					String r1=decimalFormat.format(res1);
					resultado.setText(r1);
				} catch (Exception e2) {
					resultado.setText("Dato ingresado no valido");
				}

			}
		});
		//Ptas a euros
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Double v1 = Double.parseDouble(convertir.getText());
					double res1 = v1/166.386;
					DecimalFormat decimalFormat =  new DecimalFormat("#.###");
					String r1=decimalFormat.format(res1);
					resultado.setText(r1);
				} catch (Exception e2) {
					resultado.setText("Dato Ingresado no valido");
				}

			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                convertir.setText("");
                resultado.setText("");
			}
		});

		
		
	}
}
