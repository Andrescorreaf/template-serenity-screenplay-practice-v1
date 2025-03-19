package com.co.movil_exito.tasks.recargas;

import com.co.movil_exito.userinterface.modalDonacionPage.modalDonacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.swing.event.CaretListener;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CerraModalDonacion implements Performable {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(modalDonacionPage.CERRAR_MODAL_CON_X),
                Click.on(modalDonacionPage.BTN_CONTINUAR_PAGO)
        );



    }
    public static CerraModalDonacion cerarModal(){
        return instrumented(CerraModalDonacion.class);
    }
}
