import java.awt.Point;
import java.awt.event.*;
 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
 
 
 
public class Menu2 extends JFrame implements ItemListener{
	//aqui hago que la clase Menu sea combo JFrame y pueda usar el ItemListener que
	//es para el JComboBox
 
	private JComboBox combo;
	//este JComboBox servira para cambiar los elementos del menu
 
	private JScrollPane scroll;
	private Object[][] datoss;
	private String[] datos;
	private DefaultTableModel dtm;
	private JTable tabla;
	//Esta es la tabla
 
	private JTextArea area;
 
	private JButton boton;
 
	private JTextField text;
 
public Menu2(){
	setLayout(null);
 
	combo =new JComboBox();
    combo.setBounds(50,50,200,30);
    
    combo.addItem("TextArea");
    combo.addItem("JTable");
    combo.addItem("JButton");
    combo.addItem("JTextField");
    add(combo);
    combo.addItemListener(this);
    //se agrega el JComboBox y se le agregan los elementos que contendra
 
    scroll      = new JScrollPane();
    datos    = new String[] {"id_client","cif","name","surname","telf","email","cp","province","iban","goodPayer"};
    
    dtm         = new DefaultTableModel(datoss,datos);
    tabla       = new JTable(dtm);
    scroll.setViewportView(tabla);
    scroll.setBounds(40,150,700,200);
    scroll.setVisible(false);
    add(scroll);
 
    area=new JTextArea("cualquier cosa");
    area.setBounds(50,200,100,100);
    area.setVisible(false);
    add(area);
 
 
    text=new JTextField("cualquier cosa x2");
    text.setBounds(50,200,100,25);
    text.setVisible(false);
    add(text);
 
    boton=new JButton("New Client");
    boton.setBounds(50,200,100,25);
    boton.setVisible(false);
    add(boton);
 
    //todos los elementos los hicimos invisibles
 
}
public void itemStateChanged(ItemEvent e){
	//con el JComboBox solo haremos visibles e invisibles unos y otros es mucho codigo pero cumple lo que pediste
 
	 if (e.getSource()==combo) { //aqui detecta si se hace un cambio en el JComboBox
		 
		 String tip=(String)combo.getSelectedItem(); //Se hace una variable que contiene lo que dice la opcion seleccionada
 
		 switch (tip){ //con el switch comparamos cada opcion posible y le damos una accion
		 case "TextArea":
			 scroll.setVisible(true);
			 area.setVisible(true);
			 boton.setVisible(false);
			 text.setVisible(false);
			 break;
		 case "JTable":
			 scroll.setVisible(true);
			 area.setVisible(false);
			 boton.setVisible(false);
			 text.setVisible(false);
			 break;
		 case "JButton":
			 scroll.setVisible(false);
			 area.setVisible(false);
			 boton.setVisible(true);
			 text.setVisible(false);
			 break;
		 case "JTextField":
			 scroll.setVisible(false);
			 area.setVisible(false);
			 boton.setVisible(false);
			 text.setVisible(true);
			 break;
		 }
	 }
 
}
public static void main (String[]args){
	Menu2 n=new Menu2(); //esto es para manejar la ventana se hace la variable que es la clase 
					   //que ya anteriormente la hicimos tipo JFrame
	n.setSize(800,600); //tamaño de la ventana
	n.setVisible(true); //que se visible
	n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //instruccion de cierre
	n.setLocationRelativeTo(null); //hacer que este centrada en la pantalla
}
}