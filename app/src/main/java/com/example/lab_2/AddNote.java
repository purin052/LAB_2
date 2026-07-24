package com.example.lab_2;

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

    EditText title,content;
    Button addNote;
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

        title = findViewById(R.id.editTextText);
        content = findViewById(R.id.editTextText2);
        addNote = findViewById(R.id.button4);
        showNote = findViewById(R.id.textView3);


        showNote.setOnClickListener(new View.OnClickListener() {

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
    }
}

