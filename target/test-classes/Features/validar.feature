# language: es
@Regression
Característica: Verificar el diligenciamiento de la pantalla “Block Validation”.

  Como usuario
  Solicito autenticarme y registrar un usuario
  A la plataforma colorlib

  @Autenticar
  Escenario: Autenticar usuario
    Dado que maribell requiere autenticarse
    Cuando ella ingresa usuario y contraseña en la plataforma
    Entonces ella verifica respuesta exitosa TOC


  @Registrar
  Escenario:Validar usuarioe
    Dado que maribell necesita validar un usario
    Cuando  cuando lo ingresar a la plataforma "001"
    Entonces maribell verifica validacion exitosa o fallida









