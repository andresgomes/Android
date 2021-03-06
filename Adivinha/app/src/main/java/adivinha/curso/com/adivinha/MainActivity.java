package adivinha.curso.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.btnJogar);
        textoResultado = (TextView) findViewById(R.id.txtResultado);

        botaoJogar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numAleatorio = random.nextInt(10);
                textoResultado.setText("Numero escolhido: " + numAleatorio);
            }
        });
    }
}
