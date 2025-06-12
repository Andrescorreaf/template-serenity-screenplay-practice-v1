package com.co.movil_exito.transversal;

import com.co.movil_exito.userinterface.MoviExitoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(">>>>>< Intentando abiri la pagina");
        actor.attemptsTo(Open.browserOn().the(MoviExitoPage.class));
    }

    public static Abrir irahome() {
        return instrumented(Abrir.class);
    }
}
