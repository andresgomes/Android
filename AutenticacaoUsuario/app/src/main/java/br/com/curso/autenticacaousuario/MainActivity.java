package br.com.curso.autenticacaousuario;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        //Cadastro

//        firebaseAuth.createUserWithEmailAndPassword("andre.aula@gmail.com", "andre123")
//                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()){
//                            Log.i("createUser", "Sucesso ao cadastrar usuario!!!");
//                        }else {
//                            Log.i("createUser", String.valueOf(task.getException()));
//                        };
//                    }
//                });

        firebaseAuth.signInWithEmailAndPassword("andre.aula@gmail.com", "andre123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("signIn", "Sucesso ao logar usuario!!!");
                        }else {
                            Log.i("signIn", String.valueOf(task.getException()));
                        };
                    }
                });
    }
}
