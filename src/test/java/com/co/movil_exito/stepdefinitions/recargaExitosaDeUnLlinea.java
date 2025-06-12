package com.co.movil_exito.stepdefinitions;

import com.co.movil_exito.tasks.recargas.CerraModalDonacion;
import com.co.movil_exito.tasks.recargas.LlenarFormulario;
import com.co.movil_exito.transversal.Abrir;
import com.co.movil_exito.userinterface.home.homePage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


import static com.co.movil_exito.tasks.recargas.IrAFormularioDeRecargaDePaquetes.desdeElHome;
import static com.co.movil_exito.transversal.Abrir.irahome;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class recargaExitosaDeUnLlinea {
    @Dado("que el usairo esta en el formualario de checkout")
    public void que_el_usairo_esta_en_el_formualario_de_checkout() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                irahome(),
                desdeElHome()
        );

    }
    @Cuando("realiza el proceso de pago")
    public void realiza_el_proceso_de_pago(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                LlenarFormulario.con("3148707675","CC","1234567","Andres Frank","test@seed.co","no"),
                CerraModalDonacion.cerarModal()
        );

    }
    @Entonces("espero ver un un texto de confirmacion exitoso")
    public void espero_ver_un_un_texto_de_confirmacion_exitoso() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(homePage.TITULO_PAQUETES_PREPAGADOS).text().isEqualTo("Paquetes Prepagados")
        );

    }

}


