package com.co.movil_exito.userinterface.modalDonacionPage;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class modalDonacionPage {
    private modalDonacionPage() {

    }

    public static final Target CERRAR_MODAL_CON_X = Target.the("Opcion x para cerrar modal de donaciones").located(By.cssSelector("[data-drupal-selector='edit-cancel']"));
    public static final Target BTN_CONTINUAR_PAGO = Target.the("Boton par acontiuar con el pago").located(By.xpath("//*[@id=\"edit-actions-next\"]"));


}
