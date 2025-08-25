# 🎮 DSList - Catálogo de Jogos

Projeto desenvolvido em **Java com Spring Boot**, que implementa uma **API REST** para gerenciar uma lista de jogos.  
Inspirado no curso *Intensivão Java Spring* do [DevSuperior](https://devsuperior.com.br/).

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Web
- Banco de dados H2 (ambiente de teste)
- Maven

---

## 📂 Estrutura do Projeto

src/
 └── main/
     ├── java/com/lucasmiranda/dslist
     │    ├── controllers
     │    ├── dto
     │    ├── entities
     │    ├── repositories
     │    └── services
     └── resources/
          ├── application.properties
          └── import.sql


---

## ⚙️ Como executar o projeto

### Pré-requisitos
- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)

### Passos
```bash
# Clonar repositório
git clone https://github.com/LucasMir4nd4/dslist.git

# Entrar na pasta do projeto
cd dslist

# Rodar a aplicação
./mvnw spring-boot:run

