package GUI;

import Model.auto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class agregarAuto extends JFrame {
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblAnio;
    private JTextField txtAnio;
    private JLabel lblPrecio;
    private JTextField txtPrecio;
    private JLabel lblKilometros;
    private JTextField txtKilometros;
    private JLabel lblColor;
    private JTextField txtColor;
    private JLabel lblMarca;
    private JTextField txtMarca;
    private JButton btnGuardar;

    public agregarAuto() {
        setTitle("Agregar Auto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 250);
        setLayout(null);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 20);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(110, 20, 150, 20);
        add(txtNombre);

        lblAnio = new JLabel("Año:");
        lblAnio.setBounds(20, 50, 80, 20);
        add(lblAnio);

        txtAnio = new JTextField();
        txtAnio.setBounds(110, 50, 150, 20);
        add(txtAnio);

        lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(20, 80, 80, 20);
        add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(110, 80, 150, 20);
        add(txtPrecio);

        lblKilometros = new JLabel("Kilómetros:");
        lblKilometros.setBounds(20, 110, 80, 20);
        add(lblKilometros);

        txtKilometros = new JTextField();
        txtKilometros.setBounds(110, 110, 150, 20);
        add(txtKilometros);

        lblColor = new JLabel("Color:");
        lblColor.setBounds(20, 140, 80, 20);
        add(lblColor);

        txtColor = new JTextField();
        txtColor.setBounds(110, 140, 150, 20);
        add(txtColor);

        lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(20, 170, 80, 20);
        add(lblMarca);

        txtMarca = new JTextField();
        txtMarca.setBounds(110, 170, 150, 20);
        add(txtMarca);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(100, 200, 100, 30);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                int anio = Integer.parseInt(txtAnio.getText());
                double precio = Double.parseDouble(txtPrecio.getText());
                double kilometros = Double.parseDouble(txtKilometros.getText());
                String color = txtColor.getText();
                String marca = txtMarca.getText();

                auto auto = new auto(nombre, anio, precio, kilometros, color, marca);
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

    public JTextField getTxtAnio() {
        return txtAnio;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public JTextField getTxtKilometros() {
        return txtKilometros;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }
}