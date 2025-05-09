package com.co.movil_exito.transversal;

import com.co.movil_exito.userinterface.MoviExitoPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir  {
    public static Performable irahome(){
        return Task.where("{0} Abrir la pagina movil exito",
                Open.browserOn().the(MoviExitoPage.class));
    }

}
