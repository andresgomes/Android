package br.com.curso.firebaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference firebaseReferencia = FirebaseDatabase
            .getInstance()
            .getReference();
    private DatabaseReference usuarioReferencia = firebaseReferencia.child("usuarios");
    private DatabaseReference produtoReferencia = firebaseReferencia.child("produtos").child("001");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Produto produto = new Produto();
//        produto.setDescricao("Notebook WP40");
//        produto.setCor("Branco");
//        produto.setFabricante("ACER");
//
//        produtoReferencia.child("001").setValue( produto );

        produtoReferencia.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i("FIREBASE", dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
