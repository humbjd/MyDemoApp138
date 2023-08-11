#language: pt
Funcionalidade: Selecionar Produto
  Esquema do Cenario: Cenario: Selecionar Produto com Sucesso
    Dado que preciso comprar um presente
    Quando clico no <produto>
    Entao exibe a pagina com o nome do <produto> e <preco>






    Exemplos:
    | produto                 | preco     |
    | "Sauce Labs Backpack"   | "$ 29.99" |
    | "Sauce Labs Bike Light" | "$ 9.99"  |
    | "Sauce Labs Onesie"     | "$ 7.99"  |
