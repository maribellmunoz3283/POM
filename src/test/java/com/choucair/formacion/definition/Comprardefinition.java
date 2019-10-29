package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ComprarStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class Comprardefinition {

    @Steps

    ComprarStep comprarStep;
    String base;




    @Dado("^que abrimos la web de Jumbo$")
    public void que_abrimos_la_web_de_Jumbo() {

        comprarStep.abrir();

    }

    @Cuando("^registramos los datos de entrega seleccionamos los productos \"([^\"]*)\"$")
    public void registramos_los_datos_de_entrega_seleccionamos_los_productos(String id) throws InterruptedException {
        this.base = id;
        comprarStep.configurarEntrega(id);
        comprarStep.productos();




    }

    @Entonces("^validamos carrito de compras$")
    public void validamos_carrito_de_compras()  {

        comprarStep.validacion();
        comprarStep.validarCarrito();





    }



}
