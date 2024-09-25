
package agenda.telefonica;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ventana extends JFrame {
    persona datos[] = new persona[15];
    Scanner teclado=new Scanner(System.in);
    JPanel panelInicio = new JPanel();
    JTextField txtpantalla=new JTextField();
    JTextField txtValor1 = new JTextField();
    JTextField txtValor2 = new JTextField();
    JTextField txtValor3 = new JTextField();
    public ventana(){
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     public void insertarPanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setLayout(null); //desactivar la organización automática
    }
     public void insertarTexto() {
        txtValor1.setBounds(170, 50, 200, 35);
        panelInicio.add(txtValor1);
        txtValor1.repaint();
        
        txtValor2.setBounds(170, 100, 200, 35);
        panelInicio.add(txtValor2);
        txtValor2.repaint();
        
          txtValor3.setBounds(170, 150, 200, 35);
        panelInicio.add(txtValor3);
        txtValor3.repaint();

    }
public void insertarEtiquetas() {
        JLabel lblValor1 = new JLabel("Telenofono");
        lblValor1.setBounds(90, 20, 100, 100);
        panelInicio.add(lblValor1);
        lblValor1.repaint();

        JLabel lblValor2 = new JLabel("Nombre");
        lblValor2.setBounds(90, 65, 100, 100);
        panelInicio.add(lblValor2);
         lblValor2.repaint();
          JLabel lblValor3 = new JLabel("Correo");
        lblValor3.setBounds(90, 120, 100, 100);
        panelInicio.add(lblValor3);
         lblValor3.repaint();
    }
     public void insertarBotones() {
         JButton btn1 = new JButton("Guardar");
        btn1.setBounds(400, 50, 120, 30);
        panelInicio.add(btn1);
        btn1.repaint();

        ActionListener agregar1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
            }
        };
        btn1.addActionListener(agregar1);
        
        JButton btn2 = new JButton("Buscar");
        btn2.setBounds(550, 50, 120, 30);
        panelInicio.add(btn2);
        btn2.repaint();

        ActionListener agregar2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
            }
        };
        btn2.addActionListener(agregar2);
        
        JButton btn3 = new JButton("Actualizar");
        btn3.setBounds(400, 100, 120, 30);
        panelInicio.add(btn3);
        btn3.repaint();

        ActionListener agregar3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
            }
        };
        btn3.addActionListener(agregar3);
        
         JButton btn4 = new JButton("Eliminar");
        btn4.setBounds(550, 100, 120, 30);
        panelInicio.add(btn4);
        btn4.repaint();

        ActionListener agregar4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
            }
        };
        btn4.addActionListener(agregar4);
     }
}
