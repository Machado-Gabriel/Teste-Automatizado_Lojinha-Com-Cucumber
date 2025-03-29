#language:pt

Funcionalidade: Login

  @Login
  Cenário: Realizar Login
    Dado que esteja na página da lojinha
    Quando o login for realizado com os seguintes dados
      | usuario | admin |
      | senha   | admin |
    Entao valido que o login foi executado

  @loginEsquema
  Esquema do Cenario: Realizar Login com <usuario>
    Dado que esteja na página da lojinha
    Quando o login for realizado com os seguintes dados
      | usuario | <usuario> |
      | senha   | <senha>   |
    Entao valido que o login foi executado

    Exemplos:
      | usuario | senha |
      | admin   | admin |
      | Adam    | admin |

