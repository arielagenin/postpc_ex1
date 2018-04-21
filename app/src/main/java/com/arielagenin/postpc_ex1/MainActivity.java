package com.arielagenin.postpc_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{

    EditText messageInput;
    MSGadapter msGadapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageInput = findViewById(R.id.inputText);

        listView = findViewById(R.id.messageList);
        msGadapter = new MSGadapter(this, new ArrayList<Message>());
        listView.setAdapter(msGadapter);
    }

    public void sendMessage(View view)
    {
        String messageText = messageInput.getText().toString();
        if (!messageText.isEmpty()){
            msGadapter.add(new Message(new Date().toString(), messageText, "Ariela"));
            messageInput.setText(null);
        }
    }
}
