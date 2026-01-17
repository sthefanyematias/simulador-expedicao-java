# Simulador de Expedição Espacial

Este projeto foi desenvolvido em **Java** para consolidar o aprendizado de Programação Orientada a Objetos (POO), focando na criação de um sistema robusto, interativo e com tratamento de dados.

### Conceitos Aplicados

Neste projeto, apliquei os principais pilares do desenvolvimento Java:

* **Abstração e Herança:** Uma classe base abstrata (Tripulante) define os atributos essenciais, enquanto as subclasses (Engenheiro e Cientista) especializam os comportamentos.
* **Polimorfismo:** Uso de métodos sobrescritos (*@Override*) para que cada tripulante execute tarefas diferentes de acordo com sua classe.
* **Coleções (ArrayList):** Gerenciamento dinâmico de uma lista de objetos, permitindo adicionar quantos tripulantes o usuário desejar.
* **Casting e Verificação de Tipos:** Uso de `instanceof` e casting para acessar métodos exclusivos das classes filhas dentro de um loop genérico.
* **Validação e Tratamento de Dados:** Implementação de filtros com a classe Scanner para garantir que o programa não aceite entradas inválidas (como números fora do intervalo ou caracteres onde se espera inteiros).
* **Lógica de Status Dinâmico:** O sistema monitora a integridade dos tripulantes e altera automaticamente o status entre "Operacional", "Crítico" ou "Incapacitado".

### Funcionalidades

1. **Cadastro Dinâmico:** O usuário define a quantidade e o perfil da equipe.
2. **Ciclos de Missão:** Cada "dia" de missão gera tarefas e eventos de dano aleatório.
3. **Relatórios Detalhados:** Exibição organizada da saúde e do status operacional de cada membro da tripulação.
4. **Proteção contra Erros:** Sistema de loop que obriga o usuário a inserir comandos válidos para prosseguir ou sair.

### Estrutura do Código

* `Tripulante.java`: Classe mãe abstrata.
* `Engenheiro.java`: Especialização com foco em reparos de casco.
* `Cientista.java`: Especialização com foco em coleta de dados científicos.
* `MissaoEspacial.java`: Classe principal que gerencia o fluxo e as interações.

### Como Executar
1. Certifique-se de ter o JDK instalado (versão 21 recomendada).
2. Compile as classes e execute a classe `MissaoEspacial.java`.
