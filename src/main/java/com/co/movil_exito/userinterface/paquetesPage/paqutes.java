package com.co.movil_exito.userinterface.paquetesPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class paqutes {
    private paqutes() {

    }

    public static final Target BTN_COMPRA_PAQUETE = Target.the("Botón para ir al modal de selccionar cantidad de linea").located(By.xpath("//*[@id=\"Paquete-$24.900\"]"));
    public static final Target BTN_CONTINUAR_MODAL_SELECT_LINEA = Target.the("Boton conitnuar del modal seleccionar linea").located(org.openqa.selenium.By.xpath("//div[@class=\"ui-dialog-buttonset form-actions\"]/button[contains(text(), \"Continuar\")]"));
}
