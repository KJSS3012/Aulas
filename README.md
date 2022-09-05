# :wink: Códigos das Aulas

![Status](http://img.shields.io/static/v1?label=Status&message=Desenvolvimento&color=GREEN&style=for-the-badge)

Utilize os links na aba **"Índice"** para acessar as questões e seus respectivos links para: Youtube e Github

## Índice

- [[27/07/2022] Calculadora](#Classe_Calculadora)
- [[27/07/2022] Veiculo](#Classe_Veiculo)
- [[01/09/2022] Sistema Escolar](#Prova_Sistema_Escolar)

### Classe_Calculadora

> Crie uma classe calculadora. Esta classe deve ser abstrata e implementar as operações básicas (soma, subtração, divisão e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que implementa os seguintes cálculos: raiz quadrada e a potência. Dica utilize a classe Math do pacote java.lang.

<a href = "https://youtu.be/xtquwz3U4N8">![Youtube](https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)</a>
<a href = "https://github.com/KJSS3012/Aulas/tree/main/Classe_Calculadora">![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)</a>

### Classe_Veiculo

> Criar uma estrutura hierárquica que contenha as seguintes classes: Veiculo (classe abstrata), Bicicleta e Automóvel.
> Os métodos da classe Veiculo são todos abstratos e possuem a seguinte assinatura:
> public float acelerar(float velocidade);
> public void parar();
> Estes métodos são implementados nas subclasses Automóvel e Bicicleta. Acrescentar na classe Automóvel o método public void mudarOleo(foat litros).

<a href = "https://youtu.be/86_JFATHnKM">![Youtube](https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)</a>
<a href = "https://github.com/KJSS3012/Aulas/tree/main/Classe_Veiculo">![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)</a>

### Prova_Sistema_Escolar

Considerando os conceitos de Orientação a Objetos já visto, veja o seguinte cenário:

"O Prof. Pedro do IFRN está precisando de ajuda para decidir quem deverá passar na disciplina, ele precisa de um pequeno sistema para isso, ele já identificou algumas entidades entre elas uma classe Aluno com os seguintes atributos: nome (String), matricula (String), cpf (String); Uma classe disciplina: nome (String); Uma classe professor:nome (String), matricula (String), cpf (String); Uma classe Turma: professor(Professor), alunos (Lista de alunos);”

Problemática: Contudo ele não consegue pensar em uma classe que permita lançar as notas dos alunos e suas faltas, veja que nessa classe precisamos saber quem são os alunos, quem é o professor, seja possível dizer os dias que o aluno faltou, as notas de suas atividades (duas atividades) e provas (duas provas) com seus respectivos pesos (peso 2 cada atividade e 3 para cada prova) e calcular se ele foi reprovado. Desta forma você deverá analisar e implementar a solução para ajudar o referido, da seguinte forma:

 - Baseado na sua classe faça o método verificar falta de aluno, para dizer se o aluno foi reprovado por falta, isso ocorre se o aluno tiver mais de 25% de faltas.
- Baseado na sua classe faça o método para verificar se o aluno pode ir para final. O estudante que não for reprovado por falta e obtiver média igual ou superior a 20 (vinte) e inferior a 60 (sessenta) terá direito a  uma avaliação final em cada disciplina.

<!-- <a href = "https://youtu.be/86_JFATHnKM">![Youtube](https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)</a> -->
<a href = "https://github.com/KJSS3012/Aulas/tree/main/Prova_Sistema_Escolar">![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)</a>

