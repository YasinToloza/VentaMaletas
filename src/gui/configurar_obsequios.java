package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configurar_obsequios extends JDialog implements ActionListener {
	private JTextField txt1;
	private JTextField txt2a5;
	private JTextField txt6;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurar_obsequios dialog = new configurar_obsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurar_obsequios() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Configurar Obsequios");
		setFont(new Font("Arial", Font.PLAIN, 11));
		setBounds(100, 100, 429, 126);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
		{
			JLabel lblObsequio = new JLabel("1 Unidad");
			lblObsequio.setFont(new Font("Arial", Font.PLAIN, 11));
			lblObsequio.setBounds(25, 11, 102, 14);
			getContentPane().add(lblObsequio);
		}
		{
			JLabel lblObsequio = new JLabel("2 a 5 Unidades");
			lblObsequio.setFont(new Font("Arial", Font.PLAIN, 11));
			lblObsequio.setBounds(25, 36, 102, 14);
			getContentPane().add(lblObsequio);
		}
		{
			JLabel lblObsequio = new JLabel("6 a mas Unidades");
			lblObsequio.setFont(new Font("Arial", Font.PLAIN, 11));
			lblObsequio.setBounds(25, 61, 102, 14);
			getContentPane().add(lblObsequio);
		}
		{
			txt1 = new JTextField();
			txt1.setFont(new Font("Arial", Font.PLAIN, 11));
			txt1.setBounds(159, 8, 86, 20);
			getContentPane().add(txt1);
			txt1.setColumns(10);
		}
		{
			txt2a5 = new JTextField();
			txt2a5.setFont(new Font("Arial", Font.PLAIN, 11));
			txt2a5.setBounds(159, 33, 86, 20);
			getContentPane().add(txt2a5);
			txt2a5.setColumns(10);
		}
		{
			txt6 = new JTextField();
			txt6.setFont(new Font("Arial", Font.PLAIN, 11));
			txt6.setBounds(159, 58, 86, 20);
			getContentPane().add(txt6);
			txt6.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setFont(new Font("Arial", Font.PLAIN, 11));
			btnAceptar.setBounds(314, 7, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setFont(new Font("Arial", Font.PLAIN, 11));
			btnCancelar.setBounds(314, 32, 89, 23);
			getContentPane().add(btnCancelar);
		}
		txt1.setText(Tienda.obsequio1);
		txt2a5.setText(Tienda.obsequio2);
		txt6.setText(Tienda.obsequio3);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) 
	{ dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) 
	{Tienda.obsequio1=txt1.getText();
	Tienda.obsequio2=txt2a5.getText();
	Tienda.obsequio3=txt6.getText();
	dispose();

	}

	
		
	
}


