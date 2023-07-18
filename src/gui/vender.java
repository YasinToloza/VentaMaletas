package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class vender extends JDialog implements ActionListener {
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			vender dialog = new vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public vender() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Vender");
		setFont(new Font("Arial", Font.PLAIN, 11));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setModal(true);
		setResizable(false);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setFont(new Font("Arial", Font.PLAIN, 11));
			lblModelo.setBounds(10, 11, 46, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setFont(new Font("Arial", Font.PLAIN, 11));
			lblPrecio.setBounds(10, 36, 57, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Arial", Font.PLAIN, 11));
			lblCantidad.setBounds(10, 64, 46, 14);
			getContentPane().add(lblCantidad);
		}
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Aviator", "Lucca", "Samsonite", "Century", "Saxoline"}));
		cboModelo.setBounds(82, 8, 119, 20);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(82, 33, 119, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(82, 61, 119, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setFont(new Font("Arial", Font.PLAIN, 11));
		btnVender.setBounds(322, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCerrar.setBounds(322, 41, 89, 23);
		getContentPane().add(btnCerrar);
		
		scp = new JScrollPane();
		scp.setBounds(10, 102, 414, 148);
		getContentPane().add(scp);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setFont(new Font("Arial", Font.PLAIN, 12));
		scp.setViewportView(txtS);
		txtPrecio.setText(Tienda.precio0+"");
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboModelo) {
			actionPerformedCboModelo(arg0);
		}
		if (arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnBorrar(arg0);
		}
	}
	
	double suma=0;
	int CuentaVent=0;
	
	
	protected void actionPerformedBtnBorrar(ActionEvent arg0) 
	{ dispose();
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) 
	{
     int Cantidad,Modelo;
     double impC,impD,impP,Precio;
     String Obsequio;
          
     Modelo=cboModelo.getSelectedIndex();
     Cantidad=Integer.parseInt(txtCantidad.getText());
     Precio=Double.parseDouble(txtPrecio.getText());
     
     //Proceso
     //Calcular impC
     switch(Modelo)
     {case 0: impC=Precio*Cantidad;
     case 1: impC=Precio*Cantidad;
     case 2: impC=Precio*Cantidad;
     default: impC=Precio*Cantidad;
     }
     
     //Calcular impD
     if (Cantidad<=5) impD=Tienda.porcentaje1*impC/100;
     else if (Cantidad<=10) impD=Tienda.porcentaje2*impC/100;
     else if (Cantidad<=15) impD=Tienda.porcentaje3*impC/100;
     else impD=Tienda.porcentaje4/100;
     
     //Calcular impC
     impP=impC-impD;
     
     suma=suma+impP;
     
     //Calcular obsequio
     if (Cantidad==1) Obsequio=Tienda.obsequio1;
     else if (Cantidad<=5) Obsequio=Tienda.obsequio2;
     else Obsequio=Tienda.obsequio3;
     
     //Salida de datos
     txtS.setText("/* ----------------- BOLETA DE VENTA ----------------- */"+"\n"+"\n");
     txtS.append("Modelo:\t\t "+cboModelo.getSelectedItem()+"\n");
     txtS.append("Precio:\t\t S/. "+ String.format("%.2f" ,Precio) + "\n");
     txtS.append("Cantidad:\t\t "+Cantidad+"\n");
     txtS.append("Importe compra:\tS/. "+ String.format("%.2f" ,impC) +"\n");
     txtS.append("Importe descuento:\tS/." +String.format("%.2f", impD) +"\n");
     txtS.append("Importe pagar:\t\tS/. "+ String.format("%.2f",impP) +"\n");
     txtS.append("Obsequio:\t\t "+Obsequio+"\n");
     
     CuentaVent =CuentaVent+1;
     Resumen(cboModelo.getSelectedIndex(), impP, Cantidad);
     if(CuentaVent>=5){
     double por=(suma/Tienda.cuotaDiaria)*100;

     JOptionPane.showMessageDialog(null, "venta N°" + CuentaVent +"\n"+"Importe total general acumulado :"+String.format("%.2f",suma)+"\n porcentaje de la cuota diaria:"+String.format("%.2f",por)+"%");}
	}
   
     void Resumen(int Modelo, double impP, int Cantidad){
 		switch(Modelo){
 		case 0: Tienda.canven0++; 
 		              Tienda.canuni0=Tienda.canuni0+Cantidad; 
 		              Tienda.imptot0=Tienda.imptot0+impP;
 		              break;
 		case 1: Tienda.canven1++; 
 					Tienda.canuni1=Tienda.canuni1+Cantidad; 
 					Tienda.imptot1=Tienda.imptot1+impP;
 					break;            
 		case 2: 	Tienda.canven2++; 
 						Tienda.canuni2=Tienda.canuni2+Cantidad; 
 						Tienda.imptot2=Tienda.imptot2+impP;
 						break;    
 		case 3: Tienda.canven3++; 
 					Tienda.canuni3=Tienda.canuni3+Cantidad; 
 					Tienda.imptot3=Tienda.imptot3+impP;
 					break;    
 		case 4: Tienda.canven4++; 
 					Tienda.canuni4=Tienda.canuni4+Cantidad; 
 					Tienda.imptot4=Tienda.imptot4+impP;
 					break;   
	
 		}}
 		
 		protected void actionPerformedCboModelo(ActionEvent arg0) 
	{switch(LeerModelo())
	{case 0: MostrarPrecio(Tienda.precio0);
	break;
	case 1: MostrarPrecio(Tienda.precio1);
	break;
	case 2: MostrarPrecio(Tienda.precio2);
	break;
	case 3: MostrarPrecio(Tienda.precio3);
	break; 
	default: MostrarPrecio(Tienda.precio4);
	}
}
	int LeerModelo()
	{return cboModelo.getSelectedIndex();}
	
	void MostrarPrecio(double precio)
	{txtPrecio.setText(precio+"");}
	
	
}


