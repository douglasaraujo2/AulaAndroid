package douglas.com.pizzariatradicao;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilLogin;
    private TextInputLayout tilSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tilLogin = (TextInputLayout) findViewById(R.id.tilLogin);
        tilSenha = (TextInputLayout) findViewById(R.id.tilSenha);

    }


    public void logar(View view) {
        String login = tilLogin.getEditText().getText().toString();
        String senha = tilSenha.getEditText().getText().toString();
        if (login.toLowerCase().equals("douglas") && senha.toLowerCase().equals("teste")){
            Intent intent = new Intent(this,PedidosActivity.class);
            intent.putExtra("usuario",login);
            startActivity(intent);
            finish();
        }else {
            tilLogin.setError("Login e/ou senha Inválidos");
        }


    }
}
