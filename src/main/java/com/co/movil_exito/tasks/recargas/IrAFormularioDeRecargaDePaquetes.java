package com.co.movil_exito.tasks.recargas;

import com.co.movil_exito.userinterface.home.homePage;
import com.co.movil_exito.userinterface.paquetesPage.paqutes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAFormularioDeRecargaDePaquetes implements Performable {
    public static Performable  desdeElHome() {
        return instrumented(IrAFormularioDeRecargaDePaquetes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(homePage.BTN_PAQUETES),
        Click.on(homePage.BTN_PAQUETES),
        MoveMouse.to(paqutes.BTN_COMPRA_PAQUETE),
        Click.on(paqutes.BTN_COMPRA_PAQUETE),
        Click.on(paqutes.BTN_CONTINUAR_MODAL_SELECT_LINEA)
        );
    }

}
