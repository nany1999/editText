package com.example.edittext;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText password=findViewById(R.id.email);
        password.requestFocus();
        LinearLayout layout=findViewById(R.id.qq);
        ImageView image=findViewById(R.id.autumn);
       LinearLayout.LayoutParams layoutPar=new LinearLayout.LayoutParams(800,800);
//        layout.addView(image,layoutPar);

    }
}
