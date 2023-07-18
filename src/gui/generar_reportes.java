package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class generar_reportes extends JDialog implements ActionListener {

	
	private static final double Cant = 0;
	private final JPanel contentPanel = new JPanel();
	private JComboBox cbModelo;
	private JButton cerrar;
	private JLabel lblTipoDeReporte;
	private JScrollPane scrollPane;
	private JTextArea txts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			generar_reportes dialog = new generar_reportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public generar_reportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 553, 379);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblTipoDeReporte = new JLabel("Tipo de reporte");
			lblTipoDeReporte.setBounds(10, 18, 103, 14);
			contentPanel.add(lblTipoDeReporte);
		}
		{
			cbModelo = new JComboBox();
			cbModelo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relaci\u00F3n a la venta \u00F3ptima", "Precios en relaci\u00F3n al precio promedio", "General"}));
			cbModelo.addActionListener(this);
			cbModelo.setBounds(96, 15, 239, 20);
			contentPanel.add(cbModelo);
		}
		{
			cerrar = new JButton("CERRAR");
			cerrar.addActionListener(this);
			cerrar.setBounds(438, 14, 89, 23);
			contentPanel.add(cerrar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 48, 517, 285);
			contentPanel.add(scrollPane);
			{
				txts = new JTextArea();
				scrollPane.setViewportView(txts);
				
			}
		}
	}
      
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cerrar) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == cbModelo) {
			do_comboBox_actionPerformed(e);
		}
	}
	void print(String texto){
		txts.append(texto+"\n");
	}
	
		 
  
	protected void do_comboBox_actionPerformed(ActionEvent e) {int ind=cbModelo.getSelectedIndex();
	txts.setText("");
	
	// PRECIO MENOR
	double menorPrecio = Double.MAX_VALUE;
	// Comparar el precio de la primera maleta
	if (Tienda.precio0 < menorPrecio) {
	    menorPrecio = Tienda.precio0;
	}
	// Comparar el precio de la segunda maleta
	if (Tienda.precio1 < menorPrecio) {
	    menorPrecio = Tienda.precio1;
	}
	// Comparar el precio de la tercera maleta
	if (Tienda.precio2 < menorPrecio) {
	    menorPrecio = Tienda.precio2;
	}
	// Comparar el precio de la cuarta maleta
	if (Tienda.precio3 < menorPrecio) {
	    menorPrecio = Tienda.precio3;
	}
	// Comparar el precio de la quinta maleta
	if (Tienda.precio4 < menorPrecio) {
	    menorPrecio = Tienda.precio4;
	}

	// PRECIO MAYOR
	
	double mayorPrecio = Double.MIN_VALUE;
	// Comparar el precio de la primera maleta
	if (Tienda.precio0 > mayorPrecio) {
	    mayorPrecio = Tienda.precio0;
	}
	// Comparar el precio de la segunda maleta
	if (Tienda.precio1 > mayorPrecio) {
	    mayorPrecio = Tienda.precio1;
	}
	// Comparar el precio de la tercera maleta
	if (Tienda.precio2 > mayorPrecio) {
	    mayorPrecio = Tienda.precio2;
	}
	// Comparar el precio de la cuarta maleta
	if (Tienda.precio3 > mayorPrecio) {
	    mayorPrecio = Tienda.precio3;
	}
	// Comparar el precio de la quinta maleta
	if (Tienda.precio4 > mayorPrecio) {
	    mayorPrecio = Tienda.precio4;
	}

	// MODELOS SIN VENDER
	
	int modelosSinVender = 0;

	// Verificar modelos sin vender
	if (Tienda.canven0 == 0) {
	    modelosSinVender++;
	}
	if (Tienda.canven1 == 0) {
	    modelosSinVender++;
	}
	if (Tienda.canven2 == 0) {
	    modelosSinVender++;
	}
	if (Tienda.canven3 == 0) {
	    modelosSinVender++;
	}
	if (Tienda.canven4 == 0) {
	    modelosSinVender++;
	}
	
	// PRECIOS MAYORES AL PROMEDIO
	int preciosMayoresPromedio = 0;
	double promedio = (Tienda.precio0 + Tienda.precio1 + Tienda.precio2 + Tienda.precio3 + Tienda.precio4) / 4;

	if (Tienda.precio0 > promedio) {
	    preciosMayoresPromedio++;
	}

	if (Tienda.precio1 > promedio) {
	    preciosMayoresPromedio++;
	}

	if (Tienda.precio2 > promedio) {
	    preciosMayoresPromedio++;
	}

	if (Tienda.precio3 > promedio) {
	    preciosMayoresPromedio++;
	}

	if (Tienda.precio4 > promedio) {
	    preciosMayoresPromedio++;
	}
	
	switch (ind) {
	case 0:
			print("/* --------------- VENTAS POR MODELO --------------- */");
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo0);
			print("Cantidad de ventas\t\t: "+Tienda.canven0);
			print("Cantidad de unidades vendidas\t\t:"+Tienda.canuni0);
			print("Importe total vendido\t\t: S/."+ String.format("%.2f", Tienda.imptot0));
			print("Aporte a  la cuota diaria\t\t: "+(Tienda.imptot0/Tienda.cuotaDiaria)*100+"%");
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo1);
			print("Cantidad de ventas\t\t: "+Tienda.canven1);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni1);
			print("Importe total vendido\t\t: S/."+String.format("%.2f",Tienda.imptot1));
			print("Aporte a  la cuota diaria\t\t: "+(Tienda.imptot1/Tienda.cuotaDiaria)*100+"%");
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo2);
			print("Cantidad de ventas\t\t: "+Tienda.canven2);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni2);
			print("Importe total vendido\t\t: S/."+String.format("%.2f",Tienda.imptot2));
			print("Aporte a  la cuota diaria\t\t: "+(Tienda.imptot2/Tienda.cuotaDiaria)*100+"%");
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo3);
			print("Cantidad de ventas\t\t: "+Tienda.canven3);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni3);
			print("Importe total vendido\t\t: S/."+String.format("%.2f",Tienda.imptot3));
			print("Aporte a  la cuota diaria\t\t: "+(Tienda.imptot3/Tienda.cuotaDiaria)*100+"%");
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo4);
			print("Cantidad de ventas\t\t: "+Tienda.canven4);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni4);
			print("Importe total vendido\t\t: S/."+String.format("%.2f",Tienda.imptot4));
			print("Aporte a  la cuota diaria\t\t: "+(Tienda.imptot4/Tienda.cuotaDiaria)*100+"%");
			break;
			
	case 1: 
			print("/* --------------- VENTAS EN RELACION A LA VENTA OPTIMA --------------- */");
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo0);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni0);
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo1);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni1);
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo2);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni2);
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo3);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni3);
			print("");
			print("Modelo\t\t\t: "+Tienda.modelo4);
			print("Cantidad de unidades vendidas\t\t: "+Tienda.canuni4);
			break;
		
	case 2: 
			print("/* --------------- PRECIOS EN RELACI�N AL PRECIO PROMEDIO --------------- */");
			print("");
			print("Modelo\t\t: "+Tienda.modelo0);
			print("Precio\t\t: "+Tienda.precio0);
			print("");
			print("Modelo\t\t: "+Tienda.modelo1);
			print("Precio\t\t: "+Tienda.precio1);
			print("");
			print("Modelo\t\t: "+Tienda.modelo2);
			print("Precio\t\t: "+Tienda.precio2);
			print("");
			print("Modelo\t\t: "+Tienda.modelo3);
			print("Precio\t\t: "+Tienda.precio3);
			print("");
			print("Modelo\t\t: "+Tienda.modelo4);
			print("Precio\t\t: "+Tienda.precio4);
			print("");
			break;
	case 3: 
			print("/* --------------- GENERAL --------------- */");
			print("");
			print("Precio promedio ...........................\t:" + String.format("%.2f",promedio));
			print("");
			print("Precio Menor .................................\t:" + menorPrecio);
			print("");
			print("Precio Mayor ..................................\t:" + mayorPrecio);
			print("");
			print("Cantidad de precios mayores al precio promedio ..........................\t: " + preciosMayoresPromedio);
			print("");
			print("Cantidad de modelos sin ventas ..........................\t: " + modelosSinVender);
			print(""); 
		
	}
	}

	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}



}


 





