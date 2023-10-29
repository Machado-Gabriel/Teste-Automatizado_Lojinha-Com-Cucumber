package steps;

import core.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import maps.LoginMaps;
import pages.LoginPage;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class LoginStep {

    private LoginPage loginPage;

    private String usuario;


    @Before
    public void inicializaTeste(){
        Driver.inicializaNavegador();

    }

    @Dado("que esteja na página da lojinha")
    public void queEstejaNaPáginaDaLojinha() {
        Driver.getDriver().get("http://165.227.93.41/lojinha-web/v2/");
        loginPage = new LoginPage();
    }
    @Quando("o login for realizado com os seguintes dados")
    public void oLoginForRealizadoComOsSeguintesDados(Map<String, String> map ) {
        usuario = map.get("usuario");
        loginPage.realizaLogin(map.get("usuario"), map.get("senha"));
    }
    @Entao("valido que o login foi executado")
    public void validoQueOLoginFoiExecutado() {
        assertEquals("Boas vindas, "+usuario+"!", loginPage.getBoasVindas());
    }
}
