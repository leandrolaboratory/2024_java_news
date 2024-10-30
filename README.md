# 2024_java_news



Java 8 - 2014
O Java 8 trouxe um marco significativo na evolução da linguagem Java, introduzindo expressões lambda e a Streams API, que revolucionaram a forma como lidamos com coleções de dados e processamento paralelo.

Além disso, o java.time proporcionou uma maneira mais eficiente e robusta de lidar com datas e horas em nossos programas.

Expressões Lambda
As expressões lambda permitem escrever código funcionalmente orientado de forma mais concisa, tornando-o mais legível e expressivo.

Uma expressão lambda é uma função anônima que pode ser passada como argumento ou armazenada em uma variável.

Streams API
A API de Streams fornece uma maneira poderosa e concisa de lidar com coleções de dados em Java.

Com a Streams API, pessoas desenvolvedoras podem realizar operações de processamento de dados, como filtragem, mapeamento e redução de forma declarativa e paralela — o que torna um código mais limpo e eficiente.

Novo mecanismo de data/hora - Java.time
O java.time é foi um novo pacote introduzido no Java 8 para lidar com operações relacionadas a data e hora.

Ele substitui o antigo pacote java.util.Date e java.util.Calendar, e oferece uma API mais abrangente e consistente para manipulação de datas, horários, intervalos de tempo e fusos horários.

Métodos padrão em interfaces
Os métodos padrão em interfaces permitem que interfaces em Java tenham implementações padrão para métodos.

Isso significa que as interfaces agora podem definir métodos concretos, o que simplifica a evolução das APIs sem quebrar a compatibilidade com versões anteriores.

Interfaces Funcionais
As interfaces funcionais contêm apenas um método abstrato. Elas são usadas em conjunto com expressões lambda para criar código mais conciso e legível em Java. Essas interfaces são a base para a programação funcional em Java 8.

Ordenação Paralela de Arrays
A ordenação paralela de arrays possibilita sua ordenação de forma simultânea, aproveitando assim os recursos de processamento multithread das CPUs modernas. Isso trouxe melhorias significativas de desempenho em operações de ordenação em grandes conjuntos de dados.

