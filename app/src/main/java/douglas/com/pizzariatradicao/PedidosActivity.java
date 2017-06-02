package douglas.com.pizzariatradicao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class PedidosActivity extends AppCompatActivity {
    private TextView tvUsuario ;
    private CheckBox cbAtum ;
    private CheckBox cbBacon ;
    private CheckBox cbCalabresa ;
    private CheckBox cbMussarela ;
    private RadioGroup rgTamanhoPizza ;
    private Spinner spPagamentos ;
    private CheckBox cbBordaRecheada ;
    private CheckBox cbRecheioExtra ;
    private CheckBox cbRefrigerante ;
    private CheckBox cbSobremesa ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
        tvUsuario = (TextView) findViewById(R.id.tvUsuario);
        cbAtum = (CheckBox) findViewById(R.id.cbAtum);
        cbBacon = (CheckBox) findViewById(R.id.cbBacon);
        cbCalabresa = (CheckBox) findViewById(R.id.cbCalabresa) ;
        cbMussarela = (CheckBox) findViewById(R.id.cbMussarela) ;
        rgTamanhoPizza = (RadioGroup) findViewById(R.id.rgTamanhoPizza) ;
        spPagamentos = (Spinner) findViewById(R.id.spPagamentos) ;
        cbBordaRecheada = (CheckBox) findViewById(R.id.cbBordaRecheada) ;
    }
}
