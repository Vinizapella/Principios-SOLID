# 🧱 Fixando o SOLID

> Atividades práticas de fixação dos **5 princípios SOLID** — escrevendo código limpo, flexível e profissional.

---

## 🗂️ Sobre

Este repositório reúne exercícios de **fixação dos 5 princípios SOLID**, explorando na prática como aplicar cada um deles em Java para criar um código mais organizado, reutilizável e fácil de manter.

---

## 🧠 Os 5 Princípios SOLID

### S — Single Responsibility Principle
> *Uma classe deve ter um, e somente um, motivo para ser modificada.*

Cada classe cuida de **apenas uma responsabilidade**, tornando o código mais fácil de entender e testar.

---

### O — Open/Closed Principle
> *Uma classe deve estar aberta para extensão, mas fechada para modificação.*

Adicione novos comportamentos **sem alterar o código existente**, usando herança ou interfaces.

---

### L — Liskov Substitution Principle
> *Subclasses devem poder substituir suas classes base sem quebrar o sistema.*

Se `B` herda de `A`, então `B` deve funcionar em qualquer lugar onde `A` é esperado.

---

### I — Interface Segregation Principle
> *Uma classe não deve ser obrigada a implementar métodos que não utiliza.*

Prefira **interfaces específicas e coesas** a interfaces genéricas e cheias de métodos.

---

### D — Dependency Inversion Principle
> *Dependa de abstrações, não de implementações concretas.*

Módulos de alto nível não devem depender de módulos de baixo nível — ambos devem depender de **abstrações**.

---

## 🚀 Como executar

```bash
# Clone o repositório
git clone https://github.com/Vinizapella/SRP.git

# Acesse a pasta
cd SRP

# Compile e execute
javac src/main/java/*.java
java -cp src/main/java Main
```

---

## 📁 Estrutura

```
📦 Fixando-o-SOLID
 ┣ 📂 src
 ┃ ┗ 📂 main
 ┃   ┗ 📂 java
 ┃     ┣ 📂 srp
 ┃     ┣ 📂 ocp
 ┃     ┣ 📂 lsp
 ┃     ┣ 📂 isp
 ┃     ┗ 📂 dip
 ┗ 📄 README.md
```

---

## 👤 Autor

Feito com 🖤 por **Vinizapella** — projeto concluído para fins acadêmicos.

---

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/SOLID-5%20princípios-6a0dad?style=flat-square" />
  <img src="https://img.shields.io/badge/Clean%20Code-✔-blue?style=flat-square" />
  <img src="https://img.shields.io/badge/status-concluído-brightgreen?style=flat-square" />
</p>
