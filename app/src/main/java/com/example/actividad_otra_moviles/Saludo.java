package com.example.actividad_otra_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {
    private Button bt_salir;
    private TextView resul;
    private String mensaje="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        bt_salir=(Button) findViewById(R.id.button_salir);

        resul=(TextView) findViewById(R.id.textView_resultado);

        mensaje=getIntent().getStringExtra("VALOR");

        resul.setText("Hola:\n"+mensaje);

        bt_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });




    }
}
