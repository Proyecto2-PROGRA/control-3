/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marceloleiton
 */
public class Ventana extends JFrame {
    private JPanel panel;
    private JTextField cajaTexto;
    private JButton boton;
    private JLabel resolvedor;
    public Ventana(){
        setTitle("Convertir a Romano");
        this.setSize(500, 500);//tamaño ventana
        this.getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        iniciarComponentes(); 
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar
        
    }
    private void iniciarComponentes(){ 
        colocarPaneles();
        colocarBotones();
        colocarCajaTexto();
    
    }
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void colocarBotones(){
        JButton boton1=new JButton();
        boton1.setText("convertir");
        boton1.setEnabled(true);//encendido boton
        boton1.setBounds(200, 300, 100, 40);
        panel.add(boton1);
        
        resolvedor = new JLabel();
        resolvedor.setBounds(150, 200, 300, 30);
        panel.add(resolvedor);
        /////// actionlistener
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resolvedor.setText("Se convertirá "+cajaTexto.getText()+" a Romano");
            }
        };
        boton1.addActionListener(oyente);
    }

    private void colocarCajaTexto() {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(200, 150, 100, 40);
        panel.add(cajaTexto);
    }
    
}
 