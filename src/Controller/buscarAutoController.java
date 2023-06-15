package Controller;

import GUI.buscarAuto;

import javax.swing.*;

public class buscarAutoController {
    private buscarAuto ventanaBuscarAuto;

    public buscarAutoController(buscarAuto ventanaBuscarAuto) {
        this.ventanaBuscarAuto = ventanaBuscarAuto;

        ventanaBuscarAuto.getBtnBuscar().addActionListener(e -> buscarAuto());
    }

    private void buscarAuto() {
        String nombreAuto = ventanaBuscarAuto.getTxtNombre().getText();

        JOptionPane.showMessageDialog(ventanaBuscarAuto, "Se encontró el auto: " + nombreAuto);

        ventanaBuscarAuto.dispose();
    }
}
