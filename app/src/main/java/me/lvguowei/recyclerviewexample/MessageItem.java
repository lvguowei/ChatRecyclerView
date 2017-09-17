package me.lvguowei.recyclerviewexample;

public abstract class MessageItem {

    static final int LEFT = 0;
    static final int RIGHT = 1;
    static final int TIME_STAMP = 2;

    public abstract int getType();

}
