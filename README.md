# UPay
**Upay** é uma API RESTful para gerenciar transações financeiras e fornecer estatísticas em tempo real. Desenvolvido como um desafio para exercitar e aprimorar conhecimentos em desenvolvimento back-end, o Upay foca na construção de uma solução robusta e eficiente para manipulação de dados em memória.

Habilidades e Tecnologias Destacadas:
Java e Spring Boot: Construção de uma aplicação web escalável e de fácil manutenção utilizando o ecossistema Spring Boot.

APIs RESTful: Implementação de endpoints (POST /transacao, DELETE /transacao, GET /estatistica) seguindo as melhores práticas de design de API.

Gerenciamento de Dados em Memória: Armazenamento e processamento de transações em memória usando ConcurrentLinkedQueue para garantir segurança de thread e alto desempenho.

Validação de Dados: Aplicação de validações rigorosas para dados de entrada e tratamento de erros adequado (códigos de status HTTP 400 e 422).

Processamento de Streams: Utilização das Streams API do Java 8+ para filtrar, transformar e calcular estatísticas de forma eficiente e concisa, incluindo o uso de DoubleSummaryStatistics.

Controle de Versão: Uso de Git e GitHub para gerenciamento de código e colaboração.

-----

Visão Geral da API:
O Upay expõe os seguintes endpoints:

POST /transacao: Adiciona uma nova transação.

DELETE /transacao: Limpa todas as transações armazenadas.

GET /estatistica: Retorna estatísticas agregadas (soma, média, mínimo, máximo, contagem) para transações dos últimos 60 segundos.

Este projeto demonstra a capacidade de construir soluções back-end eficientes, aderindo a requisitos específicos e otimizando o processamento de dados em tempo real.
