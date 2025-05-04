package ma.lahjaily.springai.service;



import ch.qos.logback.core.net.DefaultSocketConnector;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LlamaAiService {

    @Autowired
    private OllamaChatModel chatModel;

    public String generate(String promptMessage) {

        ChatResponse response = chatModel.call(
                new Prompt(
                        promptMessage,
                        OllamaOptions.builder()
                                .model("llama2")
                                .build()
                ));
        return response.getResult().getOutput().getText();
    }
}

