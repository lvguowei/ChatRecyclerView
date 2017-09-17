package me.lvguowei.recyclerviewexample;

class MessageLeftItem extends BaseMessageItem {

    MessageLeftItem(MessageDTO messageDTO) {
        super(messageDTO);
    }

    @Override
    public int getType() {
        return MessageItem.LEFT;
    }
}
