package sg.edu.rp.c346.id20006949.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogroupGender;
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        radiogroupGender=findViewById(R.id.radioGroupGender);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
                int checkedRadioId = radiogroupGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    tvDisplay.setText("He says " + stringResponse);
                } else {
                    tvDisplay.setText("She says " + stringResponse);
                }


                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                } else {

                    etInput.setEnabled(false);
                }

            }
        });
    }
}