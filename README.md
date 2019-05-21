# Controle de Estágio

Estrutura do projeto realizada em Spring Boot pelo site: https://start.spring.io/

## Configurações
* Project: Maven Project
* Language: Java
* Spring Boot: 1.5.21
* Dependencies:
    * [Core] DevTools - Ferramentas adicionais ao Spring Boot
    * [Web] Web - Aplicação web Servlet com Spring MVC e Tomcat
    * [Template Engine] Thymeleaf - Uma das quatro engines padrões para desenvolvimento em Spring Boot, facilitando o controle de models em uma página HTML. É necessario JavaBeans para executar com Thymeleaf, o Spring initializr adiciona automaticamente
    * [SQL] - JPA - Possibilita a persistencia de dados usando Spring Data e Hibernate
    * [SQL] - JDBC - Possibilita a persistencia de dados usando JDBC
    * [SQL] - HSQLDB - Banco de dados HSQLDB

## Estrutura do projeto

* Classes marcadas com `@Controller` (e logo abaixo `@RequestMapping`) representa uma classe pronta para a utilização do Spring MVC recebendo requests. Cada funcionalidade deve possuir apenas um controlador. Ex.: UsuárioController, PerfilController, ClienteController. E dentro de cada uma, deve possuir os requests GET e POST: `@GetMapping` e `@PostMapping`
* Classes marcadas com `@Service` representa um serviço a ser chamado pelas classes controladoras.
* Classes de serviço chamam as classes de persistencia de dados (em JPA são repositórios, ou pode-se fazer em DAO), como `interface UsuarioRepository extends CrudReposutory<Usuario, Long>`
 
