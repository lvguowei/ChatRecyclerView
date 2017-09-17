package me.lvguowei.recyclerviewexample;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class ChatAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<MessageItem> items = new ArrayList<>();

    private OnClickListener listener;

    void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    void setMessages(List<MessageDTO> messages) {
        items.clear();
        if (messages.isEmpty()) return;

        items.add(new MessageDateItem(messages.get(0).createdAt));

        for (int i = 0; i < messages.size(); i++) {
            MessageDTO curr = messages.get(i);
            if (i - 1 > 0) {
                MessageDTO prev = messages.get(i - 1);
                long diff = curr.createdAt - prev.createdAt;
                long diffInHours = TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
                if (diffInHours > 1) {
                    items.add(new MessageDateItem(curr.createdAt));
                }
            }
            if (curr.sentByMe) {
                items.add(new MessageRightItem(curr));
            } else {
                items.add(new MessageLeftItem(curr));
            }
        }
    }

    MessageItem getItem(int postion) {
        return items.get(postion);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case MessageItem.LEFT:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_left, parent, false);
                return new MessageLeftViewHolder(view, listener);
            case MessageItem.RIGHT:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_right, parent, false);
                return new MessageRightViewHolder(view, listener);
            case MessageItem.TIME_STAMP:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_date, parent, false);
                return new MessageDateViewHolder(view);
            default:
                throw new RuntimeException("Unknown type");
        }
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    interface OnClickListener {
        void onItemClicked(int position);
    }

}
