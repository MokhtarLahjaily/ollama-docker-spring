# 🦙 Ollama Docker Spring — Chat with LLaMA 2

A simple Spring Boot web application that allows you to chat with **LLaMA 2**, powered by the [`ollama`](https://github.com/ollama/ollama) Docker image.

This project leverages **Spring AI** and **Ollama** to provide an easy interface for experimenting with large language models locally.

---

## 🚀 Features

- 🐳 Run LLaMA 2 locally via Docker using the Ollama image
- 🌱 Spring Boot 3.4+ with Java 21
- 💬 Chat support via REST API using Spring AI
- 🛠 Configurable Ollama integration via `application.yml`
- 📦 Built with Maven

---

## 🛠 Technologies

- Java 21
- Spring Boot 3.4.5
- Spring AI (`spring-ai-starter-model-ollama`)
- Docker + Docker Compose

---

## 📦 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/ollama-docker-spring.git
cd ollama-docker-spring
```

### 2. Start the Ollama container

```bash
docker compose -f docker-compose.yml up
```

This will:

Pull the ollama/ollama image

Expose the Ollama service on port 11434

Then, load the LLaMA 2 model by running:

```bash
docker exec -it ollama ollama run llama2
```
> ⚠️ The model may take a few minutes to load the first time.

### 3. Configure the application

Ensure your application.yml contains:

```yaml
spring:
  ai:
    ollama:
      base-url: http://localhost:11434
      chat:
        model: llama2

server:
  port: 9292

```

### 4. Run the Spring Boot application
Using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or with Maven:

```bash
mvn spring-boot:run
```

## 📡 Example API Request
Send a GET request to the following endpoint with your prompt message:
```bash
http://localhost:9292/api/v1/generate?promptMessage=Hello+LLaMA2
```

## 📁 Project Structure
```bash
.
├── docker-compose.yml        # Docker config for Ollama
├── pom.xml                   # Maven dependencies and Spring AI integration
├── src/
│   ├── main/
│   │   ├── java/             # Java source code
│   │   └── resources/
│   │       └── application.yml
```

## 🧑‍💻 Author
**Mokhtar Lahjaily**

---

## 📄 License
This project is licensed under the [MIT License](LICENSE).

---

## 🌐 Resources
- [Spring AI Documentation](https://docs.spring.io/spring-ai/reference/)
- [Ollama GitHub](https://github.com/ollama/ollama)
- [LLaMA 2 by Meta](https://ai.meta.com/llama/)






