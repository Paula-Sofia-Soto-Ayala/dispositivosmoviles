/// First challenge
// Sprint 1 Create a form like the one in the main activity
// Sprint 2 Create object managers to obtain the values in the form
// validate the form that it only goes to the next activity if privacy settings are OK
// Sprint 3 Send values as extras and display them in the target activity
// Optional, validate the form so that at least one option is checked

package mx.tec.ch_01_2022_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText nombre;
    private EditText apellido;
    private CheckBox checkbox;
    private Switch switcho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombretext);
        apellido = findViewById(R.id.apellidotext);
        checkbox = findViewById(R.id.check1);
        switcho = findViewById(R.id.switch1);
        boton = findViewById(R.id.boton1);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (switcho.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, TargetActivity.class);
                    intent.putExtra("nombre", nombre.getText().toString());
                    intent.putExtra("apellido", apellido.getText().toString());
                    intent.putExtra("checkbox", checkbox.isChecked());
                    startActivity(intent);
                } else {
                    switcho.setTextColor(0xffff0000);
                }
            }
        });

    }
}