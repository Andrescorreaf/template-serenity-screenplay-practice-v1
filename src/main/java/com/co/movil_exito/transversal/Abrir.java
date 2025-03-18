package com.co.movil_exito.transversal;

import com.co.movil_exito.userinterface.MoviExitoPage;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Performable {

    @Managed
    WebDriver driver;

    @Page
    private MoviExitoPage abrirHome;

    public static Performable irahome(){
        return new Abrir();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (abrirHome == null) {
            throw new RuntimeException("Error: 'abrirHome' no ha sido inicializado.");
        }
        actor.attemptsTo(
                Open.browserOn().the(abrirHome)
        );

    }
}
