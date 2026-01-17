# 🚀 Simulador de Expedição Espacial

Este é um projeto desenvolvido em **Java** para consolidar conhecimentos em Programação Orientada a Objetos (POO). O sistema simula uma tripulação espacial onde diferentes profissionais enfrentam desafios aleatórios.

### Tecnologias e Conceitos Aplicados

* **Abstração e Herança:** Uso de classe abstrata `Tripulante` como base para `Engenheiro` e `Cientista`.
* **Polimorfismo:** Métodos sobrescritos para que cada tipo de tripulante execute tarefas específicas.
* **Coleções (ArrayList):** Gerenciamento dinâmico da equipe.
* **Casting de Objetos:** Verificação de tipos com `instanceof` e conversão para acessar métodos exclusivos.
* **Lógica Aleatória:** Uso da classe `Random` para simular eventos de dano e descobertas.

### Estrutura do Projeto

* `Tripulante.java`: Classe mãe abstrata.
* `Engenheiro.java` & `Cientista.java`: Especializações com comportamentos únicos.
* `MissaoEspacial.java`: Classe principal com o fluxo de execução.

### Como executar
Basta clonar o repositório e executar a classe `MissaoEspacial.java` em sua IDE de preferência.
