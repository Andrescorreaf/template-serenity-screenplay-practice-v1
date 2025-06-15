package com.co.starter.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import com.co.starter.questions.TituloRegsitro;
import com.co.starter.tasks.paginaderegistro.AbrirPaginaDeRegistro;
import com.co.starter.tasks.paginaderegistro.RegistrarUsuarioTask;
import com.co.starter.userinterface.SitioDeRegistroPage.SitioDeRegistro;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CrearUsuarioStepDefinitions {

    @Dado("que el usuario está en la página de registro")
    public void queElUsuarioEstaEnLaPaginaDeRegistro() {
         OnStage.theActorInTheSpotlight().wasAbleTo(AbrirPaginaDeRegistro.abrir());
    }

    @Cuando("el usuario completa el formulario de registro")
    public void elUsuarioCompletaElFormularioDeRegistro() {
        OnStage.theActorInTheSpotlight().wasAbleTo(RegistrarUsuarioTask.registrarUsuario());
    }

    @Entonces("el usuario debe ser creado exitosamente")
    public void elUsuarioDebeSerCreadoExitosamente() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TituloRegsitro.es(), equalTo("Mi cuenta"))
        );
    }

}
