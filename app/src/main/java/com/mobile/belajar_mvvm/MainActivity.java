package com.mobile.belajar_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mobile.belajar_mvvm.utils.view;
import com.mobile.belajar_mvvm.view.Keliling_act;
import com.mobile.belajar_mvvm.view.Luas_act;
import com.mobile.belajar_mvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.buttonLuas);
        button2 = findViewById(R.id.buttonkeliling);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Luas_act.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Keliling_act.class);
                startActivity(intent);
            }
        });

    }
}
