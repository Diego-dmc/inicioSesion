package com.UST.iniciodesesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario =(EditText)findViewById(R.id.name);
        password =(EditText)findViewById(R.id.password);
    }

    public void enviarDatos(View view){

            String valor = usuario.getText().toString();
            String valor1 = password.getText().toString();
        if (valor.equals("juan") && valor1.equals("1234")) {
            Bundle variables = new Bundle();
            variables.putString("valorKey", valor);
            Intent actividad2 = new Intent(this, MainActivity2.class);
            actividad2.putExtras(variables);
            startActivity(actividad2);
        }
        else{
            Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectos",Toast.LENGTH_LONG).show();

        }

    }

}