package me.lvguowei.recyclerviewexample;

import android.view.View;
import android.widget.TextView;

class MessageDateViewHolder extends BaseViewHolder {

    TextView dateTextView;

    MessageDateViewHolder(View itemView) {
        super(itemView);
        dateTextView = itemView.findViewById(R.id.message_date);
    }

    @Override
    void bindItem(MessageItem item) {
        MessageDateItem dateItem = (MessageDateItem) item;

        dateTextView.setText(TimeUtils.convertTime(dateItem.createdAt));
    }
}
