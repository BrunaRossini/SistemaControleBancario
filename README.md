# Sistema de Controle Bancário
<p> Exercício em Java para persistência de dados.
<p> A persistência armazena o estado dos objetos em algum repositório de dados para, futuramente,recuperá-los.

# Definição
<p> Escolhida uma biblioteca de classes para, a partir da linguagem hospedeira, conectar e manipular bancos de dados relacionais.
<p> Sublinguagem de Dados (Repositório de dados): Banco de dados relacional PostgreSQL.
<p> Linguagem Hospedeira: Java.
<p> Biblioteca: JDBC do PostgreSQL.
<p> Foi desenvolvido, inicialmente como exemplo, duas classes do Sistema de Controle Bancário para aprendizado: Movimento e ContaComum.
<h3> Métodos/Operações: </h3>
<p> Registro de uma conta comum; 
<p> Atualização de conta comum;
<p> Obter conta comum pelo numero da conta;
<p> Movimentações de depósito e saque;
<P> Efetivar movimentação;
<p> Registros por id serial das movimentações das respectivas contas;

# Padrão DAO
Padrão utilizado para a modelagem de classes de repositório, esconde (encapsula e abstrai) os detalhes referentes à persistência de dados do restante da aplicação. 
<p> Foi determinada a utilização do padrão DAO por ser uma aplicação simples. 


# Arquiterura
Uma boa prática é termos um pacote (módulo ou camada) reservada ao Modelo de domínio (dados que precisam ser persistidos).
<h2> Camada de domínio -  Modelo de domínio </h2>
<h3>Classe de Domínio.</h3>
<p> As classes de domínio do projeto: modelo.Movimento e modelo.ContaComum.
<p> ° Modela um conjunto de objetos de domínio do problema.
<p> ° Em java pode ser chamado de classe POJO (Plain Old Java Object - Bom e Velho Objeto Java).
<p> ° Contém apenas os atributos e métodos amodelo.Movimencessadores e modificadores.

<h2> Camada de domínio -  Modelo repositório </h2>
<h3> Classe de conexão ao banco de dados </h3>
<p> As classes de repositório do projeto: modelo.repositoro.FabricaConexao.
<p> ° Pacote contendo classes de repositório.
<p> ° Classe responsável por gerenciar conexões com um banco de dados.
<p> ° Realiza a abertura e o fechamento de conexões.
<p> ° Pode ser herdada por classes de repositório.
<p> ° Necessidade de importação no projeto Java da biblioteca de classes (driver) JDBC para o SGBD utilizado, no caso do exemplo, o PostgreSQL.

<h3> Classe de repositório </h3>
<p> As classes de repositório do projeto: modelo.repositoro.ContaComumDAO e modelo.repositorio.MovimentoDAO.
<p> ° Classe que abstrai o conjunto de objetos de uma determinada classe de domínio persistidos no banco de dados, bem como as operações possíveis de serem efetuadas sobre eles (inserção, recuperação, atualização e
exclusão; ou create, retrieve, update and delete - CRUD).
<p> ° Objetos desse tipo estabelecem uma interface entre o modelo orientado a objetos e o modelo relacional.
<p> ° Objetos desse tipo efetuam o mapeamento objetorelacional, transparente ao restante da aplicação.


# Referências 
Site para download do driver JDBC para PostgreSQL: https://jdbc.postgresql.org
<p> Documentação para conexão e utilização do PostgreSQL: https://jdbc.postgresql.org/documentation/head/
<p> Aulas assíncronas LP2A4 - Professor Vanger M. Gonçalves: https://repl.it/@vagnergoncalves/LP2A4-T03-V03-Demonstracao-ElephantSQL



  









