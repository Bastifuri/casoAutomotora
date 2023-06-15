package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buscarAuto extends JFrame {
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnBuscar;

    public buscarAuto() {
        setTitle("Buscar Auto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLayout(null);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 20);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(110, 20, 150, 20);
        add(txtNombre);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(100, 60, 100, 30);
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreAuto = txtNombre.getText();
            }
        });
        add(btnBuscar);
    }
    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }
}