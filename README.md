### person-API

**Disponível em:** https://mguanaz-people-api.herokuapp.com

A API implementa as operações de:

- **get** */api/v1/person* -> Lista todos as pessoas cadastradas;
- **get** */api/v1/person/{id}* -> Retorna as informações do contato conforme o id informado;
- **post** */api/v1/person* -> Cria um novo registro de pessoa, para esta operações é necessário informar um *json* na requisição:
  ```
  {
    "firstName" : "firstName",
    "lastName" : "lastName",
    "cpf" : "12345678900",
    "birthDate" : "01-01-2020",
    "phones" : [
        {
            "type" : "MOBILE", 
            "number" : "1234567891111"
        }
     ]
  }

- **put** /api/v1/person/{id} -> Atualiza os dados de um registro já existente
  ```
  {
    "id" : 1
    "firstName" : "firstName",
    "lastName" : "lastName",
    "cpf" : "12345678900",
    "birthDate" : "01-01-2020",
    "phones" : [
        {
            "id" : 1,
            "type" : "MOBILE", 
            "number" : "1234567891111"
        }
     ]
  }
  
- delete /api/v1/person/{id} -> Exclui um registro.

###Execução local

Para executar este projeto localmente é necessário ter o maven instalado, sendo assim.

Basta utilizar o comando **mvn springboot:run** na raiz do projeto.

