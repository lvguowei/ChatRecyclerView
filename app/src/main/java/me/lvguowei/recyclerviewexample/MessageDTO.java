package me.lvguowei.recyclerviewexample;

class MessageDTO {

    final boolean sentByMe;
    final String message;
    long createdAt;

    MessageDTO(String message, boolean sentByMe, long createdAt) {
        this.message = message;
        this.sentByMe = sentByMe;
        this.createdAt = createdAt;

    }
}
