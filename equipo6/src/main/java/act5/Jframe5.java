package act5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jframe5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe5 frame = new Jframe5();
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
	public Jframe5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1079, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Limpiar");


		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(442, 21, 114, 43);
		contentPane.add(btnNewButton);
		
		JLabel consola = new JLabel("");
		consola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String aux = new String(consola.getText()) + " Click";
				consola.setText(aux);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				String aux = new String(consola.getText()) + " Inside console";
				consola.setText(aux);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				String aux = new String(consola.getText()) + " Outside console";
				consola.setText(aux);
			}
			
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				String aux = new String(consola.getText()) + " Inside button";
				consola.setText(aux);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				String aux = new String(consola.getText()) + " Outside button";
				consola.setText(aux);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText("");
			}
		});
		consola.setVerticalAlignment(SwingConstants.TOP);
		consola.setBounds(26, 103, 1029, 162);
		contentPane.add(consola);
	}
}
