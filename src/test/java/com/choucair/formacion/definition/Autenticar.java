package com.choucair.formacion.definition;

import com.choucair.formacion.pageobjects.AutenticarPage;
import com.choucair.formacion.steps.AutenticarSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class Autenticar {

    @Steps
    AutenticarSteps autenticarSteps;


    @Dado("^que maribell requiere autenticarse$")
    public void que_maribell_requiere_autenticarse() {
        autenticarSteps.abrir();

    }

    @Cuando("^ella ingresa usuario y contraseña en la plataforma$")
    public void ella_ingresa_usuario_y_contraseña_en_la_plataforma()  {
        autenticarSteps.ingresarUsiario();

    }

    @Entonces("^ella verifica respuesta exitosa TOC$")
    public void ella_verifica_respuesta_exitosa_TOC()  {
        autenticarSteps.validar();
    }

}
