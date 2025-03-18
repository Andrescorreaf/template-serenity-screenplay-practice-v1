package com.co.movil_exito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features"}, // Ruta de las características (features)
        glue = {"com.co.movil_exito.stepdefinitions"}, // Paquete donde están los step definitions
        plugin = {"pretty"}, // Opcional: mejora la salida en consola
        tags = "@Test"

)
public class movilexitorunner {

}
