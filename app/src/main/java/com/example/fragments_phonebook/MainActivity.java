package com.example.fragments_phonebook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContactAdapter contactAdapter;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contactList = new ArrayList<>();
        initializeContacts();

        contactAdapter = new ContactAdapter(this, contactList);
        recyclerView.setAdapter(contactAdapter);
    }

    private void initializeContacts() {
        contactList.add(new Contact("أحمد", "123456789", R.drawable.contact1));
        contactList.add(new Contact("محمد", "987654321", R.drawable.contact2));
        contactList.add(new Contact("علي", "111222333", R.drawable.contact3));
        contactList.add(new Contact("يوسف", "444555666", R.drawable.contact4));
        contactList.add(new Contact("خالد", "777888999", R.drawable.contact5));
        contactList.add(new Contact("عمر", "1010101010", R.drawable.contact6));
        contactList.add(new Contact("سامي", "1212121212", R.drawable.contact7));
        contactList.add(new Contact("حسين", "1313131313", R.drawable.contact8));
        contactList.add(new Contact("طارق", "1414141414", R.drawable.contact9));
        contactList.add(new Contact("مصطفى", "1515151515", R.drawable.contact10));
    }
}
