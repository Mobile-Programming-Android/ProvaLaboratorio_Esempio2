package com.v1nc3nz0.prova2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ContactList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ContactList(this);

        Button button = findViewById(R.id.inserisci);
        button.setOnClickListener((event) -> {
            EditText name = findViewById(R.id.nome);
            EditText surname = findViewById(R.id.cognome);
            EditText phone = findViewById(R.id.telefono);

            Contact con = new Contact();
            con.setName(name.getText().toString());
            con.setSurname(surname.getText().toString());
            con.setPhone(phone.getText().toString());

            list.add(con);

        });

        ListView listview = findViewById(R.id.contactlist);
        listview.setAdapter(list);

    }
}