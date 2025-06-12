package com.co.movil_exito.stepdefinitions;


import com.co.movil_exito.userinterface.home.homePage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.co.movil_exito.tasks.home.direccionarprepagadas.hacerclicken;
import static com.co.movil_exito.transversal.Abrir.irahome;
import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IraPrepagadasStepDefinitions {
    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new Cast()); // Inicializa el escenario de Screenplay
        OnStage.theActorCalled("Usuario").whoCan(BrowseTheWeb.with(driver)); // Crea un actor llamado "Usuario"
    }


    @Dado("que el usuario se encuentra en la pagina de home")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_home(Actor Andres) {
        // Write code here that turns the phrase above into concrete actions
        Andres.wasAbleTo(irahome());
    }

    @Cuando("el usuario hace clic en el boton prepagadas")
    public void el_usuario_hace_clic_en_el_boton_prepagadas(Actor Andres) {
        // Write code here that turns the phrase above into concrete actions
        Andres.wasAbleTo(hacerclicken());
    }

    @Entonces("el usuario debe ser direccionado a la pagina y debe ver el titulo Paquetes Prepagados")
    public void el_usuario_debe_ser_direccionado_a_la_pagina_y_debe_ver_el_titulo_paquetes_prepagados(Actor Andres) {
        // Write code here that turns the phrase above into concrete actions
        Andres.attemptsTo(
                Ensure.that(homePage.TITULO_PAQUETES_PREPAGADOS).text().isEqualTo("Paquetes Prepagados")
        );
    }

}
