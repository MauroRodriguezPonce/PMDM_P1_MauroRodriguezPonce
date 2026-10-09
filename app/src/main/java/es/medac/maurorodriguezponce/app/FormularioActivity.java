package es.medac.maurorodriguezponce.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        // "Cancelar" vuelve a la lista
        findViewById(R.id.boton_cancelar).setOnClickListener(v -> finish());
    }
}
