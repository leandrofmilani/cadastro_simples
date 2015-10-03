package com.example.milani.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    private EditText txt_login;
    private EditText txt_senha;
    private Button btn_login;
    private Button btn_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_login = (EditText) findViewById(R.id.editTextLogin);
        txt_senha = (EditText) findViewById(R.id.editTextSenha);
        btn_login = (Button) findViewById(R.id.buttonEntrar);
        btn_cadastrar = (Button) findViewById(R.id.buttonCadastrar);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login, senha;
                login = txt_login.getText().toString();
                senha = txt_senha.getText().toString();

                Usuario user = null;
                Bundle dados = getIntent().getExtras();

                if (dados != null){
                    user = (Usuario) dados.getSerializable("user");
                }

                if (login.equals(user.getLogin()) && senha.equals(user.getSenha())){
                    try{
                        //Joga pra outra activity
                        Intent telaOpcoes = new Intent(v.getContext(), OpcoesActivity.class);
                        startActivity(telaOpcoes);
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"Usuário ou senha inv", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Joga pra outra activity
                Intent telaCadastro = new Intent(v.getContext(), CadastroActivity.class);
                startActivity(telaCadastro);
                finish();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
