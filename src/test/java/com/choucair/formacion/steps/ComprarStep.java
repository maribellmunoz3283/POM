package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ComprarPage;
import com.opencsv.CSVReader;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class ComprarStep {


    ComprarPage comprarPage;
    private static String[]datos;


    @Step

    public void abrir() {

        comprarPage.open();
        comprarPage.entrega();

    }

    public static void leerBase(String base)  {
        CSVReader reader = null;
        try {
            String CSV_file = "src/test/resources/Datadriven/badeDatos.csv";
            reader = new CSVReader(new FileReader(CSV_file));
            String[] cell = reader.readNext();
            while((cell = reader.readNext()) !=null){
                if (base.equals(cell[0])){ //.trim() elimina espacios a los lados
                    datos=cell;
                }
            }
            reader.close();
        }
        catch (IOException e){
            Logger.getLogger(""+e);
        }
    }


    public void configurarEntrega(String base) {
        leerBase (base);

        comprarPage.departamentoMetodo(datos[1]);
        comprarPage.ciudad(datos[2]);
        comprarPage.tienda(datos[3]);
        comprarPage.guardarFormulario();
        //comprarPage.abrirMenu();

    }


    public void productos() throws InterruptedException {

        comprarPage.despensa();


    }


    public void validacion() {
       // comprarPage.precio(datos[4]);
      //  comprarPage.validar();

    }

    public void validarCarrito() {

        comprarPage.validarCompra();
    }
}
