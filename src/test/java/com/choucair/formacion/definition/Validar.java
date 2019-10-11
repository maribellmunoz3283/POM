package com.choucair.formacion.definition;

import com.choucair.formacion.steps.AutenticarSteps;
import com.choucair.formacion.steps.ValidarSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class Validar {

    @Steps
    ValidarSteps validarSteps;

    @Dado("^que maribell necesita validar un usario$")
    public void que_maribell_necesita_validar_un_usario() {

        validarSteps.abrirFormulario();

    }

    @Cuando("^cuando lo ingresar a la plataforma \"([^\"]*)\"$")
    public void cuando_lo_ingresar_a_la_plataforma(String id)  {


        try {
            validarSteps.llenarDatos(id);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Entonces("^maribell verifica validacion exitosa o fallida$")
    public void maribell_verifica_validacion_exitosa_o_fallida()  {


      }
}
