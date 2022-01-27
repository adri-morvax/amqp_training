package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {

    private final ChatMessageRepository repo;

    public ChatMessageController(ChatMessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("api/message")
    public List<String> get () {
        return this.repo.getLastTenMessages();
    }
}
