package com.bmi_nishashahi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate;
    EditText txtHeight, txtWeight, txtBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = findViewById(R.id.btnCalculate);
        txtHeight = findViewById(R.id.txtHeight);
        txtWeight = findViewById(R.id.txtWeight);
        txtBMI = findViewById(R.id.txtBMI);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double height, weight, bmi;
                height = Double.parseDouble(txtHeight.getText().toString());
                weight = Double.parseDouble(txtWeight.getText().toString());

                BMI_NishaShahi bmi_nishaShahi = new BMI_NishaShahi(height, weight);
                bmi = bmi_nishaShahi.calculate();
                txtBMI.setText(Double.toString(bmi));

                Toast.makeText(MainActivity.this, bmi_nishaShahi.Category(), Toast.LENGTH_LONG).show();


            }
        });

    }

    private void showToast(String message) {
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();

        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(btnCalculate.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
    }

}

