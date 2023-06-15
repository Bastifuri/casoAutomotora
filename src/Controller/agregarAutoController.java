package Controller;

import Model.auto;
import GUI.agregarAuto;

import javax.swing.*;

public class agregarAutoController {
    private agregarAuto ventanaAgregarAuto;

    public agregarAutoController(agregarAuto ventanaAgregarAuto) {
        this.ventanaAgregarAuto = ventanaAgregarAuto;

        ventanaAgregarAuto.getBtnGuardar().addActionListener(e -> guardarAuto());
    }

    private void guardarAuto() {
        String nombre = ventanaAgregarAuto.getTxtNombre().getText();
        int anio = Integer.parseInt(ventanaAgregarAuto.getTxtAnio().getText());
        double precio = Double.parseDouble(ventanaAgregarAuto.getTxtPrecio().getText());
        double kilometros = Double.parseDouble(ventanaAgregarAuto.getTxtKilometros().getText());
        String color = ventanaAgregarAuto.getTxtColor().getText();
        String marca = ventanaAgregarAuto.getTxtMarca().getText();

        auto auto = new auto(nombre, anio, precio, kilometros, color, marca);

        JOptionPane.showMessageDialog(ventanaAgregarAuto, "El auto se ha guardado correctamente.");

        ventanaAgregarAuto.dispose();
    }
}