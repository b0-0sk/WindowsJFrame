package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar toolbar;
    private JMenu option;
    private JMenuItem tablas;
    public Formulario() {
    	setLayout(null);
        toolbar=new JMenuBar();
        setJMenuBar(toolbar);
        option=new JMenu("Options");
        toolbar.add(option);
        tablas=new JMenuItem("Tablas");
        tablas.addActionListener(this);
        option.add(tablas);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
    	//Container f=this.getContentPane();
        if (e.getSource()==tablas) {
        	Menu n=new Menu(); //esto es para manejar la ventana se hace la variable que es la clase 
			//que ya anteriormente la hicimos tipo JFrame
			n.setSize(800,600); //tamaño de la ventana
			n.setVisible(true); //que se visible
			n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //instruccion de cierre
			n.setLocationRelativeTo(null); //hacer que este centrada en la pantalla   
		}
         
    }
    

    
    public static void main(String[] ar) {
    	
    	
        Formulario formulario1 = new Formulario();
        formulario1.setSize(800,600); //tamaño de la ventana
        formulario1.setVisible(true); //que se visible
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //instruccion de cierre
        formulario1.setLocationRelativeTo(null); //hacer que este centrada en la pantalla   
	
    }     
}