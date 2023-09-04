package com.UST.iniciodesesion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView datos = (TextView) findViewById(R.id.usuario);

        Bundle datosRecibidos = getIntent().getExtras();
        String datoRecibido = datosRecibidos.getString("valorKey");
        datos.setText(datoRecibido);

        Toast.makeText(getApplicationContext(),"El usuario a ingresado al sistema",Toast.LENGTH_LONG).show();
    }
}