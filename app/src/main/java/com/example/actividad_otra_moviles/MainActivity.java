package com.example.actividad_otra_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button bott;
    private EditText nombre;
    private EditText edad;
    private String mensaje,nom;
    private int ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.editText_nombre);
        edad=(EditText) findViewById(R.id.editText_edad);
        bott=(Button) findViewById(R.id.button_aceptar);

        bott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nom=nombre.getText().toString();
                ed=Integer.parseInt(edad.getText().toString());

                mensaje= saludo(ed,nom);

                Intent intento= new Intent(getApplicationContext(),Saludo.class);
                intento.putExtra("VALOR",mensaje);
                startActivity(intento);

            }
        });



    }

    public String saludo(int edad, String nombre){
        String Saludo="saludo señora";
        if(edad<15)
            Saludo="saludo señorita";
        else if(edad>=15&&edad<40)
            Saludo="saludo niña";

        Saludo=Saludo+" "+nombre;
        return Saludo;
    }
}
