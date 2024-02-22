package automacao.api.cep.actions;


import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class PesquisaCepActions {

    ValidatableResponse cepResponse;

    public ValidatableResponse getCepResponse() {
        return cepResponse;
    }

    public void setCepResponse(ValidatableResponse cepResponse) {
        this.cepResponse = cepResponse;
    }

    public RequestSpecification cep(String payload){
        return given()
                .relaxedHTTPSValidation()
                .log().all();
    }

    public void consultarCep(String payload, long cep){
        setCepResponse(cep(payload)
                .pathParam("cep", cep)
                    .get("https://viacep.com.br/ws/{cep}/json/")
                .then()
                    .log().all());
    }
}