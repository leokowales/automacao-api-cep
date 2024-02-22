package automacao.api.cep.steps;

import automacao.api.cep.actions.PesquisaCepActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

import static org.hamcrest.CoreMatchers.equalTo;

public class ValidacaoCep {

    PesquisaCepActions pesquisaCepActions = new PesquisaCepActions();

    @Dado("que eu realize uma pesquisa no {}")
    public void queEuRealizeUmaPesquisaNoCep(long cep) {
        pesquisaCepActions.consultarCep("", cep);
    }

    @Então("devo validar o {} e o {}")
    public void devoValidaroLogradouroeoDDD(String logradouro, String ddd) {
        pesquisaCepActions.getCepResponse()
                .assertThat()
                .body("logradouro", equalTo(logradouro), "ddd", equalTo(ddd));
    }
}
