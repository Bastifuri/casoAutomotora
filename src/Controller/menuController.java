package Controller;

import GUI.agregarAuto;
import GUI.agregarCliente;
import GUI.buscarAuto;
import GUI.menu;

public class menuController {
    private menu ventanaMenuPrincipal;

    public menuController(menu ventanaMenuPrincipal) {
        this.ventanaMenuPrincipal = ventanaMenuPrincipal;

        ventanaMenuPrincipal.getBtnAgregarCliente().addActionListener(e -> abrirVentanaAgregarCliente());
        ventanaMenuPrincipal.getBtnAgregarAuto().addActionListener(e -> abrirVentanaAgregarAuto());
        ventanaMenuPrincipal.getBtnBuscarAuto().addActionListener(e -> abrirVentanaBuscarAuto());
    }

    private void abrirVentanaAgregarCliente() {
        agregarCliente agregarCliente = new agregarCliente();
        agregarClienteController clienteController = new agregarClienteController(agregarCliente);
        agregarCliente.setVisible(true);
    }

    private void abrirVentanaAgregarAuto() {
        agregarAuto agregarAuto = new agregarAuto();
        agregarAutoController autoController = new agregarAutoController(agregarAuto);
        agregarAuto.setVisible(true);
    }

    private void abrirVentanaBuscarAuto() {
        buscarAuto buscarAuto = new buscarAuto();
        buscarAutoController buscarAutoController = new buscarAutoController(buscarAuto);
        buscarAuto.setVisible(true);
    }

    }

