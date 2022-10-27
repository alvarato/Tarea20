package com.appMockito.ejemplo.equipo6.act3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Jframe3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe3 frame = new Jframe3();
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
	public Jframe3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Boton1");
		btn1.setBounds(155, 62, 102, 34);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton2");
		btn2.setBounds(352, 62, 94, 34);
		contentPane.add(btn2);
		
		JLabel boton1cartel = new JLabel("boton1:");
		boton1cartel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		boton1cartel.setBounds(119, 31, 62, 21);
		contentPane.add(boton1cartel);
		
		JLabel lblNewLabel = new JLabel("veces");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(226, 35, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("boton2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(329, 31, 62, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("veces");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(430, 31, 45, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel n1 = new JLabel("0");
		n1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		n1.setBounds(193, 35, 45, 13);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("0");
		n2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		n2.setBounds(401, 35, 45, 13);
		contentPane.add(n2);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int aux = Integer.valueOf(n1.getText());
				aux++;
				n1.setText(String.valueOf(aux));
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int aux = Integer.valueOf(n2.getText());
				aux++;
				n2.setText(String.valueOf(aux));
			}
		});
		

	}
}
