package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autocomplete = findViewById(R.id.autoCompleteTextView1);
    private static final String[] arr = new String[]{"Menna123@gmail.com", "mentallah187146@fci.bu.edu.eg", ",mennashaaban71@gmail.com", "mmennashaaban@1234", "Pasadena,CA,United States"} ;
    private Button btnLogin;
    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.textView2);
        editText2 = findViewById(R.id.pass1);
        btnLogin = findViewById(R.id.buttn);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arr);

        autocomplete.setThreshold(2);
        autocomplete.setAdapter(adapter);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
