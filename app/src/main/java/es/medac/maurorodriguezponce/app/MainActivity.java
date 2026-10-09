package es.medac.maurorodriguezponce.app; //

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Texto con parámetros (%1$d y %2$d): 2 pendientes y 1 visto
        TextView resumen = findViewById(R.id.texto_resumen);
        resumen.setText(getString(R.string.resumen_titulos, 2, 1));

        // Abre la segunda pantalla (solo interfaz, sin lógica)
        Button anadir = findViewById(R.id.boton_anadir);
        anadir.setOnClickListener(v ->
                startActivity(new Intent(this, FormularioActivity.class)));
    }
}