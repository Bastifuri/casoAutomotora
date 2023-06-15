package GUI;

import Model.cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class agregarCliente extends JFrame {
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblDireccion;
    private JTextField txtDireccion;
    private JLabel lblTelefono;
    private JTextField txtTelefono;
    private JLabel lblCorreo;
    private JTextField txtCorreo;
    private JLabel lblRut;
    private JTextField txtRut;
    private JButton btnGuardar;

    public agregarCliente() {
        setTitle("Agregar Cliente");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 250);
        setLayout(null);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 20);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(110, 20, 150, 20);
        add(txtNombre);

        lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(20, 50, 80, 20);
        add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(110, 50, 150, 20);
        add(txtDireccion);

        lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(20, 80, 80, 20);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(110, 80, 150, 20);
        add(txtTelefono);

        lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(20, 110, 80, 20);
        add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(110, 110, 150, 20);
        add(txtCorreo);

        lblRut = new JLabel("RUT:");
        lblRut.setBounds(20, 140, 80, 20);
        add(lblRut);

        txtRut = new JTextField();
        txtRut.setBounds(110, 140, 150, 20);
        add(txtRut);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(100, 180, 100, 30);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();
                String correo = txtCorreo.getText();
                String rut = txtRut.getText();

                cliente cliente = new cliente(nombre, direccion, telefono, correo, rut);

                dispose();
            }
        });
        add(btnGuardar);
    }
    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public JTextField getTxtRut() {
        return txtRut;
    }
}
