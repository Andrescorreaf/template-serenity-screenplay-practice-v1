# Automatización de Recarga Móvil - Éxito 
Este proyecto implementa pruebas automatizadas de extremo a extremo utilizando **Serenity BDD**, **Screenplay Pattern**, **Cucumber (Gherkin)** y **Gradle**. El objetivo principal es validar el flujo de una **recarga móvil** en el portal de Éxito.

#  🛠 Tecnologías
- ✅ **Java 11+**
- ✅ **Serenity BDD**
- ✅ **Screenplay Pattern**
- ✅ **Cucumber / Gherkin**
- ✅ **Gradle**
- ✅ **JUnit**
- ✅ **WebDriver (Selenium)**

## 🎯 Objetivo del Proyecto
Automatizar el flujo de una **recarga móvil en el portal de Éxito**, validando paso a paso:

1. Ingreso al sitio.
2. Navegación al módulo de recargas.
3. Selección del operador móvil.
4. Ingreso del número y monto a recargar.
5. Validación de la transacción y mensajes esperados.


## 📁 Estructura del Proyecto
```bash
src
└── main
    └──java
         └──com.co.movi_exito
            └──interactions
            └──questions
            └──tasks
            └──utils
            └──userinterfaces   
└── test
    └── java
    |    └──com.co.movi_exito
    |       └──runners
    |       └──stepdefinitions
    |    
    |                   
    └── resources
        └── features
            └── recarga # Escenarios en Gherkin
                ├── recarga_movil.feature

```
## 🧪 Cómo ejecutar las pruebas
**▶️ Desde la terminal:**
``` bash
  ./gradlew clean test aggregate
```

**▶️ Desde un runner específico (opcional):**
``` bash
  ./gradlew clean test --tests "co.com.exito.runners.RecargaMovilRunner"
```
**📄 Reporte de Serenity**

Después de ejecutar las pruebas, abre el siguiente archivo en tu navegador para ver el reporte:

``` 
  target/site/serenity/index.html
```

## 💡 Buenas prácticas aplicadas

* Diseño por capas Screenplay
* Código limpio y reutilizable
* Separación entre lógica de automatización y negocio
* Validaciones desacopladas usando Questions

## 🧑‍💻 Autor
Andres Correa

* 📧 felipefrano989@gmail.com
* 🌐 github.com/Andrescorreaf

## 🛡 Licencia

Este proyecto es de uso libre bajo la Licencia MIT.