package com.co.movil_exito.tasks.recargas;

import com.co.movil_exito.userinterface.checkoutPage.checkoutpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormulario implements Task {
    private final String numeroLinea;
    private final String tipoDoc;
    private final String numeroDoc;
    private final String razonSocial;
    private final String correEmail;

    public LlenarFormulario(String numeroLinea, String tipoDoc, String numeroDoc, String razonSocial, String correEmail){
        this.numeroLinea= numeroLinea;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.razonSocial = razonSocial;
        this.correEmail=correEmail;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(numeroLinea).into(checkoutpage.INPUT_LINEA_MOVIL),
                SelectFromOptions.byValue(tipoDoc).from(checkoutpage.SELECT_TIPO_DOCUEMTNO),
                Enter.theValue(numeroDoc).into(checkoutpage.INPUT_NUMERO_DOCUMENTO),
                Enter.theValue(razonSocial).into(checkoutpage.INPUT_RAZON_SOCIAL),
                Enter.theValue(correEmail).into(checkoutpage.INPUT_CORREO),
                Click.on(checkoutpage.CHECK_PUBLICIDAD),
                Click.on(checkoutpage.CHECK_LEGAL),
                Click.on(checkoutpage.CHECK_RECAPTCHA),
                Click.on(checkoutpage.BOTON_CONTINUAR)

        );

    }
    public static LlenarFormulario con(String numeroLinea,String tipoDoc, String numeroDoc, String razonSocial, String correEmail){
        return Tasks.instrumented(LlenarFormulario.class, numeroLinea ,tipoDoc, numeroDoc, razonSocial, correEmail);
    }
}
