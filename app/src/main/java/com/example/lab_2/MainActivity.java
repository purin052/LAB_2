package com.example.lab_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Note note1 = new Note();
        Note note2 = new Note();
        User user1 = new User();

        note1.title = "abcc";
        note1.content = "aaa";
        note1.createdDate = "1.1.1999";
        note1.getSummary();

        note2.title = "sasda";
        note2.content = "dsasad";
        note2.createdDate = "14.7.1555";
        note2.getSummary();

        user1.id = "id";
        user1.password = "password";
        user1.setUserName("ABC");
        user1.login();
        user1.logout();
    }

}