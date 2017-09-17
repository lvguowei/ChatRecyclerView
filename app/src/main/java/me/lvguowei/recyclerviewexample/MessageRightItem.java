package me.lvguowei.recyclerviewexample;


class MessageRightItem extends BaseMessageItem {

    MessageRightItem(MessageDTO messageDTO) {
        super(messageDTO);
    }

    @Override
    public int getType() {
        return MessageItem.RIGHT;
    }
}
