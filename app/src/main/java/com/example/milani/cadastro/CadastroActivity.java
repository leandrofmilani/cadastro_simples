package com.example.milani.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {
    private EditText txt_login;
    private EditText txt_senha;
    private Button btn_cadastrar;
    private RadioButton radio_usuario;
    private RadioButton radio_admin;
    private String tipo = "usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        txt_login = (EditText) findViewById(R.id.editTextCadLogin);
        txt_senha = (EditText) findViewById(R.id.editTextCadSenha);
        btn_cadastrar = (Button) findViewById(R.id.buttonCadCadastrar);
        radio_usuario = (RadioButton) findViewById(R.id.radioButtonUsuario);
        radio_admin = (RadioButton) findViewById(R.id.radioButtonAdmin);

        radio_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio_usuario.setChecked(false);
                radio_admin.setChecked(true);
                tipo = "admin";
            }
        });

        radio_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio_admin.setChecked(false);
                radio_usuario.setChecked(true);
                tipo = "usuario";
            }
        });

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login, senha;
                Usuario user = new Usuario();
                login = txt_login.getText().toString();
                senha = txt_senha.getText().toString();

                if ((login.length() > 0) && (senha.length() > 0)){
                    try {
                        user.setLogin(login);
                        user.setSenha(senha);
                        user.setTipo(tipo);
                        //Toast.makeText(getApplicationContext(),"Login: "+user.getLogin()+" Senha: "+user.getSenha()+"tipo: "+user.getTipo(), Toast.LENGTH_SHORT).show();
                        //Muda para tela opcoes
                        Intent telaInicial = new Intent(v.getContext(),MainActivity.class);
                        telaInicial.putExtra("user", user);
                        startActivity(telaInicial);
                        finish();
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"Digite um usuário e senha validos!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cadastro, menu);
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
