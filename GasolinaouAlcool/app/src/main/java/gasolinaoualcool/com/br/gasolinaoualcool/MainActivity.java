package gasolinaoualcool.com.br.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool, precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.edtAlcool);
        precoGasolina = (EditText) findViewById(R.id.edtiGasolina);
        botaoVerificar = (Button) findViewById(R.id.btnVerificar);
        textoResultado = (TextView) findViewById(R.id.txtResultado);

        botaoVerificar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                Double resultado = valorAlcool / valorGasolina;

                if (resultado >= 0.7){
                    textoResultado.setText("É melhor utilizar gasolina");
                }else {
                    textoResultado.setText("É melhor utilizar Alcool");
                }
            }
        });
    }
}
