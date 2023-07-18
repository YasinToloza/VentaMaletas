package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class modificar_maleta extends JDialog implements ActionListener {
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtPeso;
	private JButton btnCerrar;
	private JComboBox cboModelo;
	private JButton btnGrabar;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			modificar_maleta dialog = new modificar_maleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public modificar_maleta() {
		setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Modificar Maleta");
		setBounds(100, 100, 450, 223);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setFont(new Font("Arial", Font.PLAIN, 11));
			lblModelo.setBounds(29, 30, 46, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/.)");
			lblPrecio.setFont(new Font("Arial", Font.PLAIN, 11));
			lblPrecio.setBounds(29, 55, 67, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setFont(new Font("Arial", Font.PLAIN, 11));
			lblAncho.setBounds(29, 80, 67, 14);
			getContentPane().add(lblAncho);
		}
		{
			JLabel lblAlto = new JLabel("Alto (cm)");
			lblAlto.setFont(new Font("Arial", Font.PLAIN, 11));
			lblAlto.setBounds(29, 105, 46, 14);
			getContentPane().add(lblAlto);
		}
		{
			JLabel lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setFont(new Font("Arial", Font.PLAIN, 11));
			lblFondo.setBounds(29, 130, 56, 14);
			getContentPane().add(lblFondo);
		}
		{
			JLabel lblPeso = new JLabel("Peso (kg)");
			lblPeso.setFont(new Font("Arial", Font.PLAIN, 11));
			lblPeso.setBounds(29, 155, 46, 14);
			getContentPane().add(lblPeso);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Arial", Font.PLAIN, 11));
			txtPrecio.setBounds(118, 52, 133, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setFont(new Font("Arial", Font.PLAIN, 11));
			txtAncho.setBounds(118, 77, 133, 20);
			getContentPane().add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setFont(new Font("Arial", Font.PLAIN, 11));
			txtAlto.setBounds(118, 102, 133, 20);
			getContentPane().add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setFont(new Font("Arial", Font.PLAIN, 11));
			txtFondo.setBounds(118, 127, 133, 20);
			getContentPane().add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			txtPeso = new JTextField();
			txtPeso.setFont(new Font("Arial", Font.PLAIN, 11));
			txtPeso.setBounds(118, 152, 133, 20);
			getContentPane().add(txtPeso);
			txtPeso.setColumns(10);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setFont(new Font("Arial", Font.PLAIN, 11));
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(322, 26, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			cboModelo = new JComboBox();
			cboModelo.addActionListener(this);
			cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Aviator", "Lucca", "Samsonite", "Century", "Saxoline"}));
			cboModelo.setFont(new Font("Arial", Font.PLAIN, 11));
			cboModelo.setBounds(118, 27, 133, 20);
			getContentPane().add(cboModelo);
		}
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnGrabar.setBounds(322, 51, 89, 23);
		getContentPane().add(btnGrabar);
		
		txtPrecio.setText(Tienda.precio0+"");
		txtAncho.setText(Tienda.ancho0+"");
		txtAlto.setText(Tienda.alto0+"");
		txtFondo.setText(Tienda.fondo0+"");
		txtPeso.setText(Tienda.peso0+"");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) 
	{dispose();}
	protected void actionPerformedCboModelo(ActionEvent e) 
{switch(leerModelo()){
case 0: mostrarMaleta(Tienda.precio0,Tienda.ancho0,Tienda.alto0,Tienda.fondo0,Tienda.peso0);
break;
case 1: mostrarMaleta(Tienda.precio1,Tienda.ancho1,Tienda.alto1,Tienda.fondo1,Tienda.peso1);
break;
case 2: mostrarMaleta(Tienda.precio2,Tienda.ancho2,Tienda.alto2,Tienda.fondo2,Tienda.peso2);
break;
case 3: mostrarMaleta(Tienda.precio3,Tienda.ancho3,Tienda.alto3,Tienda.fondo3,Tienda.peso3);
break;
default:mostrarMaleta(Tienda.precio4,Tienda.ancho4,Tienda.alto4,Tienda.fondo4,Tienda.peso4);
break;
	}
}
	int leerModelo() { return cboModelo.getSelectedIndex();}
	
	protected void actionPerformedBtnGrabar(ActionEvent e) 
	{try { switch (leerModelo()) {
	case 0: Tienda.precio0=Double.parseDouble(txtPrecio.getText());
    Tienda.ancho0=Integer.parseInt(txtAncho.getText());
    Tienda.alto0=Integer.parseInt(txtAlto.getText());
    Tienda.fondo0=Integer.parseInt(txtFondo.getText());
    Tienda.peso0=Double.parseDouble(txtPeso.getText());
break;
case 1: Tienda.precio1=Double.parseDouble(txtPrecio.getText());
    Tienda.ancho1=Integer.parseInt(txtAncho.getText());
    Tienda.alto1=Integer.parseInt(txtAlto.getText());
    Tienda.fondo1=Integer.parseInt(txtFondo.getText());
    Tienda.peso1=Double.parseDouble(txtPeso.getText());
break;
case 2: Tienda.precio2=Double.parseDouble(txtPrecio.getText());
    Tienda.ancho2=Integer.parseInt(txtAncho.getText());
    Tienda.alto2=Integer.parseInt(txtAlto.getText());
    Tienda.fondo2=Integer.parseInt(txtFondo.getText());
    Tienda.peso2=Double.parseDouble(txtPeso.getText());
break;
case 3: Tienda.precio3=Double.parseDouble(txtPrecio.getText());
    Tienda.ancho3=Integer.parseInt(txtAncho.getText());
    Tienda.alto3=Integer.parseInt(txtAlto.getText());
    Tienda.fondo3=Integer.parseInt(txtFondo.getText());
    Tienda.peso3=Double.parseDouble(txtPeso.getText());
break;
default: Tienda.precio4=Double.parseDouble(txtPrecio.getText());
     Tienda.ancho4=Integer.parseInt(txtAncho.getText());
     Tienda.alto4=Integer.parseInt(txtAlto.getText());
     Tienda.fondo4=Integer.parseInt(txtFondo.getText());
     Tienda.peso4=Double.parseDouble(txtPeso.getText());
break;
	}
	dispose();}
	
	catch(Exception Er2){
		JOptionPane.showMessageDialog(txtAlto, "Esta informacion no puede estar vacia o contener letras");
	} 
}
	void mostrarMaleta(double Precio,int Ancho, int Alto, int Fondo,double Peso)
	{txtPrecio.setText(Precio+"");
	txtAncho.setText(Ancho+"");;
	txtAlto.setText(Alto+"");
	txtFondo.setText(Fondo+"");
	txtPeso.setText(Peso+"");}
}