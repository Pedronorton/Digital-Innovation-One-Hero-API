# Digital-Innovation-One-Hero-API

## 📄 Sobre

O projeto consiste em uma API de heróis disponibilizada pela [**Digital Innovation One**](https://web.digitalinnovation.one/lab/criando-seu-gerenciador-de-super-herois-da-marvel-e-da-dc-em-uma-api-reativa-com-spring-boot/learning/ae7b03fd-bfde-46d4-99b3-ed86792c17e1). A aplicação consiste em uma API que lista, cria e deleta herois.

---

## 🚀Tecnologias utilizadas 
O projeto foi utilizado utilizando as seguintes tecnologias.

- [Java 8](https://www.java.com/pt-BR/)
- [Spring web flux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
- [DynamoDB](https://aws.amazon.com/pt/dynamodb/)
- [junit](https://junit.org/junit5/)

---

## 📂 Estrutura
- HerosApi/src/main/java/com/digitalinnovationone/herosapi = código da api com controller, service, repository, config e model.
- HerosApi/src/test/java/com/digitalinnovationone/HerosapiApplicationTests = código da api com alguns testes unitários.
- 

--- 

## :mag_right: Aprendizado
- Neste módulo do curso disponibilizado pela digital Innovartion One, algumas tecnologias interessantes foram utilizadas, como o web flux com o dynamoDb. Geralmente utiliza-se o JDBC com JPA para criar as interfaces de acesso ao banco de dados, aqui utilizamos o web flux com o dynamo, tecnologias diferentes para alcançar outro nível de conhecimento. Fazemos a implementação da tabela e inserção de uma maneira mais manual que o usual.

## :bookmark_tabs: Setup
- Fazer cadastro na [AWS](https://sa-east-1.console.aws.amazon.com/console/home?region=sa-east-1)
- Baixar [AWS CLI](https://aws.amazon.com/pt/cli/)
- Configurar na máquina. Para ver as credenciais entre na conta na aws e acesse credenciais de segurança
- Basta executar o comando e inseri-las 
```bash
    aws configure
```

## 💻 Baixar
```bash
    $ https://github.com/Pedronorton/Digital-Innovation-One-Hero-API.git
```
- [DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBLocal.html)
- Descompactar arquivo em uma pasta e através do terminal acessá-la e executar o seguinte comando
```bash
    $ java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
```
### Executar API
Exercutar arquivo 
HerosApi/src/main/java/com/digitalinnovationone/herosapi/HerosapiApplication.java

### Documentação API
https://documenter.getpostman.com/view/9197631/Tz5qZGds


