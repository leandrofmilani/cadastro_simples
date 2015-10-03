package com.example.milani.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OpcoesActivity extends AppCompatActivity {

    private Button btn_maisDados;
    private Button btn_verDados;
    private Button btn_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);


        btn_maisDados = (Button) findViewById(R.id.buttonMaisDados);
        btn_verDados = (Button) findViewById(R.id.buttonVerDados);
        btn_sair = (Button) findViewById(R.id.buttonTelaOpSair);



        btn_maisDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Joga pra outra activity
                Intent telaMaisDados = new Intent(v.getContext(), MaisDadosActivity.class);
                startActivity(telaMaisDados);
            }
        });

        btn_verDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Joga pra outra activity
                Intent telaVerDados = new Intent(v.getContext(), VerDadosActivity.class);
                startActivity(telaVerDados);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opcoes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}