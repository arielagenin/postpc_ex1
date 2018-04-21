package com.arielagenin.postpc_ex1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MSGadapter  extends ArrayAdapter<Message> {

    List<Message> listOfMessages;
    Context context;

    public MSGadapter(@NonNull Context context, @NonNull List<Message> objects) {
        super(context, 0, objects);

        this.listOfMessages = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View singleItem = convertView;
        if (singleItem == null) {
            singleItem = LayoutInflater.from(context).inflate(R.layout.single_message, parent, false);
        }

        Message currentMessage = listOfMessages.get(position);

        TextView tempText = singleItem.findViewById(R.id.messageTime);
        tempText.setText(currentMessage.getTimeOfMessage());

        tempText = singleItem.findViewById(R.id.messageSender);
        tempText.setText(currentMessage.getMessageSender());

        tempText = singleItem.findViewById(R.id.messageInfo);
        tempText.setText(currentMessage.getMessageContent());

        return singleItem;
    }

    @Override
    public void add(@Nullable Message object) {
       listOfMessages.add(object);
       notifyDataSetChanged();
    }
}
