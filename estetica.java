import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;

public class estetica extends JFrame implements ActionListener, ChangeListener{
    public	JLabel e1;
	public JCheckBox chB1,chB2,chB3,chB4,chB5,chB6,chB7,chB8;
	public JTextField cT1;
	public JButton b1,b2;
	public JTextArea a;
	int opcion=1;
	public String name, cadenae;
	public JScrollPane scroll;


    public estetica(){	//Inicio del constructor
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(58,233,150));
		setTitle("Estetica");
		setIconImage(new ImageIcon(getClass().getResource("estetica.jpeg")).getImage());

		Font f = new Font ("Arial" , Font.BOLD, 40);
		Font f1 = new Font ("Arial" , Font.BOLD, 30);
		Font f2 = new Font ("Arial" , Font.BOLD, 20);

		e1 = new JLabel("Estetica");
		e1.setBounds(650,30,400,45);
		e1.setFont(f);
		add(e1);

//datos
		e1 = new JLabel("Nombre de la mascota");
		e1.setBounds(150,30,200,20);
		add(e1);
		cT1 = new JTextField("");
		cT1.setBounds(150,55,200,20);
		add(cT1);

//servicios		
		e1 = new JLabel("Servicios");
		e1.setBounds(200,100,2000,35);
		e1.setFont(f1);
		add(e1);
		chB1 = new JCheckBox(" Baño");
		chB1.setBounds(150,140,150,20);
		chB1.setFont(f2);
		add(chB1);
		chB2 = new JCheckBox(" Corte de pelo");
		chB2.setBounds(150,180,200,20);
		chB2.setFont(f2);
		add(chB2);
		chB3 = new JCheckBox(" Corte de uñas");
		chB3.setBounds(150,220,200,20);
		chB3.setFont(f2);
		add(chB3);
		chB4 = new JCheckBox(" Limpieza de oidos");
		chB4.setBounds(150,260,250,20);
		chB4.setFont(f2);
		add(chB4);
		chB5 = new JCheckBox(" Limpieza de glandulas anales");
		chB5.setBounds(150,300,350,20);
		chB5.setFont(f2);
		add(chB5);
		chB6 = new JCheckBox(" Hidratación de cojinetes y nariz");
		chB6.setBounds(150,340,350,20);
		chB6.setFont(f2);
		add(chB6);
		chB7 = new JCheckBox(" Aromaterapia");
		chB7.setBounds(150,380,200,20);
		chB7.setFont(f2);
		add(chB7);
		chB8 = new JCheckBox(" Perfume");
		chB8.setBounds(150,420,150,20);
		chB8.setFont(f2);
		add(chB8);

		chB1.addChangeListener(this);
		chB2.addChangeListener(this);
		chB3.addChangeListener(this);
		chB4.addChangeListener(this);
		chB5.addChangeListener(this);
		chB6.addChangeListener(this);
		chB7.addChangeListener(this);
		chB8.addChangeListener(this);

//botones
		b1 = new JButton("Guardar");
		b1.setBounds(650,500,120,40);
		add(b1);

		b2 = new JButton("Cerrar");
		b2.setBounds(850,500,120,40);
		add(b2);

//Agregar las opciones de botones
		b1.addActionListener(this);
		b2.addActionListener(this);

//Area de texto		
		a = new JTextArea("");
		scroll = new JScrollPane (a);
		scroll.setBounds(650,90,300,150);
		add(scroll);

    }

    
    public void actionPerformed(ActionEvent m){	
			if(m.getSource() == b1){
			a.setText(cadenae);
            String nombreArchivo = name + "e.txt";
            e1 = new JLabel("Guardado: " + nombreArchivo);
		    e1.setBounds(50,450,500,20);
		    add(e1);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Escribir la información en el archivo
            writer.write(cadenae);
            e1 = new JLabel("Guardado: " + nombreArchivo);
		    e1.setBounds(50,450,500,20);
		    add(e1);
        //    System.out.println("Información guardada en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al guardar la información en el archivo: " + nombreArchivo);
        };
		}
		if(m.getSource() == b2){
			opcion = JOptionPane.showConfirmDialog(null," ¿Estas Seguro? " );
		}else{}
		if(opcion == 0){
			dispose();	
		}
    }

	public void stateChanged(ChangeEvent m){
		name =cT1.getText();
		cadenae =  name + " requiere";
        if(chB1.isSelected()==true){
			cadenae = cadenae + ("\n- Baño");
		}
        if(chB2.isSelected()==true){
			cadenae = cadenae + ("\n- Corte de pelo");
		}
         if(chB3.isSelected()==true){
			cadenae = cadenae + ("\n- Corte de uñas");
		}
         if(chB4.isSelected()==true){
			cadenae = cadenae + ("\n- Limpieza de oidos");
		}
         if(chB5.isSelected()==true){
			cadenae = cadenae + ("\n- Limpieza de glandulas anales");
		}
         if(chB6.isSelected()==true){
			cadenae = cadenae + ("\n- Hidratacion de cojines y nariz");
		}
         if(chB7.isSelected()==true){
			cadenae = cadenae + ("\n- Aromaterapia");
		}
         if(chB8.isSelected()==true){
			cadenae = cadenae + ("\n- Perfume");
		}
	}

    public static void main (String args [] ){
		estetica v = new estetica();
		v.setBounds(75,100,1200,600);
		v.setVisible(true);
		v.setResizable(false);
	}
}
