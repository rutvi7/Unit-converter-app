package com.example.dedsgift.rendom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class activity_activity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity14);

        Spinner fromSpinner, toSpinner;


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.unitsdtr, android.R.layout.simple_spinner_item);
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
        Converter_dtr.Unit fromUnit = Converter_dtr.Unit.fromString(fromString);
        Converter_dtr.Unit toUnit = Converter_dtr.Unit.fromString(toString);

        // Create a converter object and convert!
        Converter_dtr converter = new Converter_dtr(fromUnit, toUnit);
        double result = converter.convert(input);
        toEditText.setText(String.valueOf(result));
    }
}