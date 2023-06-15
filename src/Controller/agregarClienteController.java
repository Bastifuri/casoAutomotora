package Controller;

import GUI.agregarCliente;
import Model.cliente;

import javax.swing.*;

public class agregarClienteController {
    private agregarCliente ventanaAgregarCliente;

    public agregarClienteController(agregarCliente ventanaAgregarCliente) {
        this.ventanaAgregarCliente = ventanaAgregarCliente;

        ventanaAgregarCliente.getBtnGuardar().addActionListener(e -> guardarCliente());
    }

    private void guardarCliente() {
        String nombre = ventanaAgregarCliente.getTxtNombre().getText();
        String direccion = ventanaAgregarCliente.getTxtDireccion().getText();
        String telefono = ventanaAgregarCliente.getTxtTelefono().getText();
        String correo = ventanaAgregarCliente.getTxtCorreo().getText();
        String rut = ventanaAgregarCliente.getTxtRut().getText();


        cliente cliente = new cliente(nombre, direccion, telefono, correo, rut);

        JOptionPane.showMessageDialog(ventanaAgregarCliente, "El cliente se ha guardado correctamente.");

        ventanaAgregarCliente.dispose();
    }
}