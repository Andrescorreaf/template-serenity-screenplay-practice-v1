package com.co.movil_exito.tasks.home;


import com.co.movil_exito.userinterface.home.homePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class direccionarprepagadas implements Performable {

    public static Performable  hacerclicken() {
        return instrumented(direccionarprepagadas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(homePage.BTN_PAQUETES_PREPAGADOS));
        actor.attemptsTo(Click.on(homePage.BTN_PAQUETES_PREPAGADOS));
    }
}