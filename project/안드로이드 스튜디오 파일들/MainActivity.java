package com.example.semiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button first_btn;

    // 뷰가 생성되었을때
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 그릴 xml 뷰 파일을 연결 시켜준다. 즉, 설정한다.
        setContentView(R.layout.activity_main);

        first_btn = findViewById(R.id.first_btn);
        first_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                startActivity(intent);  // 액티비티 이동.
            }
        });
    }

}