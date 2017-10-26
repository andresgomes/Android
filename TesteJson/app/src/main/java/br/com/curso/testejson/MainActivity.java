package br.com.curso.testejson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String URL = "https://www.w3schools.com/xml/tempconvert.asmx?op=CelsiusToFahrenheit";
    private TextView tvIsConnected;
    private EditText etName, etContry, etTwitter;
    private Button btnPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvIsConnected = (TextView) findViewById(R.id.tvIsConnected);
        etName = (EditText) findViewById(R.id.etName);
        etContry = (EditText) findViewById(R.id.tvCountry);
        etTwitter = (EditText) findViewById(R.id.etTwitter);
        btnPost = (Button) findViewById(R.id.btnPost);

        btnPost.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}