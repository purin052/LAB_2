package com.example.lab_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;
import java.util.jar.Attributes;

public class AddNote extends AppCompatActivity {

    EditText title,content,NameUser;
    Button addNote, backButton;
    TextView showNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        NameUser = findViewById(R.id.editTextText3);
        title = findViewById(R.id.editTextText);
        content = findViewById(R.id.editTextText2);
        addNote = findViewById(R.id.button4);
        showNote = findViewById(R.id.textView3);
        backButton = findViewById(R.id.button5);

        addNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strOfName = NameUser.getText().toString();
                String strOfTitle = title.getText().toString();
                String strOfContent = content.getText().toString();
                String strOfDate = new Date().toString();

                Textnote tNote = new Textnote();
                
                User user = new User();
                user.setUserName(strOfName);
                tNote.setUser(user);
                
                tNote.setTitle(strOfTitle);
                tNote.setDate(strOfDate);
                tNote.setContent(strOfContent);

                showNote.setText(tNote.getSummary());
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

