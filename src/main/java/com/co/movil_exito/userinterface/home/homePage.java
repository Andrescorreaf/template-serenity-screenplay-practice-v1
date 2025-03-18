package com.co.movil_exito.userinterface.home;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class homePage {
    private homePage (){

    }
    public static final Target BTN_PAQUETES_PREPAGADOS = Target.the("Botón para ir a Pauetes Prepagadas").located(By.xpath("//*[@id=\"block-fixed-block-content-home-conoce-lo-que-movil-exito-t\"]/div/div/div/div[2]/a"));
    public static final Target TITULO_PAQUETES_PREPAGADOS = Target.the("Título Paquetes Prepagados").locatedBy("//h1[contains(@class, 'title-1')]");
    public static final Target BTN_PAQUETES = Target.the("botón Paquetes del home ").located(By.xpath("//*[@id=\"block-fixed-block-content-home-conoce-lo-que-movil-exito-t\"]/div/div/div/div[1]/a"));
}
