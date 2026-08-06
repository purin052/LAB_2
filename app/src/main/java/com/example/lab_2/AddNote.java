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

public class AddNote extends AppCompatActivity {

    TextView showNote;

    EditText Name,title, content;
    Button addNote, backButton;

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

        Name = findViewById(R.id.editTextText2);
        title = findViewById(R.id.editTextText);
        content = findViewById(R.id.editTextText3);
        addNote = findViewById(R.id.button5);
        showNote = findViewById(R.id.textView);
        backButton = findViewById(R.id.button4);

        addNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strOfTitle = title.getText().toString();
                String strOfContent = content.getText().toString();
                String strOfDate = new Date().toString();

                Textnote tNote = new Textnote();
                tNote.setTitle(strOfTitle);
                tNote.setDate(strOfDate);
                tNote.setContent(strOfContent);

                showNote.setText(tNote.getSummary());
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("button clicked");
                Intent activity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activity);
            }
        });
    }
}

