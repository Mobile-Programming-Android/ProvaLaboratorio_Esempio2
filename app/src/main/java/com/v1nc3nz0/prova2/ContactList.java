package com.v1nc3nz0.prova2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ContactList extends ArrayAdapter<Contact>
{

    public ContactList(Context context)
    {
        super(context,R.layout.contactlayout);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contactlayout, parent, false);
        }

        Contact contact = getItem(position);

        convertView.setOnClickListener((event) -> this.remove(contact));

        TextView textn = convertView.findViewById(R.id.contact_name);
        TextView textp = convertView.findViewById(R.id.contact_phone);

        textn.setText(contact.getName() + " " + contact.getSurname());
        textp.setText(contact.getPhone());

        return convertView;
    }
}
