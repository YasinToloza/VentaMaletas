package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class configurar_descuentos extends JDialog implements ActionListener {
	private JTextField txt1a5;
	private JTextField txt6a10;
	private JTextField txt11a15;
	private JTextField txt15;
	private JButton btnCerrar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurar_descuentos dialog = new configurar_descuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurar_descuentos() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Configurar Porcentaje de Descuentos");
		setBounds(100, 100, 450, 156);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
		{
			JLabel lbl1a5 = new JLabel("1 a 5 Unidades");
			lbl1a5.setFont(new Font("Arial", Font.PLAIN, 11));
			lbl1a5.setBounds(10, 11, 102, 14);
			getContentPane().add(lbl1a5);
		}
		{
			JLabel lbl6a10 = new JLabel("6 a 10 Unidades");
			lbl6a10.setFont(new Font("Arial", Font.PLAIN, 11));
			lbl6a10.setBounds(10, 36, 102, 14);
			getContentPane().add(lbl6a10);
		}
		{
			JLabel lbl11a15 = new JLabel("11 a 15 Unidades");
			lbl11a15.setFont(new Font("Arial", Font.PLAIN, 11));
			lbl11a15.setBounds(10, 61, 102, 14);
			getContentPane().add(lbl11a15);
		}
		{
			JLabel lbl15 = new JLabel("Mas de 15 Unidades");
			lbl15.setFont(new Font("Arial", Font.PLAIN, 11));
			lbl15.setBounds(10, 86, 102, 14);
			getContentPane().add(lbl15);
		}
		{
			txt1a5 = new JTextField();
			txt1a5.setFont(new Font("Arial", Font.PLAIN, 11));
			txt1a5.setBounds(122, 8, 86, 20);
			getContentPane().add(txt1a5);
			txt1a5.setColumns(10);
		}
		{
			txt6a10 = new JTextField();
			txt6a10.setFont(new Font("Arial", Font.PLAIN, 11));
			txt6a10.setBounds(122, 33, 86, 20);
			getContentPane().add(txt6a10);
			txt6a10.setColumns(10);
		}
		{
			txt11a15 = new JTextField();
			txt11a15.setFont(new Font("Arial", Font.PLAIN, 11));
			txt11a15.setBounds(122, 58, 86, 20);
			getContentPane().add(txt11a15);
			txt11a15.setColumns(10);
		}
		{
			txt15 = new JTextField();
			txt15.setFont(new Font("Arial", Font.PLAIN, 11));
			txt15.setBounds(122, 83, 86, 20);
			getContentPane().add(txt15);
			txt15.setColumns(10);
		}
		{
			JLabel lblPorcentaje1 = new JLabel("%");
			lblPorcentaje1.setBounds(218, 11, 11, 14);
			getContentPane().add(lblPorcentaje1);
		}
		{
			JLabel lblPorcentaje2 = new JLabel("%");
			lblPorcentaje2.setBounds(218, 36, 11, 14);
			getContentPane().add(lblPorcentaje2);
		}
		{
			JLabel lblPorcnetaje3 =new JLabel("%");
			lblPorcnetaje3.setBounds(218, 61, 11, 14);
			getContentPane().add(lblPorcnetaje3);
		}
		{
			JLabel lblPorcentaje4 = new JLabel("%");
			lblPorcentaje4.setBounds(218, 86, 11, 14);
			getContentPane().add(lblPorcentaje4);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setFont(new Font("Arial", Font.PLAIN, 11));
			btnAceptar.setBounds(335, 11, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setFont(new Font("Arial", Font.PLAIN, 11));
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 36, 89, 23);
			getContentPane().add(btnCerrar);
		}
		txt1a5.setText(""+Tienda.porcentaje1);
		txt6a10.setText(""+Tienda.porcentaje2);
		txt11a15.setText(""+Tienda.porcentaje3);
		txt15.setText(""+Tienda.porcentaje4);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) 
	{dispose();
	
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) 
	{try {
	Tienda.porcentaje1=Double.parseDouble(txt1a5.getText());
	Tienda.porcentaje2=Double.parseDouble(txt6a10.getText());
	Tienda.porcentaje3=Double.parseDouble(txt11a15.getText());
	Tienda.porcentaje4=Double.parseDouble(txt15.getText());
	dispose();
	}
	catch(Exception Er){
		JOptionPane.showMessageDialog(txt1a5, "Porcentaje no puede estar vacio o contener letras");}	
}
}
