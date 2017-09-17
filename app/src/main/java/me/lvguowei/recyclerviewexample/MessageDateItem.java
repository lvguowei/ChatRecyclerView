package me.lvguowei.recyclerviewexample;

class MessageDateItem extends MessageItem {

    final long createdAt;

    MessageDateItem(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public int getType() {
        return MessageItem.TIME_STAMP;
    }
}
