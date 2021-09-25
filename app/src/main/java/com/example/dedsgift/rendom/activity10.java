package com.example.dedsgift.rendom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class activity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10);

        Spinner fromSpinner, toSpinner;


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.unitsangle, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromSpinner =(Spinner) findViewById(R.id.SpinnerFrom);
        toSpinner = (Spinner) findViewById(R.id.SpinnerTo);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }



    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText;

        fromSpinner = (Spinner) findViewById(R.id.SpinnerFrom);
        toSpinner = (Spinner) findViewById(R.id.SpinnerTo);
        fromEditText = (EditText) findViewById(R.id.EditTextValue);
        toEditText = (EditText) findViewById(R.id.TextViewResult);

        // Get the string from the Spinners and number from the EditText
        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());

        // Convert the strings to something in our Unit enu,
        Converter_angle.Unit fromUnit = Converter_angle.Unit.fromString(fromString);
        Converter_angle.Unit toUnit = Converter_angle.Unit.fromString(toString);

        // Create a Converter_angle object and convert!
        Converter_angle converter = new Converter_angle(fromUnit, toUnit);
        double result = converter.convert(input);
        toEditText.setText(String.valueOf(result));
    }
}
