#language: pt

  Funcionalidade: Verificar o retorno dos dados da API de CEP

    @Automação
    Esquema do Cenário: Validação de Logradouro e DDD
      Dado que eu realize uma pesquisa no <CEP>
      Então devo validar o <LOGRADOURO> e o <DDD>

      Exemplos:
        | CEP      | LOGRADOURO                      | DDD |
        | 18035370 | Avenida Doutor Afonso Vergueiro | 15  |
        | 11900000 |                                 | 13  |