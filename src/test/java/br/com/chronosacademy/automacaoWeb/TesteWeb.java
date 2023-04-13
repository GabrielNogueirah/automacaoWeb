package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    ChromeDriver driver;

    @Before
    public void inicializacaoTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br/");
    }

    @Test
    public void primeiroteste(){
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String Titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", Titulo);

    }
    @After
    public void finalizacaoTeste(){
        driver.quit();
    }
}
