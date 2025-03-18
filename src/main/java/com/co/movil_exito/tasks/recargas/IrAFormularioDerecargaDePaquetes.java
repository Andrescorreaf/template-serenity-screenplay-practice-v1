package com.co.movil_exito.tasks.recargas;

import com.co.movil_exito.userinterface.home.homePage;
import com.co.movil_exito.userinterface.paquetesPage.paqutes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAFormularioDerecargaDePaquetes implements Performable {
    public static Performable  irAFormularioCheckout() {
        return instrumented(IrAFormularioDerecargaDePaquetes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(homePage.BTN_PAQUETES));
        actor.attemptsTo(Click.on(homePage.BTN_PAQUETES));
        actor.attemptsTo(MoveMouse.to(paqutes.BTN_COMPRA_PAQUETE));
        actor.attemptsTo(Click.on(paqutes.BTN_COMPRA_PAQUETE));
        actor.attemptsTo(Click.on(paqutes.BTN_CONTINUAR_MODAL_SELECT_LINEA));
    }

}
