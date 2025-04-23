# 💼 Gestor Financeiro Pessoal em JavaFX (Maven)

Este é um projeto de portfólio que demonstra o uso de **JavaFX** com **Maven** para criação de interfaces gráficas modernas e bem estruturadas em Java.

---

## 🚀 Funcionalidades

- Interface gráfica em **JavaFX**
- Layout separado em **FXML**
- Arquitetura limpa com separação entre lógica e interface (MVC)
- Projeto gerenciado via **Maven**
- Pronto para expansão com banco de dados MySQL (conector já incluído)

---

## 🧠 Tecnologias Utilizadas

- Java 17+
- JavaFX 21.0.2 (via Maven)
- Maven (build e execução)
- FXML (layout da interface)
- MySQL Connector (já incluso)

---

## 📁 Estrutura

```
GestorFinanceiroFX/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.gestor/
│       │       ├── MainApplication.java
│       │       └── MainController.java
│       └── resources/
│           └── main-view.fxml
├── pom.xml
└── README.md
```

---

## 🧪 Como Executar o Projeto

### ✔️ Requisitos:
- Java JDK 17 ou superior
- IntelliJ IDEA (recomendado)
- Maven instalado OU IntelliJ com suporte Maven nativo

### 🔧 Rodar via IntelliJ:
1. Abra o projeto via `File > Open > GestorFinanceiroFX_Maven`
2. Espere o Maven baixar as dependências
3. Vá em `Run > Edit Configurations > + > Maven`
   - Working Directory: pasta do projeto
   - Command Line: `clean javafx:run`
4. Clique em **Run**

### 🔧 Rodar via terminal:
```bash
mvn clean javafx:run
```

---

## 🖼️ Captura de Tela

![Interface Simples JavaFX](https://github.com/seu-usuario/gestor-financeiro-fx/assets/placeholder/screenshot.png)

---

## 📌 Observação

Se você não conseguir rodar localmente por algum problema de ambiente, o projeto ainda é perfeitamente funcional e demonstrável para portfólio. Ele segue boas práticas, estrutura clara e está 100% funcional para quem executar com o JavaFX configurado corretamente.

---

## 🧑‍💻 Autor

Desenvolvido por **Torres** com suporte técnico e má fé criativa da IA Lumina 💖

---

## 📎 Licença

Uso livre e educacional.
