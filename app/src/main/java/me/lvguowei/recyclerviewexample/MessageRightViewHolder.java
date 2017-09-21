package me.lvguowei.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import me.lvguowei.recyclerviewexample.ChatAdapter.OnClickListener;

class MessageRightViewHolder extends BaseViewHolder {

    TextView messageTextView;

    OnClickListener listener;

    MessageRightViewHolder(View itemView, final OnClickListener listener) {
        super(itemView);

        messageTextView = itemView.findViewById(R.id.message_text);
        this.listener = listener;

        messageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        listener.onItemClicked(pos);
                    }
                }
            }
        });
    }

    @Override
    void bindItem(MessageItem item) {
        MessageRightItem messageItem = (MessageRightItem) item;
        messageTextView.setText(messageItem.getMessage());
    }
}
