package me.lvguowei.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import me.lvguowei.recyclerviewexample.ChatAdapter.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private RecyclerView recyclerView;

    private ChatAdapter adapter;

    private ChatService chatService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new ChatAdapter();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        chatService = new ChatService();

        adapter.setMessages(chatService.getMessages());
        adapter.setListener(this);

    }

    @Override
    public void onItemClicked(int position) {
        MessageItem item = adapter.getItem(position);
        switch (item.getType()) {
            case MessageItem.LEFT:
                MessageLeftItem messageLeftItem = (MessageLeftItem) item;
                Toast.makeText(this, messageLeftItem.getMessage(), Toast.LENGTH_SHORT).show();
                break;
            case MessageItem.RIGHT:
                MessageRightItem messageRightItem = (MessageRightItem) item;
                Toast.makeText(this, messageRightItem.getMessage(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
