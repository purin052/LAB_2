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

        Textnote note1 = new Textnote();
        Textnote note2 = new Textnote();
        User user1 = new User();

        note1.setTitle("abcc");
        note1.setContent("aaa");
        note1.createdDate = "1.1.1999";
        note1.getSummary();

        note2.setTitle("sasda");
        note2.setContent ("dsasad");
        note2.createdDate = "14.7.1555";
        note2.getSummary();

        user1.Id = "Id";
        user1.Password = "Password";
        user1.setUserName("ABC");
        user1.login();
        user1.logout();
    }

}