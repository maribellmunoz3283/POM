package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.regex.Pattern;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.tiendasjumbo.co")

public class ComprarPage  extends PageObject {


    @FindBy(xpath = "//span[contains(text(),'CATEGORÍAS')]") //"//*[@id=\"home-page\"]/nav/div/button[1]/span[2]")
    WebElementFacade CATEGORIAS;

    @FindBy(xpath = "//body/div/div/div/ul/li[1]/span[1]/a[1]/span[1]")
    WebElementFacade SUPERMERCADO;

    @FindBy(xpath = "//span[contains(text(),'Despensa')]")
    WebElementFacade DESPENSA;

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]")
    WebElementFacade ENTREGA;

    @FindBy(xpath = "/html[1]/body[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]")
    WebElementFacade BOTONRECOGER;

    @FindBy(xpath = "//*[@id='select-department-container']/child::span")
    WebElementFacade DEPARTAMENTO;

    @FindBy(xpath = "//*[@id='select-city-container']/child::span")
    WebElementFacade CIUDAD;

    @FindBy(xpath = "//div[@id='select-recoge-en-tienda-container']/child::span")
    WebElementFacade TIENDA;

    @FindBy(xpath = "//div[@class='btn__submit__address']")
    WebElementFacade GURDARFORMULARIO;

    @FindBy(xpath = "//span[@class='selection']")
    WebElementFacade ORDENAR;

    @FindBy(css = "ul.select2-results__options li:nth-of-type(3)")
    WebElementFacade MAYORPRECIO;

   // @FindBy(xpath = "//span[@class='select2-results']//ul//li[text()='Mayor precio']")
    //WebElementFacade MENORPRECIO;


    @FindBy(xpath = "//div[@class='product-item__controls']//button[contains(@class,'add-to-cart')]")
    List<WebElementFacade> BOTONCOMPRAR;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div[1]")
    WebElementFacade BOTONJUMBO;

    @FindBy(xpath = "//div[@class='close-banner-float']")
    WebElementFacade CERRAREMERGENTE;

    @FindBy(xpath = "//div[contains(@class,'minicart minicart--f')]//div[@class='value']")
    WebElementFacade VALORTOTAL;

   //@FindBy(xpath = "//div[@class='close-banner-float']")
  //  WebElementFacade FINALIZARCOMPRA;


  //  @FindBy(xpath = " //*[@id=\"home-page\"]/nav/div/button[2]")
 //   WebElementFacade DESPLEGARCARRITO;


   // @FindBy(xpath = "//div[@class='center']//a[@class='btn primary minicart__action minicart__action--buy']")
   // WebElementFacade FINALIZARCOMPRA;


    @FindBy(xpath = "//*[@id=\"cart-page\"]/div[14]/div/div[3]/div[2]/div[3]/label/span")
    WebElementFacade TERMINOSYCONDICIONES;

    @FindBy(xpath = "//div[@class='minicart minicart--floating minicart--has-items minicart--single-category']//div[@class='value'][contains(text(),'$')]")
    WebElementFacade SUMACOMPRA;

    @FindBy(xpath = "//div[@class='minicart minicart--floating minicart--has-items minicart--single-category']//a[@class='btn primary minicart__action minicart__action--buy']")
    WebElementFacade FINALIZAR;

    @FindBy(xpath = "//h1[contains(text(),'Mi Carrito')]")
    WebElementFacade TEXTCARRITO;











    public void entrega() {

        CERRAREMERGENTE.click();
        ENTREGA.click();
        waitFor(3).second();
        BOTONRECOGER.click();
        waitFor(3).second();
        //DEPARTAMENTO.click();


    }

    public void departamentoMetodo(String departamento) {

        Actions actdepart = new Actions(getDriver());
        waitFor(DEPARTAMENTO).waitUntilEnabled();
        actdepart.moveToElement(DEPARTAMENTO).click().perform();
        waitFor(3).second();
        //actdepart.moveToElement($("//ul[@class='select2-results__options']//li[text()='"+departamento+"']")).click().perform();
        actdepart.moveToElement($("//span[@class='select2-results']//ul//li[text()='" + departamento + "']")).click().perform();
        waitFor(3).second();
    }

    public void ciudad(String ciudad) {
        Actions actciu = new Actions(getDriver());
        waitFor(CIUDAD).waitUntilEnabled();
        actciu.moveToElement(CIUDAD).click().perform();
        actciu.moveToElement($("//span[@class='select2-results']//ul//li[text()='" + ciudad + "']")).click().perform();
    }


    public void tienda(String tienda) {
        Actions acttienda = new Actions(getDriver());
        waitFor(TIENDA).waitUntilEnabled();
        acttienda.moveToElement(TIENDA).click().perform();
        acttienda.moveToElement($("//span[@class='select2-results']//ul//li[text()='" + tienda + "']")).click().perform();
        waitFor(3).second();
    }


    public void guardarFormulario() {
        GURDARFORMULARIO.click();
        waitFor(5).second();
    }


    public void despensa() throws InterruptedException {
        //Actions actdespensa = new Actions(getDriver());
        List<WebElement> divs = getDriver().findElements(By.cssSelector("li.despensa li"));
        int count = divs.size();
     //   System.out.println(count);
      //  System.out.println(divs.size()); //para mostrar tamaño
        for (int i = 1; i <= count; i++) {

                Actions actdespensa = new Actions(getDriver());
                /*if (i != 16) {*/
                actdespensa.moveToElement(CATEGORIAS).perform();
                actdespensa.moveToElement(SUPERMERCADO).perform();
                actdespensa.moveToElement(DESPENSA).perform();


                //  waitFor(2).second();
                //  actdespensa.moveToElement($("//*[@id=\"home-page\"]/div[18]/div[2]/div[1]/ul/li[1]/ul[2]/li[1]/div[2]/ul/li["+ i +"]/a")).click().perform();
                ($("li.despensa li:nth-of-type(" + i + ")")).waitUntilEnabled().click();
                Thread.sleep(8000);
                actdespensa.moveToElement($(ORDENAR)).click().perform();
                Thread.sleep(8000);
                actdespensa.moveToElement($(MAYORPRECIO)).click().perform();
                waitFor(6).second();
                actdespensa.moveToElement(BOTONCOMPRAR.get(0)).click().perform();
                Thread.sleep(8000);

                if (Pattern.matches(".(1)(6)(\\d).(\\d)(\\d)(\\d)",SUMACOMPRA.getText())) {
                    String C = SUMACOMPRA.getText();
                    System.out.println(C);
                    waitFor(5).seconds();
                FINALIZAR.click();
                break;
            }

            }

        }

    public void validarCompra() {

        String carrito = TEXTCARRITO.getText();
        assertThat(carrito,containsString("Mi Carrito"));

    }




    /*public void precio(String precio) {
        Actions actcalidar = new Actions(getDriver());
        int precioingresado= Integer.parseInt(precio);
        String valor=VALORTOTAL.getText();
        int tamañovalor=valor.length();
        String valortotal=valor.replace(".","");
        String valorfinal =valortotal.substring(1,tamañovalor-1);
        int preciototal=Integer.parseInt(valorfinal);
        if(preciototal<=precioingresado){
            waitFor(3).second();
            actcalidar.moveToElement($(TERMINOSYCONDICIONES)).click().perform();
            waitFor(3).second();
            //actcalidar.moveToElement($(FINALIZARCOMPRA)).click().perform();
        }
        else {
            SoftAssertions softAssertions = new SoftAssertions();
            softAssertions.fail("NO EXISTE CASO");
            softAssertions.assertAll();
            getDriver().close();
        }
    }*/

   /* public void validar() {
        Actions actcalidar = new Actions(getDriver());
        actcalidar.moveToElement($(btnitem)).click().perform();
        waitFor(5).second();
        actcalidar.moveToElement($(btncarritofinalizar)).click().perform();
    }

    */

}



