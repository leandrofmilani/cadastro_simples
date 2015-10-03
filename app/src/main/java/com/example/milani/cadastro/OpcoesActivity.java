package com.example.milani.cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class OpcoesActivity extends AppCompatActivity {
    protected TextView TextViewLogin;
    protected TextView TextViewSenha;
    protected TextView TextViewTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);

        TextViewLogin = (TextView) findViewById(R.id.textViewVerUser);
        TextViewSenha = (TextView) findViewById(R.id.textViewVerSenha);
        TextViewTipo = (TextView) findViewById(R.id.textViewVerTipo);

        Usuario user;

        Bundle dados = getIntent().getExtras();

        if (dados != null){
            user = (Usuario) dados.getSerializable("user");
            TextViewLogin.setText(user.getLogin());
            TextViewSenha.setText(user.getSenha());
            TextViewTipo.setText(user.getTipo());
        }
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
