package fr.lernejo.chat;


import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    private final ChatMessageRepository repo;

    public ChatMessageListener(ChatMessageRepository repo) {
        this.repo = repo;
    }



    public void onMessage (String message) {
        repo.addChatMessage(message);
    }
}
