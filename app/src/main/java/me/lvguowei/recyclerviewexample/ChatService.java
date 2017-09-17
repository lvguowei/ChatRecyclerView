package me.lvguowei.recyclerviewexample;

import java.util.ArrayList;
import java.util.List;

class ChatService {

    List<MessageDTO> getMessages() {
        List<MessageDTO> result = new ArrayList<>();
        result.add(new MessageDTO("Hello!", true, 1505548800000L));
        result.add(new MessageDTO("What?", false, 1505549700000L));
        result.add(new MessageDTO("I want to go now.", true, 1505556900000L));
        result.add(new MessageDTO("Where are you?", true, 1505568800000L));
        result.add(new MessageDTO("I will be there shortly.", false, 1505749700000L));
        result.add(new MessageDTO("Are you there yet?", true, 1508556900000L));
        result.add(new MessageDTO("No", true, 1508557900000L));
        result.add(new MessageDTO("Look at me", false, 1508586900000L));
        result.add(new MessageDTO("Funny", true, 1508559900000L));
        return result;
    }
}
