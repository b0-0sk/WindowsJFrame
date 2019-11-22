package Menu;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;
 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
 
 
 
public class Menu extends JFrame implements ItemListener,ActionListener{
	//aqui hago que la clase Menu sea combo JFrame y pueda usar el ItemListener que
	//es para el JComboBox
 
	private JComboBox<String> combo;
	//este JComboBox servira para cambiar los elementos del menu
 
	private JScrollPane scroll;
	//private Object[][] datoss;
	//private String[] ;
	private Object[] dataClient;
	private DefaultTableModel client;
	private JTable clientTable;
	//Esta es la tabla
 
	private JTextArea area;
 
	private JButton btNewClient,btEdit;
 
	private JTextField text;
 
@SuppressWarnings("serial")
public Menu()  {
	
	setLayout(null);
 
	combo =new JComboBox<String>();
    combo.setBounds(50,50,200,30);
    
    combo.addItem("Client");
    combo.addItem("Providor");
    combo.addItem("Article");
    add(combo);
    combo.addItemListener(this);
    //se agrega el JComboBox y se le agregan los elementos que contendra
 
    scroll = new JScrollPane();
    dataClient = new Object[] {"aaaf","123456789S","nomUsuari","CognomUsurai","316289564","usarinoucorreu@coreu.cat","8740","barcelona en flames","E12343535","0"};
    //client = new DefaultTableModel(fieldsClient,0);
    client = new DefaultTableModel(
    
    	new Object[][]{},
    	new String[]{
    	
    		"id_client","cif","name","surname","telf","email","cp","province","iban","goodPayer"
    	
    	}
    ) {
    
    	public boolean isCellEditable(int rowIndex, int ColumnIndex){
    		return false;
    	}
    };
    
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    client.addRow(dataClient);
    
    //client.addColumn(clientInput);

    
    clientTable = new JTable(client);
    clientTable.setBackground(Color.WHITE);
    /*clientTable.setModel( new DefaultTableModel(
    
    	new Object[][]{
    		null,null,null,null,null,null,null,null,null,null,null,
    		null,null,null,null,null,null,null,null,null,null,null,
    		null,null,null,null,null,null,null,null,null,null,null,
    		null,null,null,null,null,null,null,null,null,null,null,
    		null,null,null,null,null,null,null,null,null,null,null
    	},
    	new String[]{
    	
    		"id_client","cif","name","surname","telf","email","cp","province","iban","goodPayer"
    	
    	}
    ) {
    
    	public boolean isCellEditable(int rowIndex, int ColumnIndex){
    		return false;
    	}
    }
    
    );*/
    
    
    
    scroll.setViewportView(clientTable);
    scroll.setBounds(40,150,700,200);
    scroll.setVisible(true);
    add(scroll);
    
    btNewClient=new JButton("New Client");
    btNewClient.setBounds(40,400,120,25);
    btNewClient.setVisible(true);
    add(btNewClient);
    btNewClient.addActionListener(this);
    
    btEdit=new JButton("Edit");
    btEdit.setBounds(170,400,120,25);
    btEdit.setVisible(true);
    add(btEdit);
    btEdit.addActionListener(this);

    /*btDelete=new JButton("Delete");
    btDelete.setBounds(300,400,120,25);
    btDelete.setVisible(true);
    add(btDelete);
    btDelete.addItemListener(this);

    
    btOK=new JButton("OK");
    btOK.setBounds(490,400,120,25);
    btOK.setVisible(true);
    add(btOK);
    btOK.addItemListener(this);

    btCancel=new JButton("Cancel");
    btCancel.setBounds(620,400,120,25);
    btCancel.setVisible(true);
    add(btCancel);
    btCancel.addItemListener(this);

    /*
    area=new JTextArea("cualquier cosa");
    area.setBounds(50,200,100,100);
    area.setVisible(false);
    add(area);
 
 
    text=new JTextField("cualquier cosa x2");
    text.setBounds(50,200,100,100);
    text.setVisible(false);
    add(text);
     */
    
 
    //todos los elementos los hicimos invisibles
 
}
public void itemStateChanged(ItemEvent e){
	//con el JComboBox solo haremos visibles e invisibles unos y otros es mucho codigo pero cumple lo que pediste
 
	 if (e.getSource()==combo) { //aqui detecta si se hace un cambio en el JComboBox
		 
		 String tip=(String)combo.getSelectedItem(); //Se hace una variable que contiene lo que dice la opcion seleccionada
 
		 switch (tip){ //con el switch comparamos cada opcion posible y le damos una accion
		 case "Client":
			 scroll.setVisible(true);
			 area.setVisible(false);
			 btNewClient.setVisible(true);
			 text.setVisible(false);
			 break;
		 case "Providor":
			 scroll.setVisible(false);
			 area.setVisible(false);
			 btNewClient.setVisible(true);
			 text.setVisible(false);
			 break;
		 case "Article":
			 scroll.setVisible(false);
			 area.setVisible(false);
			 btNewClient.setVisible(false);
			 text.setVisible(true);
			 break;
		 }
	 }
	
 
}

public static void main (String[]args){
	
	Menu n=new Menu(); //esto es para manejar la ventana se hace la variable que es la clase 
					   //que ya anteriormente la hicimos tipo JFrame
	n.setSize(800,600); //tamaño de la ventana
	n.setVisible(true); //que se visible
	n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //instruccion de cierre
	n.setLocationRelativeTo(null); //hacer que este centrada en la pantalla
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	 if (arg0.getSource() == btNewClient){
	 
		NewUser n=new NewUser(); //esto es para manejar la ventana se hace la variable que es la clase 
					   //que ya anteriormente la hicimos tipo JFrame
		n.setSize(600,400); //tamaño de la ventana
		n.setVisible(true); //que se visible
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //instruccion de cierre
		n.setLocationRelativeTo(null); //hacer que este centrada en la pantalla
	 }
	 if (arg0.getSource() == btEdit){
	 
	 }
	
}
}