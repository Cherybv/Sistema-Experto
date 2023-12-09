import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;

public class consulta extends JFrame implements ActionListener, ChangeListener{
    public	JLabel e1;
	public JCheckBox chB1,chB2,chB3,chB4,chB5,chB6,chB7,chB8,chB9,chB10,chB11;
	public JTextField cT1;
	public JButton b1,b2;
	public JTextArea a,a1;
	int opcion=1;
    public String cadenamat, name, cadenaest;
    public JScrollPane scroll, scroll1;

    public consulta(){	//Inicio del constructor
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(58,233,150));
		setTitle("Consulta");
		setIconImage(new ImageIcon(getClass().getResource("consulta.jpeg")).getImage());

		Font f = new Font ("Arial" , Font.BOLD, 40);
		Font f1 = new Font ("Arial" , Font.BOLD, 30);
		Font f2 = new Font ("Arial" , Font.BOLD, 20);

		e1 = new JLabel("Consulta");
		e1.setBounds(650,30,400,45);
		e1.setFont(f);
		add(e1);

        e1 = new JLabel("Estudios requeridos");
		e1.setBounds(650,280,400,45);
		e1.setFont(f2);
		add(e1);

//datos
		e1 = new JLabel("Nombre de la mascota");
		e1.setBounds(50,30,200,20);
		add(e1);
		cT1 = new JTextField("");
		cT1.setBounds(50,55,200,20);
		add(cT1);


//servicios		
		e1 = new JLabel("Sintomas");
		e1.setBounds(200,100,2000,35);
		e1.setFont(f1);
		add(e1);
		chB1 = new JCheckBox(" Gestación");
		chB1.setBounds(50,140,150,20);
		chB1.setFont(f2);
		add(chB1);
		chB2 = new JCheckBox(" Fractura");
		chB2.setBounds(50,180,150,20);
		chB2.setFont(f2);
		add(chB2);
		chB3 = new JCheckBox(" Diarrea");
		chB3.setBounds(50,220,150,20);
		chB3.setFont(f2);
		add(chB3);
		chB4 = new JCheckBox(" Vomito");
		chB4.setBounds(50,260,150,20);
		chB4.setFont(f2);
		add(chB4);
		chB5 = new JCheckBox(" Heces con moco");
		chB5.setBounds(50,300,200,20);
		chB5.setFont(f2);
		add(chB5);
		chB6 = new JCheckBox(" Ojos llorosos");
		chB6.setBounds(50,340,200,20);
		chB6.setFont(f2);
		add(chB6);
		chB7 = new JCheckBox(" Caida de pelo");
		chB7.setBounds(50,380,200,20);
		chB7.setFont(f2);
		add(chB7);
		chB8 = new JCheckBox(" Flatulencias frecuentes");
		chB8.setBounds(50,420,300,20);
		chB8.setFont(f2);
		add(chB8);
        chB9 = new JCheckBox(" Decaimiento");
		chB9.setBounds(400,140,200,20);
		chB9.setFont(f2);
		add(chB9);
        chB10 = new JCheckBox(" Fiebre");
		chB10.setBounds(400,180,200,20);
		chB10.setFont(f2);
		add(chB10);
        chB11 = new JCheckBox(" Perdida de peso");
		chB11.setBounds(400,220,200,20);
		chB11.setFont(f2);
		add(chB11);

		chB1.addChangeListener(this);
		chB2.addChangeListener(this);
		chB3.addChangeListener(this);
		chB4.addChangeListener(this);
		chB5.addChangeListener(this);
		chB6.addChangeListener(this);
		chB7.addChangeListener(this);
		chB8.addChangeListener(this);
        chB9.addChangeListener(this);
        chB10.addChangeListener(this);
        chB11.addChangeListener(this);


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

        a1 = new JTextArea("");
        scroll1 = new JScrollPane (a1);
		scroll1.setBounds(650,320,300,150);
		add(scroll1);

    }


	public void stateChanged(ChangeEvent m){
        name = cT1.getText();
        cadenamat = "El paciente " + name + " presenta";
        cadenaest = "El paciente " + name + " requiere estudios";
        if(chB1.isSelected()==true){
			cadenamat = cadenamat + ("\n- Gestación");
		}
        if(chB2.isSelected()==true){
			cadenamat = cadenamat + ("\n- Fractura");
		}
         if(chB3.isSelected()==true){
			cadenamat = cadenamat + ("\n- Diarrea");
		}
         if(chB4.isSelected()==true){
			cadenamat = cadenamat + ("\n- Vomito");
		}
         if(chB5.isSelected()==true){
			cadenamat = cadenamat + ("\n- Heces con moco");
		}
         if(chB6.isSelected()==true){
			cadenamat = cadenamat + ("\n- Ojos llorosos");
		}
         if(chB7.isSelected()==true){
			cadenamat = cadenamat + ("\n- Caida de pelo");
		}
         if(chB8.isSelected()==true){
			cadenamat = cadenamat + ("\n- Flatulencias frecuentes");
		}
         if(chB9.isSelected()==true){
			cadenamat = cadenamat + ("\n- Decaimiento");
		}
         if(chB10.isSelected()==true){
			cadenamat = cadenamat + ("\n- Fiebre");
		}
         if(chB11.isSelected()==true){
			cadenamat = cadenamat + ("\n- Perdida de peso");
		}


        cadenaest = "El paciente " + name + " requiere estudios";
        if(chB1.isSelected()==true){
			cadenaest = cadenaest + ("\n- Ultrasonido abdominal");
		}
        if((chB2.isSelected() || chB11.isSelected())==true){
			cadenaest = cadenaest + ("\n- Rayos X");
		}
        if((chB3.isSelected() || chB5.isSelected())==true){
			cadenaest = cadenaest + ("\n- Miscroscopia");
		}
        if((chB4.isSelected() || chB9.isSelected())==true){
			cadenaest = cadenaest + ("\n- Biometria Hemática");
		}
        if((chB6.isSelected() )==true){
			cadenaest = cadenaest + ("\n- Ultrasonido ocular");
		}
        if((chB7.isSelected() || chB9.isSelected() || chB11.isSelected())==true){
			cadenaest = cadenaest + ("\n- Química Sanguínea");
		}
        
	}

    public void actionPerformed(ActionEvent m){
        if(m.getSource() == b1){
			a.setText(cadenamat);
            a1.setText(cadenaest);
            String nombreArchivo = name + "c.txt";
            e1 = new JLabel("Guardado: " + nombreArchivo);
		    e1.setBounds(50,450,500,20);
		    add(e1);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Escribir la información en el archivo
            writer.write(cadenamat + "\n\n\n" + cadenaest);
            e1 = new JLabel("Guardado: " + nombreArchivo);
		    e1.setBounds(50,450,500,20);
		    add(e1);
        //    System.out.println("Información guardada en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al guardar la información en el archivo: " + nombreArchivo);
        }
		}	
		if(m.getSource() == b2){
			opcion = JOptionPane.showConfirmDialog(null," ¿Estas Seguro? " );
		}else{}
		if(opcion == 0){
			dispose();	
		}
    
    }

    public static void main (String args [] ){
		consulta v = new consulta();
		v.setBounds(75,100,1200,600);
		v.setVisible(true);
		v.setResizable(false);
	}
}
