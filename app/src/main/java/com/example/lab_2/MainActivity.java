package com.example.lab_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Textnote note1 = new Textnote();
        Textnote note2 = new Textnote();
        User user1 = new User();

        note1.setTitle("abcc");
        note1.setContent("aaa");
        note1.createdDate = "1.1.1999";
        note1.getSummary();

        note2.setTitle("sasda");
        note2.setContent("dsasad");
        note2.createdDate = "14.7.1555";
        note2.getSummary();

        user1.setId("abc123");
        user1.setPassword("123456");
        user1.setUserName("ABC");
        user1.login();
        user1.logout();

        //Event Source
        mButton = findViewById(R.id.button);
        addButton = findViewById(R.id.button2);

        //Event Listener and set listener to Event Source
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("button clicked");
                Intent activity2 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(activity2);
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("button clicked");
                Intent addnote = new Intent(getApplicationContext(), AddNote.class);
                startActivity(addnote);
            }
        });
    }
}