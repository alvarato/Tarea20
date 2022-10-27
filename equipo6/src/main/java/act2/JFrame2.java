package act2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame2 frame = new JFrame2();
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
	public JFrame2() {
		setTitle("Ventana con interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text1 = new JLabel("Has pulsado: Boton");
		text1.setBounds(39, 42, 148, 14);
		contentPane.add(text1);
		
		JLabel num_btn = new JLabel("");
		num_btn.setBounds(158, 42, 46, 14);
		contentPane.add(num_btn);
		
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num_btn.setText("1");
			}
		});
		btnNewButton.setBounds(39, 78, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Botón 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num_btn.setText("2");
			}
		});
		btnNewButton_1.setBounds(39, 124, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
