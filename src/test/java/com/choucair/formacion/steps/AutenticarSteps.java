package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.AutenticarPage;
import net.thucydides.core.annotations.Step;

public class AutenticarSteps {
    AutenticarPage autenticarPage;
    @Step

    public void abrir() {
        autenticarPage.open();
    }
    public void ingresarUsiario() {

        autenticarPage.ingresaAutenticar();

    }

    public void validar() {
        autenticarPage.validarRespuesta();
    }
}

