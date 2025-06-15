package com.co.starter.tasks.paginaderegistro;

import com.co.starter.userinterface.SitioDeRegistroPage.SitioDeRegistro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class RegistrarUsuarioTask implements Performable {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(        
            SendKeys.of("123456789").into(SitioDeRegistro.NUMERO_CEDULA),
            SendKeys.of("test@example.com").into(SitioDeRegistro.EMAIL),
            SendKeys.of("password").into(SitioDeRegistro.CONTRASENA),
            Click.on(SitioDeRegistro.BTN_ACEPTAR_TERMINOS),
            Click.on(SitioDeRegistro.BTN_REGISTRAR)
        );
    }

    public static RegistrarUsuarioTask registrarUsuario() {
        return new RegistrarUsuarioTask();
    }

    
}
