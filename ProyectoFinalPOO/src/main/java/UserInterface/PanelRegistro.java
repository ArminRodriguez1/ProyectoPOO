package UserInterface;


import Almacenamiento.Registrar;
import Almacenamiento.UserData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelRegistro extends JPanel implements ActionListener {
    private JLabel fondo = new JLabel(new ImageIcon("data\\fondoRegistro.png"));
    private JLabel etiquetaRegistro = new JLabel(new ImageIcon("data\\registroLabel2.png"));
    private JLabel registerBack = new JLabel(new ImageIcon("data\\registerBack.png"));
    private JLabel tituloRegistro = new JLabel("INGRESE DATOS PARA REGISTRO");
    private JLabel nombre;

    private JLabel advertencia;
    private JLabel advice;
    private JLabel clave;
    private JLabel etiquetaEmail;

    private JTextField textoNombre = new JTextField();
    private JTextField textoClave = new JTextField();

    private JTextField email = new JTextField();
    private JButton registrar;
    private VentanaInicial ventanaInicial;

    public PanelRegistro(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
        componentesIniciales();
    }

    private void componentesIniciales() {
        this.setLayout(null);
        this.setBackground(Color.BLACK);

        this.etiquetaEmail = new JLabel("Email: ");
        this.etiquetaEmail.setForeground(Color.yellow);
        this.etiquetaEmail.setBounds(100,430,185,25);
        this.email.setBounds(100,455,200,25);

        this.nombre = new JLabel("Nombre: ");
        this.nombre.setForeground(Color.YELLOW);
        this.nombre.setBounds(100,255,100,25);
        this.clave = new JLabel("Contraseña: ");
        this.clave.setForeground(Color.YELLOW);
        this.clave.setBounds(100,355,100,25);

        this.advertencia = new JLabel("advertencia: ");
        this.advertencia.setForeground(Color.red);
        this.advertencia.setBounds(100,305,200,25);
        this.advice = new JLabel("NO ESCRIBA NOMBRES OFENSIVOS");
        this.advice.setForeground(Color.YELLOW);
        this.advice.setBounds(175,305,300,25);

        this.textoNombre.setBounds(100,280,200,25);

        this.textoClave.setBounds(100,380,200,25);

        this.registrar = new JButton("Registrarse");
        this.registrar.setBounds(140,505,120,25);
        this.registrar.addActionListener(this);

        this.etiquetaRegistro.setBounds(70,0,250,250);
        this.add(this.etiquetaRegistro);

        this.registerBack.setBounds(10,10,108,89);
        this.registerBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                volver();
            }
        });

        Dimension dimension = getToolkit().getScreenSize();
        this.fondo.setBounds(0,0,dimension.width,dimension.height);
        this.fondo.setVisible(true);

        this.add(this.registerBack);
        this.add(this.advertencia);
        this.add(this.advice);
        this.add(this.registrar);
        this.add(this.nombre);
        this.add(this.clave);
        this.add(this.etiquetaEmail);
        this.add(this.email);
        this.add(this.textoNombre);
        this.add(this.textoClave);
        this.add(this.fondo);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.registrar == e.getSource()){
            if(this.textoClave.getText().equals("") || this.textoNombre.getText().equals("")){
                JOptionPane.showInternalMessageDialog(null,"RELLENADO INCORRECTO O VACIO","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                Registrar registrar = new Registrar(this);
                registrar.registrarUsuario();
                PanelInicio panelInicio = new PanelInicio(this.ventanaInicial);
                this.ventanaInicial.remove(this);
                this.ventanaInicial.add(panelInicio);
                this.ventanaInicial.validate();
            }
        }
    }
    public void volver(){
        PanelInicio panelInicio = new PanelInicio(this.ventanaInicial);
        this.ventanaInicial.remove(this);
        this.ventanaInicial.add(panelInicio);
        this.ventanaInicial.validate();
    }

    public JTextField getTextoNombre() {
        return textoNombre;
    }

    public JTextField getTextoClave() {
        return textoClave;
    }
}