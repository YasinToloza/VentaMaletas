package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tienda extends JFrame implements ActionListener {

	public static String ventaspormodelo = "Ventas por Modelo";
	// Datos m�nimos de la primera maleta
	public static String modelo0 = "Aviator";
	public static double precio0 = 134.9;
	public static int ancho0 = 50;
	public static int alto0 = 70;
	public static int fondo0 = 25;
	public static double peso0 = 2.4;
	public static int canven0;
	public static int canuni0;
	public static double imptot0;
	
	// Datos m�nimos de la segunda maleta
	public static String modelo1 = "Lucca";
	public static double precio1 = 169.9;
	public static int ancho1 = 60;
	public static int alto1 = 90;
	public static int fondo1 = 35;
	public static double peso1 = 4.8;
	public static int canven1;
	public static int canuni1;
	public static double imptot1;
	
	// Datos m�nimos de la tercera maleta
	public static String modelo2 = "Samsonite";
	public static double precio2 = 136.9;
	public static int ancho2 = 55;
	public static int alto2 = 75;
	public static int fondo2 = 30;
	public static double peso2 = 3.2;
	public static int canven2;
	public static int canuni2;
	public static double imptot2;
	
	// Datos m�nimos de la cuarta maleta
	public static String modelo3 = "Century";
	public static double precio3 = 119.9;
	public static int ancho3 = 45;
	public static int alto3 = 60;
	public static int fondo3 = 27;
	public static double peso3 = 2.3;
	public static int canven3;
	public static int canuni3;
	public static double imptot3;
	
	// Datos m�nimos de la quinta maleta
	public static String modelo4 = "Saxoline";
	public static double precio4 = 159.9;
	public static int ancho4 = 70;
	public static int alto4 = 80;
	public static int fondo4 = 37;
	public static double peso4 = 5.2;
	public static int canven4;
	public static int canuni4;
	public static double imptot4;
	
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15;
	
	// Obsequios
	public static String obsequio1 = "Lapicero";
	public static String obsequio2 = "Cuaderno";
	public static String obsequio3 = "USB";
	
	// Cantidad �ptima de unidades vendidas
	public static int cantidadOptima = 10;
	
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnMantenimiento;
	private JMenu mnNewMenu_1;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarMaletas;
	private JMenuItem mntmModificarMaleta;
	private JMenuItem mntmListaDeMaletas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmCuotaDiaria;
	private JMenuItem mntmAcercaDeLaTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setFont(new Font("Arial", Font.PLAIN, 11));
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 370);
		setResizable(false);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnNewMenu);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setFont(new Font("Arial", Font.PLAIN, 11));
		mntmSalir.addActionListener(this);
		mnNewMenu.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnMantenimiento);
		
		mntmConsultarMaletas = new JMenuItem("Consultar maleta");
		mntmConsultarMaletas.setFont(new Font("Arial", Font.PLAIN, 11));
		mntmConsultarMaletas.addActionListener(this);
		mnMantenimiento.add(mntmConsultarMaletas);
		
		mntmModificarMaleta = new JMenuItem("Modificar maleta");
		mntmModificarMaleta.setFont(new Font("Arial", Font.PLAIN, 11));
		mntmModificarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmModificarMaleta);
		
		mntmListaDeMaletas = new JMenuItem("Listar Maletas");
		mntmListaDeMaletas.addActionListener(this);
		mntmListaDeMaletas.setFont(new Font("Arial", Font.PLAIN, 11));
		mnMantenimiento.add(mntmListaDeMaletas);
		
		mnNewMenu_1 = new JMenu("Ventas");
		mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnNewMenu_1);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mntmVender.setFont(new Font("Arial", Font.PLAIN, 11));
		mnNewMenu_1.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mntmGenerarReportes.setFont(new Font("Arial", Font.PLAIN, 11));
		mnNewMenu_1.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n ");
		mnConfiguracion.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mntmConfigurarDescuentos.setFont(new Font("Arial", Font.PLAIN, 11));
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mntmConfigurarObsequios.setFont(new Font("Arial", Font.PLAIN, 11));
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadOptima = new JMenuItem("Cantidad \u00F3ptima");
		mntmConfigurarCantidadOptima.addActionListener(this);
		mntmConfigurarCantidadOptima.setFont(new Font("Arial", Font.PLAIN, 11));
		mnConfiguracion.add(mntmConfigurarCantidadOptima);
		
		mntmCuotaDiaria = new JMenuItem("Cuota Diaria");
		mntmCuotaDiaria.addActionListener(this);
		mntmCuotaDiaria.setFont(new Font("Arial", Font.PLAIN, 11));
		mnConfiguracion.add(mntmCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setFont(new Font("Arial", Font.PLAIN, 11));
		menuBar.add(mnAyuda);
		
		mntmAcercaDeLaTienda = new JMenuItem("Acerca de la Tienda");
		mntmAcercaDeLaTienda.addActionListener(this);
		mntmAcercaDeLaTienda.setFont(new Font("Arial", Font.PLAIN, 11));
		mnAyuda.add(mntmAcercaDeLaTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmAcercaDeLaTienda) {
			actionPerformedMntmAcercaDeLa(arg0);
		}
		if (arg0.getSource() == mntmCuotaDiaria) {
			actionPerformedMntmCuotaDiaria(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidadOptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListaDeMaletas) {
			actionPerformedMntmListaDeMaletas(arg0);
		}
		if (arg0.getSource() == mntmModificarMaleta) {
			actionPerformedMntmModificarMaleta(arg0);
		}
		if (arg0.getSource() == mntmConsultarMaletas) {
			actionPerformedMntmConsultarMaletas(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
	dispose();
	}
	protected void actionPerformedMntmConsultarMaletas(ActionEvent arg0) 
	{ consultar_maletas cm= new consultar_maletas();
	cm.setLocationRelativeTo(this);
	cm.setVisible(true);
	}
	protected void actionPerformedMntmModificarMaleta(ActionEvent arg0) 
	{ modificar_maleta mm= new modificar_maleta();
	mm.setLocationRelativeTo(this);
	mm.setVisible(true);
	}
	protected void actionPerformedMntmListaDeMaletas(ActionEvent arg0) 
	{ listar_maletas lm= new listar_maletas();
	lm.setLocationRelativeTo(this);
	lm.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) 
	{ vender v= new vender();
	v.setLocationRelativeTo(this);
	v.setVisible(true);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) 
	{generar_reportes gr= new generar_reportes();
	gr.setLocationRelativeTo(this);
	gr.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) 
	{configurar_descuentos cd= new configurar_descuentos();
	cd.setLocationRelativeTo(this);
	cd.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequios(ActionEvent arg0) 
	{ configurar_obsequios co= new configurar_obsequios();
	co.setLocationRelativeTo(this);
	co.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCantidadOptima(ActionEvent arg0) 
	{configurar_cantidad_optima cco= new configurar_cantidad_optima();
	cco.setLocationRelativeTo(this);
	cco.setVisible(true);
	}
	protected void actionPerformedMntmCuotaDiaria(ActionEvent arg0) 
	{configurar_couta_diaria ccd= new configurar_couta_diaria();
	ccd.setLocationRelativeTo(this);
	ccd.setVisible(true);
	}
	protected void actionPerformedMntmAcercaDeLa(ActionEvent arg0) 
	{acerca_de_tienda ac= new acerca_de_tienda();
	ac.setLocationRelativeTo(this);
	ac.setVisible(true);
	}
}
