package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class consultar_maletas extends JDialog implements ActionListener {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblPeso;
	private JButton btnCerrar;
	private JComboBox cboMaleta;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			consultar_maletas dialog = new consultar_maletas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public consultar_maletas() {
		setFont(new Font("Arial", Font.PLAIN, 11));
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Consultar Maleta");
		setBounds(100, 100, 450, 223);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
	
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblModelo.setBounds(23, 27, 46, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrecio.setBounds(23, 52, 64, 14);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAncho.setBounds(23, 77, 64, 14);
		getContentPane().add(lblAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAlto.setBounds(23, 102, 46, 14);
		getContentPane().add(lblAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFondo.setBounds(23, 127, 64, 14);
		getContentPane().add(lblFondo);
		
		lblPeso = new JLabel("Peso (kg)");
		lblPeso.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPeso.setBounds(23, 152, 46, 14);
		getContentPane().add(lblPeso);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(318, 23, 89, 23);
		getContentPane().add(btnCerrar);
		
		cboMaleta = new JComboBox();
		cboMaleta.addActionListener(this);
		cboMaleta.setModel(new DefaultComboBoxModel(new String[] {"Aviator", "Lucca", "Samsonite", "Century", "Saxoline"}));
		cboMaleta.setFont(new Font("Arial", Font.PLAIN, 11));
		cboMaleta.setBounds(118, 24, 133, 20);
		getContentPane().add(cboMaleta);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Arial", Font.PLAIN, 11));
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(118, 49, 133, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setFont(new Font("Arial", Font.PLAIN, 11));
		txtAncho.setEditable(false);
		txtAncho.setBounds(118, 74, 133, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setFont(new Font("Arial", Font.PLAIN, 11));
		txtAlto.setEditable(false);
		txtAlto.setBounds(118, 99, 133, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setFont(new Font("Arial", Font.PLAIN, 11));
		txtFondo.setEditable(false);
		txtFondo.setBounds(118, 124, 133, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Arial", Font.PLAIN, 11));
		txtPeso.setEditable(false);
		txtPeso.setBounds(118, 149, 133, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);
		
		txtPrecio.setText(Tienda.precio0+"");
		txtAncho.setText(Tienda.ancho0+"");
		txtAlto.setText(Tienda.alto0+"");
		txtFondo.setText(Tienda.fondo0+"");
		txtPeso.setText(Tienda.peso0+"");
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMaleta) {
			actionPerformedCboMaleta(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
	 dispose();
	}
	protected void actionPerformedCboMaleta(ActionEvent arg0) 
	{
	switch(leerModelo()){
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

	void mostrarMaleta(double precio,int ancho,int alto,int fondo,double peso) 
	{ txtPrecio.setText(precio+"");
	txtAncho.setText(ancho+"");
	txtAlto.setText(alto+"");
	txtFondo.setText(fondo+"");
	txtPeso.setText(peso+"");
	
	}
	int leerModelo() 
	{ return cboMaleta.getSelectedIndex();}
}
