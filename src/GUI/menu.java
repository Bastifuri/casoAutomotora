package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {
    private JButton btnAgregarCliente;
    private JButton btnAgregarAuto;
    private JButton btnBuscarAuto;

    public menu() {
        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        btnAgregarCliente = new JButton("Agregar Cliente");
        btnAgregarCliente.setBounds(50, 30, 200, 30);
        btnAgregarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCliente ventanaAgregarCliente = new agregarCliente();
                ventanaAgregarCliente.setVisible(true);
            }
        });
        add(btnAgregarCliente);

        btnAgregarAuto = new JButton("Agregar Auto");
        btnAgregarAuto.setBounds(50, 70, 200, 30);
        btnAgregarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarAuto ventanaAgregarAuto = new agregarAuto();
                ventanaAgregarAuto.setVisible(true);
            }
        });
        add(btnAgregarAuto);

        btnBuscarAuto = new JButton("Buscar Auto");
        btnBuscarAuto.setBounds(50, 110, 200, 30);
        btnBuscarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAuto ventanaBuscarAuto = new buscarAuto();
                ventanaBuscarAuto.setVisible(true);
            }
        });
        add(btnBuscarAuto);
    }
    public JButton getBtnAgregarCliente() {
        return btnAgregarCliente;
    }

    public JButton getBtnAgregarAuto() {
        return btnAgregarAuto;
    }

    public JButton getBtnBuscarAuto() {
        return btnBuscarAuto;
    }
}
