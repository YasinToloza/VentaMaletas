package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class listar_maletas extends JDialog implements ActionListener {
	private JScrollPane scp;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			listar_maletas dialog = new listar_maletas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public listar_maletas() {
		setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Listado de Maletas");
		setBounds(100, 100, 529, 387);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
		
		scp = new JScrollPane();
		scp.setBounds(10, 11, 491, 295);
		getContentPane().add(scp);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setFont(new Font("Arial", Font.PLAIN, 11));
		scp.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(269, 312, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnListar.setBounds(159, 312, 89, 23);
		getContentPane().add(btnListar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) 
	{ dispose();}
	
	
	protected void actionPerformedBtnListar(ActionEvent e) 
	{
		txtS.setText("/* --------------- MODELOS DE MALETAS --------------- */" + "\n");
		mostrarMaleta(Tienda.modelo0, Tienda.precio0,Tienda.ancho0, Tienda.alto0,Tienda.fondo0,Tienda.peso0);
		mostrarMaleta(Tienda.modelo1, Tienda.precio1, Tienda.ancho1, Tienda.alto1,Tienda.fondo1,Tienda.peso1);
		mostrarMaleta(Tienda.modelo2, Tienda.precio2, Tienda.ancho2, Tienda.alto2,Tienda.fondo2,Tienda.peso2);
		mostrarMaleta(Tienda.modelo3, Tienda.precio3, Tienda.ancho3, Tienda.alto3,Tienda.fondo3,Tienda.peso3);
		mostrarMaleta(Tienda.modelo4, Tienda.precio4, Tienda.ancho4, Tienda.alto4,Tienda.fondo4,Tienda.peso4);
	}

	void mostrarMaleta(String Mod,double precio,double ancho,double alto,double fondo,double peso) {
		imprimir("Modelo:" + "\t" + Mod);
		imprimir("Precio:" + "\tS/. " + precio);
		imprimir("Ancho:" + "\t" + String.format("%.0f", ancho) + " cm");
		imprimir("Alto:" + "\t" + String.format("%.0f", alto) + " cm");
		imprimir("Fondo:"+ "\t" + String.format("%.0f", fondo) + " cm" );
		imprimir("Peso:"+ "\t" + peso + " kg");
		imprimir("/*----------------------------------*/"  + "\n");
	}
	
	void imprimir(String cad) {
		txtS.append(cad + "\n");
	}
}
