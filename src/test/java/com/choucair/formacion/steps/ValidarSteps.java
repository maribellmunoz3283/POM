package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.AutenticarPage;
import com.opencsv.CSVReader;
import net.thucydides.core.annotations.Step;
import java.io.FileReader;
import java.io.IOException;

public class ValidarSteps {
    AutenticarPage autenticarPage;
    @Step

    public void abrirFormulario() {
        autenticarPage.open();
        autenticarPage.ingresaAutenticar();
        autenticarPage.ingresarDatos();

    }

    public void llenarDatos(String id) throws IOException {
        String CSV_file = "src/test/resources/Datadriven/badeDatos.csv";
        CSVReader reader = null;
        reader = new CSVReader(new FileReader(CSV_file));
        String[] cell = reader.readNext();
        while ((cell = reader.readNext()) != null) {
            if (id.equals(cell[0])) { //.trim() elimina espacios a los lados
                autenticarPage.agregarREQUIRED(cell[1]);
                autenticarPage.agregarEMAIL(cell[2]);
                autenticarPage.agregarPASSWORD(cell[3]);
                autenticarPage.agregarCONFIRM_PASSWORD(cell[4]);
                autenticarPage.agregarDATE(cell[5]);
                autenticarPage.agregarURL(cell[6]);
                autenticarPage.agregarDIGITS_ONLY(cell[7]);
                autenticarPage.agregarRANGE(cell[8]);
            }
        }
        //autenticarPage.ingresarDatos();
        reader.close();
    }

    }

