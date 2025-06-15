# language: es

Característica: Crear usuario
  Como usuario
  Quiero ir a la pagina de registro
  Para crear una cuenta

  Escenario: Crear un nuevo usuario con credenciales validas
    Dado que el usuario está en la página de registro
    Cuando el usuario completa el formulario de registro
    Entonces el usuario debe ser creado exitosamente

