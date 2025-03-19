package com.co.movil_exito.tasks.recargas;

import com.co.movil_exito.userinterface.checkoutPage.checkoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormulario implements Task {
    private final String numeroLinea;
    private final String tipoDoc;
    private final String numeroDoc;
    private final String razonSocial;
    private final String correEmail;
    private final String resolverRecaptcha;

    public LlenarFormulario(String numeroLinea, String tipoDoc, String numeroDoc, String razonSocial, String correEmail, String resolverRecaptcha){
        this.numeroLinea= numeroLinea;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.razonSocial = razonSocial;
        this.correEmail=correEmail;
        this.resolverRecaptcha=resolverRecaptcha;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(numeroLinea).into(checkoutPage.INPUT_LINEA_MOVIL),
                SelectFromOptions.byValue(tipoDoc).from(checkoutPage.SELECT_TIPO_DOCUEMTNO),
                Enter.theValue(numeroDoc).into(checkoutPage.INPUT_NUMERO_DOCUMENTO),
                Enter.theValue(razonSocial).into(checkoutPage.INPUT_RAZON_SOCIAL),
                Enter.theValue(correEmail).into(checkoutPage.INPUT_CORREO),
                Click.on(checkoutPage.CHECK_PUBLICIDAD),
                Click.on(checkoutPage.CHECK_LEGAL),
                WaitUntil.the(checkoutPage.IFRAME_RECAPTCHA, isVisible()).forNoMoreThan(50).seconds()
        );


        boolean debeResolverCaptcha = "si".equalsIgnoreCase(resolverRecaptcha);

        if (debeResolverCaptcha) {
            actor.attemptsTo(
                    Click.on(checkoutPage.IFRAME_RECAPTCHA),
                    Click.on(checkoutPage.CHECK_RECAPTCHA),
                    Switch.toDefaultContext()
            );
        }

        actor.attemptsTo(WaitUntil.the(checkoutPage.BOTON_CONTINUAR, isVisible()).forNoMoreThan(20).seconds()); // Pausa "implícita"
        actor.attemptsTo(Click.on(checkoutPage.BOTON_CONTINUAR));


    }
    public static LlenarFormulario con(String numeroLinea,String tipoDoc, String numeroDoc, String razonSocial, String correEmail, String resolverRecaptcha){
        return instrumented(LlenarFormulario.class, numeroLinea ,tipoDoc, numeroDoc, razonSocial, correEmail, resolverRecaptcha);
    }
}
