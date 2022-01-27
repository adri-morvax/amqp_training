package lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {
    List<String> a= new ArrayList<>();
    void addChatMessage (String message) {
        a.add(message);
        if (a.size() >= 10)
            a.remove(0);
    }
    List<String> getLastTenMessages() {
        return a;
    }


}
