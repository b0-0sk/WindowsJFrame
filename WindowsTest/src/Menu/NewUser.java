package Menu;
import java.awt.Point;
import java.awt.event.*;
 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
 
 
 
public class NewUser extends JFrame implements ActionListener{
	
 
	private JComboBox<String> combo;
 
	private JScrollPane scroll;
	private Object[] fieldsClient,dataClient,clientInput;
	private DefaultTableModel client;
	private JTable clientTable;
 
	private JTextArea area,surname,telf;
 
	private JButton btNewClient,btEdit;
 
	private JTextField id_client;
 
public NewUser()  {
	
	setLayout(null);
 
	id_client=new JTextField("id_client");
	id_client.setEditable(false);
	id_client.setBounds(50,100,100,20);
	id_client.setVisible(true);
	add(id_client);
	 
    area=new JTextArea("cualquier cosa");
    area.setBounds(50,130,100,20);
    area.setVisible(true);
    add(area);
    
    /*text=new JTextField("id_client");
	text.setEditable(false);
	text.setBounds(50,100,250,20);
	text.setVisible(true);
	add(text);
	 
    area=new JTextArea("cualquier cosa");
    area.setBounds(50,130,250,20);
    area.setVisible(true);
    add(area);
 */
 
   
     
    
 
    //todos los elementos los hicimos invisibles
 
}


public static void main (String[]args){
	
	NewUser n=new NewUser(); //esto es para manejar la ventana se hace la variable que es la clase 
					   //que ya anteriormente la hicimos tipo JFrame
	n.setSize(600,400); //tamaño de la ventana
	n.setVisible(true); //que se visible
	n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //instruccion de cierre
	//n.setLocationRelativeTo(null); //hacer que este centrada en la pantalla
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	 if (arg0.getSource() == btNewClient){
		
	 }
	 if (arg0.getSource() == btEdit){
	 
	 }
	
}
}