package me.lvguowei.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;

abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    BaseViewHolder(View itemView) {
        super(itemView);
    }

    abstract void bindItem(MessageItem item);
}
