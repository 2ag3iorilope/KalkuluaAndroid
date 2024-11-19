package com.ikaslea.kalkulua;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActiKalkulu1 extends AppCompatActivity {

    Button btnKalkulatu;
    Button btnIrten;
    EditText txtTestua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutkalkulu1);

        btnKalkulatu = findViewById(R.id.button);
        btnIrten = findViewById(R.id.button2);
        txtTestua = findViewById(R.id.editTextText);

        btnKalkulatu.setOnClickListener(view -> {
            String testua = txtTestua.getText().toString().trim();

            if (testua.isEmpty()) {

                Toast.makeText(this, "Tekleatu zure izena derrigorrezkoa da.", Toast.LENGTH_SHORT).show();
            } else {

                Intent intent = new Intent(this, ActKalkulu2.class);
                intent.putExtra("IZENA", testua);
                startActivity(intent);
            }
        });

    }
}