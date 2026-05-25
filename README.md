# TaskFlow API

API REST desenvolvida com Java utilizando Jakarta EE para gerenciamento de tarefas.
O projeto foi criado com foco em estudos de backend enterprise, arquitetura em camadas, persistência de dados, validações e testes unitários.

---

## 🚀 Tecnologias utilizadas

* Java 17
* Jakarta EE 10
* JPA / Hibernate
* PostgreSQL
* WildFly
* Maven
* Docker
* JUnit 5
* Mockito

---

## 📁 Estrutura do projeto

```text id="a1"
src/main/java/com/keth
├── config
├── controller
├── entity
├── exception
├── repository
└── service
```

O projeto segue arquitetura em camadas:

* **Controller** → endpoints REST
* **Service** → regras de negócio
* **Repository** → acesso ao banco de dados
* **Entity** → entidades JPA
* **Exception** → tratamento global de erros

---

## ⚙️ Funcionalidades

* Criar tarefas
* Listar tarefas
* Buscar tarefa por ID
* Atualizar tarefas
* Remover tarefas
* Validação de dados
* Tratamento global de exceções
* Testes unitários

---

## 📌 Endpoints

### 🔹 Listar tarefas

```http id="a2"
GET /api/tasks
```

---

### 🔹 Buscar tarefa por ID

```http id="a3"
GET /api/tasks/{id}
```

---

### 🔹 Criar tarefa

```http id="a4"
POST /api/tasks
```

Body:

```json id="a5"
{
  "title": "Estudar Jakarta EE",
  "description": "Aprender backend enterprise",
  "done": false
}
```

---

### 🔹 Atualizar tarefa

```http id="a6"
PUT /api/tasks/{id}
```

---

### 🔹 Remover tarefa

```http id="a7"
DELETE /api/tasks/{id}
```

---

## ✅ Validações implementadas

* Título obrigatório
* Descrição obrigatória
* Limite mínimo e máximo de caracteres

---

## 🧪 Testes unitários

O projeto possui testes unitários utilizando:

* JUnit 5
* Mockito

Exemplo de execução:

```bash id="a8"
mvn test
```

---

## 🐳 Executando o projeto

### Subir containers

```bash id="a9"
docker compose up -d
```

---

### Gerar build

```bash id="a10"
mvn clean package
```

---

### Deploy no WildFly

```bash id="a11"
docker cp target/taskflow-api.war taskflow-wildfly:/opt/jboss/wildfly/standalone/deployments/
```

---

## 📚 Aprendizados aplicados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

* APIs REST
* Arquitetura em camadas
* Persistência com JPA
* Operações CRUD
* Validação de dados
* Tratamento de exceções
* Testes unitários
* Containerização com Docker
* Deploy utilizando WildFly

---

## 👩‍💻 Desenvolvido por

**Kethelyn Couto**

* GitHub: [@ketymonique](https://github.com/ketymonique?utm_source=chatgpt.com)