Referências a Métodos
As referências a métodos permitem referenciar métodos existentes (ou construtorese forma mais concisa do que as expressões lambda.

Isso torna o código mais legível e expressivo, especialmente ao trabalhar com APIs que esperam funções como argumentos.


Java 9 - 2017
Com o lançamento do Java 9, a modularidade finalmente chegou com o Projeto Jigsaw, permitindo uma organização mais inteligente e modular de nossos projetos Java.

Além disso, o JShell foi introduzido como uma ferramenta valiosa para testar pequenos trechos de código.

Jigsaw
O Projeto Jigsaw introduziu o conceito de módulos no Java, o que permitiu às pessoas desenvolvedoras modular suas aplicações e bibliotecas para melhorar a escalabilidade, a segurança e a manutenção do código.

O jigsaw foi uma das mudanças mais importantes do Java, pois introduz o módulo, uma coleção autodescritiva de código e dados que podem exportar ou encapsular pacotes.

Jshell
O JShell é um ambiente de linha de comando interativo que permite aos desenvolvedores experimentar rapidamente com o Java, testar pequenos trechos de código e explorar APIs sem a necessidade de escrever um programa Java completo.

Dessa forma você tem a possibilidade de digitar expressões diretamente no Jshell e já ver os resultados.

API para moedas
A inclusão de uma API para moedas fornece suporte integrado para operações monetárias, incluindo representações precisas de moedas, aritmética monetária e formatação de valores monetários.

Métodos privados em Interfaces
O Java 9 introduziu a capacidade de declarar métodos privados em interfaces, o que permitiu aos desenvolvedores organizar melhor o código e compartilhar implementações comuns entre métodos padrão.

HTTP/2 Cliente
O Java 9 introduziu uma API de cliente HTTP/2 nativa, que oferece suporte ao protocolo HTTP/2 para comunicação de rede mais eficiente e de alto desempenho.

Java 10 - 2018
A chegada do Java 10 trouxe a inferência de tipo de variável local, simplificou nossa escrita de código e o tornou mais limpo e legível.

Além disso, a API de coleta de heap paralela trouxe melhorias significativas no desempenho da coleta de lixo, especialmente em sistemas com múltiplos núcleos de CPU.

Inferência de tipo de variável local
Nessa versão, o Java introduziu a inferência de tipo de variável local, tornando a escrita muito mais legível.

A inferência de tipo de variável local permite que o tipo seja inferido automaticamente pelo compilador, com base no tipo da expressão à direita.

A inferência de tipos se destaca em cenários que envolvem tipos de dados extensos, nos quais a declaração explícita do tipo pode resultar em um código excessivamente detalhado.

Antes dessa atualização, ao declarar uma variável, era preciso especificar o tipo. Essa melhora na versão 10 permitiu que reduzíssemos a quantidade de código para declarar variáveis locais.


API de coleta de heap paralela
A API de coleta de heap paralela oferece suporte a uma nova interface de coleta de lixo paralela, a fim de melhorar o desempenho da coleta de lixo em sistemas com muitos núcleos de CPU.

Java 11 - 2018
Com o Java 11, recebemos o novo HTTP Client, o que proporcionou uma maneira mais moderna e eficiente de lidar com comunicações HTTP em nossos aplicativos Java.

Além disso, o uso do "var" em expressões lambda trouxe mais concisão e legibilidade ao nosso código.

HTTP Client Padronizado
O Java 11 apresentou um novo HTTP Client padronizado que oferece uma API mais moderna e flexível para comunicação HTTP do que o HttpURLConnection legado.

Uso do Var em expressões lambda
Permitiu o uso de var em expressões lambda, garantindo assim que os tipos dos parâmetros sejam inferidos automaticamente pelo compilador.

Flight Recorder
O Flight Recorder é uma ferramenta de diagnóstico de desempenho introduzida no Java 11 que permite gravar eventos do sistema e do aplicativo para análise posterior.

Epsilon
O Epsilon foi introduzido no Java 11 para fornecer uma opção de coleta de lixo mínima e de baixo impacto para aplicações que não exigem gerenciamento de memória dinâmica.

Java 12 - 2019
O Java 12 trouxe aprimoramentos nas expressões switch e formatação de números no padrão Short que levou a melhorias significativas na legibilidade do código.

Switch
As expressões switch foram aprimoradas no Java 12 para oferecer suporte a uma nova forma mais concisa e expressiva de escrever declarações switch.

Quando há muitos casos para serem tratados, o Switch torna o código muito mais claro.

Formatação de números no padrão Short
O Java 12 introduziu um novo formato de formatação de números no padrão curto, que permite formatar números de forma mais concisa e legível.

Java 13 - 2019
Com o lançamento do Java 13, foram introduzidos blocos de texto para facilitar a manipulação de strings multilinhas, juntamente com melhorias na API de fluxo de processo, proporcionando mais praticidade na manipulação de processos nativos.

Text Blocks
Os blocos de texto são uma nova forma de representar strings multilinhas e formatadas no Java 13, tornando mais fácil e legível incluir grandes blocos de texto em código Java.

Melhorias na API de fluxo de processo
O Java 13 introduziu melhorias na API de fluxo de processo para facilitar a manipulação de processos nativos e a comunicação entre processos.

Suporte ao Unicode 12.1
O Java 13 passa a oferecer suporte ao Unicode 12.1, o que permite que os desenvolvedores usem os últimos caracteres e emojis em suas aplicações Java.

Java 14 - 2020
O Java 14 introduziu Records para criar classes de dados imutáveis de forma concisa, além de implementar o pattern matching para instanceof e melhorias na depuração de erros.

Records (Preview)
Os Records são uma nova forma de declarar classes de dados imutáveis e com poucos métodos no Java 14. Isso oferece uma sintaxe mais concisa e expressiva para definir classes de dados simples.

Pattern Matching para instanceof (Preview)
O Java 14 introduziu o recurso pattern matching para a instânciaof, e assim permitiu extrair componentes de objetos e testar suas propriedades em uma única expressão.

Melhoras no NullPointerException
A partir do Java 14, houve melhorias na mensagem de NullPointerException, tornando-a mais descritiva e informativa para facilitar a depuração de erros.

Java 15 - 2020
Com o lançamento do Java 15, foram introduzidas classes ocultas e interfaces seladas, o que garantiu mais controle sobre quem pode herdar nossas classes e interfaces.

Também foram feitas melhorias na JDK para Windows, o que trouxe um alívio para pessoas desenvolvedoras que trabalham nesta plataforma.

Classes ocultas
As classes ocultas são classes que não podem ser referenciadas diretamente pelo código do usuário, e oferecem uma forma mais segura de encapsular a implementação interna.

Classes ocultas desempenham um papel fundamental em ocultar os detalhes de implementação, e promovem, assim, uma modularidade mais eficaz no código.

Melhorias JDK para windows
O Java 15 introduziu várias melhorias na JDK para Windows, incluindo melhorias no suporte a caminhos UNC e aprimoramentos no desempenho da JVM em sistemas Windows.

Sealed Classes/Interface
As classes e interfaces seladas são uma nova forma de restringir quais classes podem herdar de uma classe ou implementar uma interface, oferecendo maior controle sobre a hierarquia de tipos.

Java 16 - 2021
O Java 16 trouxe mais robustez com os Records e o pattern matching, juntamente com a API de acesso a memória externa, que abre portas para integração com código nativo de forma mais segura e eficiente.

Records (Final)
Os Records, introduzidos como uma prévia no Java 14, foram finalizados no Java 16, oferecendo uma maneira conveniente de declarar classes de dados imutáveis e com poucos métodos.

Instanceof (Final)
O recurso de pattern matching para instanceof, também introduzido como uma prévia no Java 14, foi finalizado no Java 16, permitindo extrair componentes de objetos e testar suas propriedades em uma única expressão.

Api de acesso a memória externa
O Java 16 introduziu uma nova API para acesso seguro e eficiente à memória externa, oferecendo uma maneira mais direta de interagir com memória não gerenciada.

Registro de classe
O registro de classe é uma nova forma de registrar classes para fins de reflexão, e permite que desenvolvedores consultem e manipulem classes dinamicamente em tempo de execução.

Java 17 - 2021
Com o lançamento do Java 17, foram feitos aprimoramentos nas classes e interfaces seladas, proporcionando mais controle sobre a hierarquia de tipos.

Além disso, o pattern matching para switch simplifica comparações complexas e traz mais expressividade ao código.

Classes e Interfaces Sealed
As classes e interfaces seladas, introduzidas como uma prévia no Java 15, foram aprimoradas na segunda prévia do Java 17, oferecendo assim mais flexibilidade e controle sobre quais classes podem ser estendidas ou implementadas.

Pattern Matching for switch
O recurso de Pattern Matching para switch, também introduzido como uma prévia no Java 15, foi aprimorado na segunda prévia do Java 17, o que permitiu extrair componentes de objetos e testar suas propriedades em uma única expressão dentro de instruções switch.

Novo pipeline de renderização para macOS
O Java 17 apresentou um novo pipeline de renderização para macOS, garantindo assim um melhor desempenho e funcionalidade para aplicativos Java em sistemas macOS.

Java 18 - 2022
O Java 18 trouxe a API de Vetor e UTF-8 por padrão, e assim ganhamos mais eficiência ao lidar com vetores e menos dores de cabeça com codificação.

API de Vetor
A API de vetor introduz uma nova maneira de trabalhar com vetores em Java, oferecendo operações mais eficientes e uma sintaxe mais concisa para manipulação de dados vetoriais.

UTF-8 por padrão
O Java 18 adota UTF-8 como o conjunto de caracteres padrão para fontes de código, o que simplifica a interoperabilidade entre sistemas e evita problemas de codificação.

Java 19 - 2023
Com o lançamento do Java 19, foram introduzidas funções e memória externa, juntamente com Threads virtuais, o que tornou o Java cada vez mais amigável para integração com código nativo e para lidar com concorrência.

API de Função e Memória Externa
A API de Função e Memória Externa permite que os desenvolvedores Java acessem funções e memória nativas de maneira segura e eficiente, abrindo novas possibilidades para integração de código nativo em aplicativos Java.

Threads virtuais
As threads virtuais são uma nova forma de gerenciar threads em Java, e oferecem uma abstração mais eficiente e escalável para programação concorrente.

Padrão record
O padrão record é uma nova forma de declarar classes de dados imutáveis e com poucos métodos em Java, e oferecem uma sintaxe mais concisa e expressiva para definir classes de dados simples.

Java 20 - 2023
O Java 20 trouxe um switch case melhorado e projetos Loom e Panama; isso significa menos bugs e mais eficiência na escrita.

Melhorias no uso de Switch case
Melhorias notáveis no switch-case, incluindo Pattern Matching para Switch e Expressões de Switch Multinível.

Estas melhorias permitem uma escrita de código mais simples e legível, e simplificam comparações complexas e possibilitando aninhamento de múltiplas expressões de switch para uma lógica condicional mais clara.

Projeto Loom (reinvenção do threading)
Iniciativa para melhorar o modelo de concorrência em Java, focando em desempenho e escalabilidade, especialmente para programas com uso intensivo de threads, através da introdução de fibers.

Projeto Panama (união do Java a outras plataformas)
Objetiva melhorar a interoperabilidade do Java com código nativo e sistemas externos, incluindo aprimoramentos na Java Native Interface (JNI) e ferramentas para facilitar a integração com bibliotecas externas.

Java 21 - 2023
Com o lançamento do Java 21, foram introduzidos Record Patterns e recursos de visualização. Assim transformamos a maneira como manipulamos dados.

Record Patterns para manipulação de dados aprimorada
O Java 21 introduziu record patterns, oferecendo uma maneira mais conveniente e expressiva de manipular dados estruturados representados por Record.

Recursos de visualização, incluindo modelos de string, classes sem nome e métodos main() de instância
O Java 21 trouxe vários recursos de visualização, incluindo modelos de string, classes sem nome e métodos main() de instância, que tornam o código Java mais expressivo e legível.

SequencedCollection para acesso direto aos elementos da coleção ordenada
O SequencedCollection é uma nova interface introduzida no Java 21, que oferece um acesso mais eficiente e direto aos elementos de uma coleção ordenada.

Java 22 - 2024
O Java 22 trouxe aprimoramentos no coletor de lixo G1 e API de Funções e Memória Estrangeira.

A ideia de lançar programas de código-fonte multi-arquivo sem complicações foi implementada, simplificando ainda mais o desenvolvimento em Java.

Melhorias no coletor de lixo G1 (Garbage-First)
Aprimoramentos no algoritmo de coleta de lixo G1 para otimizar o desempenho e a eficiência na utilização de memória.

API de Funções e Memória Estrangeira
A nova API de Funções e Memória Estrangeira oferece aos desenvolvedores Java uma maneira segura e eficiente de acessar funções e memória nativas.

Variáveis e Padrões Não Nomeados
Capacidade de utilizar variáveis e padrões sem nome em certos contextos,o que simplifica a escrita de código e aumenta a flexibilidade do código.

Lançamento de Programas de Código-fonte Multi-arquivo
Aprimoramentos no processo de compilação e execução de programas Java compostos por vários arquivos-fonte.

Classes Implicitamente Declaradas e Métodos de Instância Principal
A atualização traz melhorias para permitir declaração implícitas de classes e métodos de instância principal.

Isso significa que os desenvolvedores podem criar classes sem a necessidade de uma declaração explícita, o que simplifica a sintaxe e torna o código mais conciso.

Além disso, a introdução de métodos de instância principal implícitos simplifica o ponto de entrada para a execução do programa, o que proporciona uma estrutura mais limpa e organizada.
