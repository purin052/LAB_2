package com.example.lab_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BrowseNoteActivity extends AppCompatActivity {
    Button BrowseNoteButton;
    Button SearchButton;
    ProgressBar progressBar;

    TextView TextNotfound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_browse_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BrowseNoteButton = findViewById(R.id.button8);
        progressBar = findViewById(R.id.progressBar3);
        SearchButton = findViewById(R.id.button6);
        TextNotfound = findViewById(R.id.textView4);

        if (progressBar != null) {
            progressBar.setVisibility(View.GONE);
        }
        if (TextNotfound != null) {
            TextNotfound.setVisibility(View.GONE);
        }


        if (BrowseNoteButton != null) {
            BrowseNoteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("button clicked");
                    Intent browse = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(browse);
                }
            });
        }

        if (SearchButton != null) {
            SearchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // 1. ซ่อนข้อความเก่าก่อนเริ่มค้นหาใหม่
                    if (TextNotfound != null) {
                        TextNotfound.setVisibility(View.GONE);
                    }

                    // 2. แสดง ProgressBar และปิดปุ่มกดชั่วคราว
                    if (progressBar != null) {
                        progressBar.setVisibility(View.VISIBLE);
                    }
                    SearchButton.setEnabled(false);

                    new Thread(() -> {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        runOnUiThread(() -> {
                            // 3. ซ่อน ProgressBar เมื่อโหลดเสร็จ
                            if (progressBar != null) {
                                progressBar.setVisibility(View.GONE);
                            }

                            // 4. เปลี่ยนเป็น View.VISIBLE เพื่อแสดงข้อความ "ไม่พบข้อมูล"
                            if (TextNotfound != null) {
                                TextNotfound.setVisibility(View.VISIBLE);
                            }

                            SearchButton.setEnabled(true);
                        });
                    }).start();
                }
            });
        }
    }
}
