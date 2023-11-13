## Comentários do livro Software Engineering at Google

1. We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

//A engenharia de software trabalha em uma escala maior que o dezenvolvimento de aplicações, o engenheiro esta preocupado com eficiência da implementação, a escala, e o tempo, tendo em mente o que e onde será implementado. O engenheiro de software deve fazer decisões complexas baseadas com estimativas imprecisas.//

2. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

//Engenharia de software é a programação aplicada em um tempo e um ambiente, a engenhaeria de software aborda todos os aspectos da implementação e manutenção de um projeto//

## Três exemplos de trade-offs

1. Implementação de um linguagem de programação de alto nível onde se perde performance em troco de tempo e conforto.
2. Utlização de raid 0 onde se ganha performance em perda da segurança de dados.
3. Utilização NoSQL em vez de banco de dados relacionais onde se ganha performance na task mas perde em flexibilidade.

## 10 Usability Heuristics for User Interface Design

### Visibility of system status.
Erro: Sistema de carregamento de páginas do teams que não demonstra o progresso.
Acerto: Progresso de download de arquivo no windows

### Match between system and the real world.
Erro: Exibição de códigos erros referenciando portas de rede.
Acerto: Utilizar sistema de arquivos imitando um arquivo físico no windows

### User control and freedom.
Erro: Páginas web de cadastros que ao realizar um erro ao retornar a página anterior o progresso é perdido.
Acerto: Atalhos para retornar a um estado anterior do arquivo no word.

### Consistency and standards.
Erro: Utilização de caminhos confusos para alterações de configurações em aplicativos da meta.
Acerto: Utilização de cores para online, ocupado e ausente no discord.

### Error prevention.
Erro: Inversão de cores no siga.
Acerto: Confirmação que vai sobreescrever um arquivo no windowns.

### Recognition rather than recall.
Erro: Uma tela de confirmação que não mostra qual opção selecionou.
Acerto: Usar um calendário para selecionar um dia.

### Flexibility and efficiency of use.
Erro: Office 365 onde foi retirado diversas funcionalidades e atalhos.
Acerto: Intellij com diversos atalhos para maxizar eficiência.

### Aesthetic and minimalist design.
Erro: Telegram com design com muitas opções de uma vez só.
Acerto: Whatsapp com icones simples e legíveis.

### Help users recognize, diagnose, and recover from errors.
Erro: Erros de compilar Java, erros 
Acerto: Login que apresenta se o erro foi no nome do usúario ou na senha.

### Help and documentation.
Erro: Documentação do Geoserver.
Acerto: Documentação do Java.

________________________________________________________________________________________________________________________________________

## Diagramas


Diagrama de caso de uso:

![DiagramaUso2](https://github.com/SuieverSide/bertoti/assets/31674205/dd92b5de-266a-4b70-aa0e-e2bbd6ec0c78)




Diagrama de classe:


