Processador de CSV
Este projeto é uma ferramenta para processar arquivos CSV contendo dados de produtos, permitindo calcular e gerar um relatório com o preço total de cada item com base na quantidade.

Funcionalidades
Leitura de arquivos CSV com formato específico.
Cálculo do preço total para cada produto (preço unitário multiplicado pela quantidade).
Geração de um novo arquivo CSV com os resultados, evitando problemas de memória ao processar grandes volumes de dados.
Desafios Enfrentados
Durante o desenvolvimento, enfrentei o erro OutOfMemoryError ao tentar carregar arquivos grandes na memória. Para superar isso, implementei uma abordagem que lê e processa o arquivo linha por linha, otimizando o uso de memória e melhorando a eficiência.

Como Usar
Clone o repositório.
Modifique o caminho do arquivo CSV no código, conforme necessário.
Execute o programa. Um novo arquivo produtosTotais.csv será gerado com os resultados.
Tecnologias
Java
Manipulação de arquivos
Processamento de dados
Contribuições
Sinta-se à vontade para contribuir! Abra uma issue ou envie um pull request com melhorias ou sugestões.
