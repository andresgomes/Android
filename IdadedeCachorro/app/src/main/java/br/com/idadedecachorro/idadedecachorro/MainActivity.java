package br.com.idadedecachorro.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idadeEntrada;
    private Button botaoIdade;
    private TextView idadeResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeEntrada = (EditText) findViewById(R.id.txtIdadeEntrada);
        botaoIdade = (Button) findViewById(R.id.btnDescobrirIdade);
        idadeResultado = (TextView) findViewById(R.id.txtIdadeResultado);

        botaoIdade.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = idadeEntrada.getText().toString();

                if (textoDigitado.isEmpty()){
                    idadeResultado.setText("Nenhum numero digitado!");
                }else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    idadeResultado.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + " anos");
                }
            }
        });
    }
}
