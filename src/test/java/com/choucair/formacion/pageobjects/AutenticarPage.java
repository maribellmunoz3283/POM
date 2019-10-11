package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.Keys;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")

public class  AutenticarPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"login\"]/form/input[1]")
    WebElementFacade USUARIO;

    @FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
    WebElementFacade CLAVE;

    @FindBy(xpath = "//*[@id=\"toc\"]")
    WebElementFacade RESPUESTA;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    WebElementFacade CLICK_FORMULARIO;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    WebElementFacade CLICK_VALIDACION;

    @FindBy(xpath = "//*[@id=\"required2\"]")
    WebElementFacade REQUIRED;

    @FindBy(xpath = "//*[@id=\"email2\"]")
    WebElementFacade EMAIL;

    @FindBy(xpath = "//*[@id=\"password2\"]")
    WebElementFacade PASSWORD;

    @FindBy(xpath = "//*[@id=\"confirm_password2\"]")
    WebElementFacade CONFIRM_PASSWORD;

    @FindBy(xpath = "//*[@id=\"date2\"]")
    WebElementFacade DATE;

    @FindBy(xpath = "//*[@id=\"url2\"]")
    WebElementFacade URL;

    @FindBy(xpath = "//*[@id=\"digits\"]")
    WebElementFacade DIGITS_ONLY;

    @FindBy(xpath = "//*[@id=\"range\"]")
    WebElementFacade RANGE;

    @FindBy(xpath = "//*[@id=\"agree2\"]")
    WebElementFacade CHECK;


    public void ingresaAutenticar() {

        USUARIO.click();
        USUARIO.sendKeys("demo");
        CLAVE.click();
        CLAVE.typeAndEnter("demo");

    }

    public void validarRespuesta() {

        String labelv = "TOC";
        String strMensaje = RESPUESTA.getText();
        assertThat(strMensaje, containsString(labelv));

    }

    public void ingresarDatos() {
        CLICK_FORMULARIO.click();
        CLICK_VALIDACION.click();
        /*REQUIRED.sendKeys("Maribell");
        EMAIL.sendKeys("maribell@gmail.com");
        PASSWORD.sendKeys("123456");
        CONFIRM_PASSWORD.sendKeys("123456");
        DATE.sendKeys();
        URL.sendKeys();
        DIGITS_ONLY.sendKeys();
        RANGE.sendKeys();
         */
  }

    public void agregarREQUIRED(String required) {
        REQUIRED.sendKeys(required);
    }
    public void agregarEMAIL(String email) {
       EMAIL.sendKeys(email);
    }
    public void agregarPASSWORD(String password) {
        PASSWORD.sendKeys(password);
    }
    public void agregarCONFIRM_PASSWORD(String confirm_password) {
        CONFIRM_PASSWORD.sendKeys(confirm_password);
    }
    public void agregarDATE(String date) {
        DATE.sendKeys(date);
    }
    public void agregarURL(String url) {
        URL.sendKeys(url);
    }
    public void agregarDIGITS_ONLY(String digits) {
        DIGITS_ONLY.sendKeys(digits);
    }
    public void agregarRANGE(String range) {
        RANGE.sendKeys(range);
        CHECK.click();
    }

}




