package com.co.movil_exito.userinterface.checkoutPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class checkoutpage {
        private checkoutpage() {

        }

        public static final Target INPUT_LINEA_MOVIL = Target.the("Campo para ingresar npumero linea movil").located(By.xpath("//*[@id=\"edit-order-fieldsdata-recopilation-field-phone-0-value\"]"));
        public static final Target SELECT_TIPO_DOCUEMTNO = Target.the("Selector tipo de documento").located(By.id("edit-order-fieldsdata-recopilation-field-tdoc"));
        public static final Target INPUT_NUMERO_DOCUMENTO = Target.the("Campo del número del documento").located(By.xpath("//*[@id='edit-order-fieldsdata-recopilation-field-ndoc-0-value']"));
        public static final Target INPUT_RAZON_SOCIAL = Target.the("campo de razon social").located(By.xpath("//*[@id='edit-order-fieldsdata-recopilation-field-fullname-0-value']"));
        public static final Target INPUT_CORREO = Target.the("Campo de correo electronico").located(By.xpath("//*[@id=\"edit-order-fieldsdata-recopilation-field-email-0-value\"]"));
        public static final Target CHECK_PUBLICIDAD = Target.the("checkbox de autorización de publicidad").located(By.xpath("//*[@id='edit-order-fieldsdata-recopilation-field-publicidad-value']"));
        public static final Target CHECK_LEGAL = Target.the("checkbox de aceptación de términos legales").located(By.xpath("//*[@id='edit-order-fieldsdata-recopilation-field-legal-value']"));
        public static final Target CHECK_RECAPTCHA = Target.the("checkbox de recaptcha").located(By.xpath("//*[@id='recaptcha-anchor']/div[1]"));
        public static final Target BOTON_CONTINUAR = Target.the("botón de continuar").located(By.xpath("//*[@id='edit-actions-next']"));
}

