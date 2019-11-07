package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.choucairtesting.com/")
public class ChoucairHomePage extends PageObject {

    public static final Target VINCULO_SERVICIOS = Target.the("El vinculo para ingresar a Servicios")
            .located(By.xpath("//li[@id='menu-item-6142']"));



}
