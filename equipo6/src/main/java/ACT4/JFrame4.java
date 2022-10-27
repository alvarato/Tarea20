package ACT4;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class JFrame4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame4 frame = new JFrame4();
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
	public JFrame4() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta= new JLabel("Eventos");
		etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
		etiqueta.setBounds(10, 117, 60, 14);
		contentPane.add(etiqueta);
		
		JTextArea textarea= new JTextArea();
		textarea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode()==KeyEvent.VK_A) {
					textarea.append("Tecla A pulsada\n");
				}
				textarea.append("Tecla pulsada\n");
			}
		});
		textarea.setBounds(80, 11, 332, 239);
		contentPane.add(textarea);
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent arg0) {
				textarea.append("Componente movido\n");
			}
			@Override
			public void componentShown(ComponentEvent e) {
				textarea.append("Componente mostrado\n");
			}
		});
		addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
				textarea.append("Componente insertado\n");
			}
			@Override
			public void componentRemoved(ContainerEvent e) {
				textarea.append("Componente borrado\n");
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textarea.append("Raton clicado\n");
			}
		});
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode()==KeyEvent.VK_A) {
					textarea.append("Tecla A pulsada\n");
				}
				textarea.append("Tecla pulsada\n");
			}
		});
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
				textarea.append("Estado de ventana cambiado\n");
			}
		});
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
				textarea.append("Ventana enfocada\n");
			}
			public void windowLostFocus(WindowEvent arg0) {
				textarea.append("Ventana desenfocada\n");
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				textarea.append("Ventana activada\n");
			}
			@Override
			public void windowClosed(WindowEvent e) {
				textarea.append("Ventana cerrada\n");
			}
			@Override
			public void windowClosing(WindowEvent e) {
				textarea.append("Ventana cerrandose\n");
			}
			@Override
			public void windowOpened(WindowEvent e) {
				textarea.append("Ventana abierta\n");
			}
			
		});
	}

}
