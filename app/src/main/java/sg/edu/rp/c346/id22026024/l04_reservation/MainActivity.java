package sg.edu.rp.c346.id22026024.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView textDisplayName;
    EditText textInputName;
    TextView textDisplayTelephone;
    EditText textInputTelephone;
    CheckBox smokeCheck;
    DatePicker dp;
    TimePicker tp;
    Button buttonSubmit;
    Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textDisplayName = findViewById(R.id.textViewName);
        textInputName = findViewById(R.id.editTextName);
        textDisplayTelephone = findViewById(R.id.textViewTelephone);
        textInputTelephone = findViewById(R.id.editTextTelephone);
        smokeCheck = findViewById(R.id.checkBox);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        buttonSubmit = findViewById(R.id.buttonReserve);
        buttonReset = findViewById(R.id.buttonReset);


    }
}