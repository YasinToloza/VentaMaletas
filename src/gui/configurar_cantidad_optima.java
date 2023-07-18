package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configurar_cantidad_optima extends JDialog implements ActionListener {
	private JTextField txtCantidadOptima;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurar_cantidad_optima dialog = new configurar_cantidad_optima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurar_cantidad_optima() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Configurar cantidad \u00F3ptima");
		setFont(new Font("Arial", Font.PLAIN, 11));
		setBounds(100, 100, 450, 109);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
		{
			JLabel lblCantidadOptimaDe = new JLabel("Cantidad \u00F3ptima de cantidad vendidas ");
			lblCantidadOptimaDe.setFont(new Font("Arial", Font.PLAIN, 11));
			lblCantidadOptimaDe.setBounds(10, 11, 186, 14);
			getContentPane().add(lblCantidadOptimaDe);
		}
		{
			txtCantidadOptima = new JTextField();
			txtCantidadOptima.setFont(new Font("Arial", Font.PLAIN, 11));
			txtCantidadOptima.setBounds(212, 8, 71, 20);
			getContentPane().add(txtCantidadOptima);
			txtCantidadOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setFont(new Font("Arial", Font.PLAIN, 11));
			btnAceptar.setBounds(335, 7, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setFont(new Font("Arial", Font.PLAIN, 11));
			btnCancelar.setBounds(335, 34, 89, 23);
			getContentPane().add(btnCancelar);
			
			txtCantidadOptima.setText(Tienda.cantidadOptima+"");
		}
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
	{
			try {Tienda.cantidadOptima=Integer.parseInt(txtCantidadOptima.getText());
			     dispose();}
			
			catch(Exception Er1){
				JOptionPane.showMessageDialog(txtCantidadOptima, "Cantidad optima no puede estar vacia");
			}
			
}
	
}
