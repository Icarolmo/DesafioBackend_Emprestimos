# DesafioBackend_Emprestimos

Este projeto foi feito para estudo e aperfeiçoamento das ferramentas Java e Spring além de aperfeiçoamento de implementação de padrão de projeto MVC. A ideia partiu como uma proposta de solução ao Desafio de Emprestimos do repositório do Backend Brasil.

## Sobre o desafio.
Neste desafio era necessário implementar um serviço para determinar quais modalidades de empréstimos uma dada pessoa tem acesso, as modalidades disponibilizada para a pessoa tinha que ser com base na regra de negócio do serviço e nas variáveis específicas da pessoa, sendo elas: idade, salário e localização. 

### Exemplo de chamada do serviço:

**[POST]** `{{host}}/customer-loans`

```json
{
  "age": 26,
  "cpf": "275.484.389-23",
  "name": "Vuxaywua Zukiagou",
  "income": 7000.00,
  "location": "SP"
}
```

O serviço deve retornar uma resposta com o nome do cliente que realizou a requisição junto a lista de empréstimos que ele tem acesso com o tipo e a taxa de juros: 

```
HTTP/1.1 200 Ok
```

```json
{
  "customer": "Vuxaywua Zukiagou",
  "loans": [
    {
      "type": "PERSONAL",
      "interest_rate": 4
    },
    {
      "type": "GUARANTEED",
      "interest_rate": 3
    },
    {
      "type": "CONSIGNMENT",
      "interest_rate": 2
    }
  ]
}
```

### Requisitos/Regras de negócio:

- Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30
  anos e residir em São Paulo (SP).
- Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
- Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver
  menos de 30 anos e residir em São Paulo (SP).

Para mais detalhes do desáfio acesse o repositório do Backend Brasil](https://github.com/backend-br/desafios).

## Sobre o projeto.
Neste projeto foi implementado apenas um endpoint para o serviço em Java/Spring seguindo o Padrão MVC (Model View Controller) com o objetivo de receber os dados do cliente, aplicar os requisitos/regra de negócio e devolver os empréstimos disponíveis para o mesmo. Não foi preciso a utilização de banco de dados para está implementação.

## Exemplo de teste: 

- Requisição com dados do cliente em "customer-loans". Resposta com empréstimos disponíveis de acordo com os requisitos.

  ![image](https://github.com/Icarolmo/DesafioBackend_Emprestimos/assets/72323389/4e5a9bf6-fd4f-48f9-a37f-12013c263d1f)



