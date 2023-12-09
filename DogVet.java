import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DogVet extends JFrame implements ActionListener{
	public	JLabel e1;
	public JButton b1,b2;


    public DogVet(){
        setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(53,208,201));
		setTitle("Hospital Veterinario San Javier");
		setIconImage(new ImageIcon(getClass().getResource("sj.jpeg")).getImage());

//Fuentes
		Font f1 = new Font ("Arial" , Font.BOLD, 30);
		//Font f2 = new Font ("Arial" , Font.BOLD, 12);

//Titulo
		e1 = new JLabel ("Hospital Veterinario San Javier");
		e1.setFont(f1);
		e1.setBounds(450,40,600,35);
		add(e1);

//Estetica
		ImageIcon i1 = new ImageIcon("estetica.jpeg");
		e1 = new JLabel(i1);
		e1.setBounds(300,180,300,300);
		Icon icon1 = new ImageIcon (i1.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e1.setIcon(icon1);
		add(e1); 

		b1 = new JButton("Estetica");
		b1.setBounds(400,500,120,40);
		add(b1);


//Consulta
		ImageIcon i2 = new ImageIcon("consulta.jpeg");
		e1 = new JLabel(i2);
		e1.setBounds(700,180,350,300);
		Icon icon2 = new ImageIcon (i2.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e1.setIcon(icon2);
		add(e1); 

		b2 = new JButton("Consulta");
		b2.setBounds(825,500,120,40);
		add(b2);

//Agregar las opciones de botones
		b1.addActionListener(this);
		b2.addActionListener(this);
	
    }

//Metodo actionPerformed
		public void actionPerformed(ActionEvent m){	
			if(m.getSource() == b1){
				estetica v2 = new estetica();
				v2.setBounds(75,100,1200,600);
				v2.setVisible(true);
				v2.setResizable(false);
			}
			if(m.getSource() == b2){
				consulta v2 = new consulta();
				v2.setBounds(75,100,1200,600);
				v2.setVisible(true);
				v2.setResizable(false);
			}
		}
//Main
	public static void main (String args [] ){
		DogVet v = new DogVet();
		v.setExtendedState(JFrame.MAXIMIZED_BOTH);
		v.setVisible(true);
		v.setResizable(false);
	}//Fin del main
}