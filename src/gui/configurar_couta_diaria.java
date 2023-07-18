package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configurar_couta_diaria extends JDialog implements ActionListener {
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtCuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurar_couta_diaria dialog = new configurar_couta_diaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurar_couta_diaria() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 450, 109);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
		{
			JLabel lblCuotaDiaria = new JLabel("Cuota diaria esperada (S/.)");
			lblCuotaDiaria.setFont(new Font("Arial", Font.PLAIN, 11));
			lblCuotaDiaria.setBounds(10, 11, 161, 14);
			getContentPane().add(lblCuotaDiaria);
		}
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAceptar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCancelar.setBounds(335, 36, 89, 23);
		getContentPane().add(btnCancelar);
		
		txtCuotaDiaria = new JTextField();
		txtCuotaDiaria.setFont(new Font("Arial", Font.PLAIN, 11));
		txtCuotaDiaria.setBounds(166, 8, 111, 20);
		getContentPane().add(txtCuotaDiaria);
		txtCuotaDiaria.setColumns(10);
		
		txtCuotaDiaria.setText(Tienda.cuotaDiaria+"");
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
	{dispose();}
	protected void actionPerformedBtnAceptar(ActionEvent e) 
   {try {Tienda.cuotaDiaria=Double.parseDouble(txtCuotaDiaria.getText());
	     dispose();}
	
	catch(Exception Er5){
		JOptionPane.showMessageDialog(txtCuotaDiaria, "La cuota diaria no puede estar vacia");
	}
	}
}
