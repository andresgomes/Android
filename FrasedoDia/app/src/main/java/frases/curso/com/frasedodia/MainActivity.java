package frases.curso.com.frasedodia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum",
            "A vida é melhor para aqueles que fazem o possível para ter o melhor",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "Para de perseguir o dinheiro e comece a perseguir o sucesso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.txtNovaFrase);
        botaoNovaFrase = (Button) findViewById(R.id.btnNovaFrase);

        botaoNovaFrase.setOnClickListener(new OnClickListener() {
            Random random = new Random();
            int selecao, selecaoAnterior;
            int validacao = -1;

            @Override
            public void onClick(View v) {
                selecao  = random.nextInt(frases.length);

                while (selecao == validacao){
                    selecao = random.nextInt(frases.length);
                }

                textoNovaFrase.setText(frases[selecao]);
                validacao = selecao;
            }
        });
    }
}
