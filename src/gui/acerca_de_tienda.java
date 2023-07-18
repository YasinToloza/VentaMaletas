package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class acerca_de_tienda extends JDialog implements ActionListener {
	private JLabel lblAutores;
	private JLabel lblIntegrante3;
	private JButton btnCerrar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			acerca_de_tienda dialog = new acerca_de_tienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public acerca_de_tienda() {
		setTitle("Acerca de");
		setBounds(100, 100, 413, 235);
		getContentPane().setLayout(null);
		{
			JLabel lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setFont(new Font("Arial", Font.BOLD, 24));
			lblTienda.setBounds(138, 11, 123, 37);
			getContentPane().add(lblTienda);
			setModal(true);
			setResizable(false);
		}
		
		lblAutores = new JLabel("Autor");
		lblAutores.setFont(new Font("Arial", Font.BOLD, 17));
		lblAutores.setBounds(173, 69, 70, 14);
		getContentPane().add(lblAutores);
		
		lblIntegrante3 = new JLabel("Yasin Sebastian Toloza Marulanda");
		lblIntegrante3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblIntegrante3.setBounds(65, 102, 291, 14);
		getContentPane().add(lblIntegrante3);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(142, 138, 101, 28);
		getContentPane().add(btnCerrar);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(10, 57, 377, 1);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) 
	{dispose();
	}
}
