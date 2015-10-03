package com.example.milani.cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MaisDadosActivity extends AppCompatActivity {
    private EditText txt_nome;
    private EditText txt_sobrenome;
    private EditText txt_idade;
    private RadioButton radio_feminino;
    private RadioButton radio_masculino;
    private CheckBox gosto_musica;
    private CheckBox gosto_tv;
    private CheckBox gosto_jogos;
    private CheckBox gosto_esportes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mais_dados);

        txt_nome = (EditText) findViewById(R.id.editTextCadNome);
        txt_sobrenome = (EditText) findViewById(R.id.editTextCadSobrenome);
        txt_idade = (EditText) findViewById(R.id.editTextCadIdade);
        radio_feminino = (RadioButton) findViewById(R.id.radioButtonCadFeminino);
        radio_masculino = (RadioButton) findViewById(R.id.radioButtonCadMasculino);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mais_dados, menu);
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
