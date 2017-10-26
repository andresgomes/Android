package br.com.testejson.consumirjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String API = "http://localhost:80/phpjson/";

    private TextView txtLogin;
    private Button btnEnviar;
    private TextView txtDados;
    private Retrofit retrofit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDados = (TextView) findViewById(R.id.txtExibir);
        btnEnviar = (Button) findViewById(R.id.btnLogin);
        txtLogin = (TextView) findViewById(R.id.txtLogin);

        retrofit = new  Retrofit.Builder()
                .baseUrl(API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        btnEnviar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                solicitarDados();
            }
        });

        //DadoAPI dadoAPI = retrofit.create(DadoAPI.class);


    }

    private void solicitarDados() {
        String dado = txtLogin.getText().toString();

        DadoAPI service = retrofit.create(DadoAPI.class);

        Call<Dados> call = service.getDados(dado);

        call.enqueue(new Callback<Dados>() {
            @Override
            public void onResponse(Call<Dados> call, Response<Dados> response) {
                if(response.isSuccessful()){
                    Dados dados = response.body();

                    String strDados = "Name:" + dados.getName() + "\n" +
                            "Email: " + dados.getEmail();

                    txtDados.setText(strDados);
                }
            }

            @Override
            public void onFailure(Call<Dados> call, Throwable t) {
                Toast.makeText(MainActivity.this,
                        "Não foi possivel realizar a requisição",
                        Toast.LENGTH_SHORT).show();
            }
        });

//        String cep = txtLogin.getText().toString();
//
//        PostmonService service = retrofit.create(PostmonService.class);
//
//        Call<Endereço> call = service.getEndereco(cep);
//
//        call.enqueue(new Callback<Endereço>() {
//            @Override
//            public void onResponse(Call<Endereço> call, Response<Endereço> response) {
//                if (response.isSuccessful()) {
//                    Endereço endereço = response.body();
//
//                    String strEndereço = "Cidade: " + endereço.getCidade() + "\n" +
//                            "Bairro: " + endereço.getBairro() + "\n" +
//                            "Logradouro: " + endereço.getLogradouro();
//
//                    txtDados.setText(strEndereço);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Endereço> call, Throwable t) {
//                    Toast.makeText(MainActivity.this, "Não foi possível realizar a requisição", Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
