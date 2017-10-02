package com.example.appteste;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*
        TextView tvInicio = new TextView(this);
        tvInicio.setText("Videos aula do Neri");
        setContentView(tvInicio);
        
        TextView tvInicio2 = new TextView(this);
        tvInicio2.setText("Aprendizado de android");
        setContentView(tvInicio2);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        

    }
    
}
