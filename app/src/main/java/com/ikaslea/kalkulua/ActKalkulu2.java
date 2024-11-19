package com.ikaslea.kalkulua;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActKalkulu2 extends AppCompatActivity {

    EditText sartutakoZenbaki;
    EditText Emaitza;
    Button btnBidertu;
    TextView textViewizen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutkalkulu2);

        sartutakoZenbaki = findViewById(R.id.editTextText2);
        Emaitza = findViewById(R.id.editTextText3);
        btnBidertu = findViewById(R.id.button3);
        textViewizen = findViewById(R.id.textView4);



        String sartutakoizena = getIntent().getStringExtra("IZENA");
        if (sartutakoizena != null) {
            textViewizen.setText("Kaixo, " + sartutakoizena + "!");
        } else {
            Toast.makeText(this, "Errorea: Ez da izenik jaso aurreko aktibitatetik.", Toast.LENGTH_SHORT).show();
        }


        btnBidertu.setOnClickListener(view -> {
            String zenbakia = sartutakoZenbaki.getText().toString().trim();

            if (zenbakia.isEmpty()) {

                Toast.makeText(this, "Mesedez, zenbaki bat sartu.", Toast.LENGTH_SHORT).show();
            } else {
                try {

                    //Zenbaki bihurtu berriro kalkulua egiteko
                    int zenbaki = Integer.parseInt(zenbakia);


                    int emaitza = zenbaki * 2;


                    Emaitza.setText(String.valueOf(emaitza));
                } catch (NumberFormatException e) {

                    Toast.makeText(this, "Zenbaki baliozkoa sartu mesedez.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
