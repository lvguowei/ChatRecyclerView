package me.lvguowei.recyclerviewexample;


abstract class BaseMessageItem extends MessageItem {

    MessageDTO messageDTO;

    BaseMessageItem(MessageDTO messageDTO) {
        this.messageDTO = messageDTO;
    }

    String getMessage() {
        return messageDTO.message;
    }

    long getDate() {
        return messageDTO.createdAt;
    }

}
