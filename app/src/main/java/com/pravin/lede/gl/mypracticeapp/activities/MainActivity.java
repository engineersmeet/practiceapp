package com.pravin.lede.gl.mypracticeapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pravin.lede.gl.mypracticeapp.R;
import com.pravin.lede.gl.mypracticeapp.model.Account;
import com.pravin.lede.gl.mypracticeapp.utils.CompoundInterest;
import com.pravin.lede.gl.mypracticeapp.utils.Convertor;

public class MainActivity extends AppCompatActivity {

    EditText editTextAmount;
    EditText editTextYears;
    EditText editTextRateOfInterest;
    EditText editTextCalculatedInterest;

    Button btnSimpleInterest;
    Button btnCompoundInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        setClickListeners();
    }

    private void initializeViews() {
        editTextAmount = findViewById(R.id.editTextAmount);
        editTextYears = findViewById(R.id.editTextYears);
        editTextRateOfInterest = findViewById(R.id.editTextRateOfInterest);
        editTextCalculatedInterest = findViewById(R.id.editTextCalculatedInterest);

        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnCompoundInterest = findViewById(R.id.btnCompoundInterest);
    }

    private void setClickListeners() {
        btnCompoundInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInputs())
                    calculateCompoundInterest();
            }
        });

        btnSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validateInputs())
                    calculateSimpleInterest();
            }
        });
    }

    private boolean validateInputs() {
        if (editTextAmount.length() == 0) {
            editTextAmount.setError("Enter Amount");
            editTextAmount.requestFocus();
            return false;
        } else if (editTextYears.length() == 0) {
            editTextYears.setError("Enter Number of years");
            editTextYears.requestFocus();
            return false;
        }else if (editTextRateOfInterest.length() == 0) {
            editTextRateOfInterest.setError("Enter Rate of interest");
            editTextRateOfInterest.requestFocus();
            return false;
        }
        return true;
    }

    private void calculateSimpleInterest() {
        Account account = getAccountInfo();
        CompoundInterest compoundInterest = new CompoundInterest(account.getRateOfInterest(), account.getYears(), account.getAmount());
        String calculatedSimpleInterest = Convertor.doubleToString(compoundInterest.calculateSimpleInterest());
        setCalculatedInterest(calculatedSimpleInterest);
    }

    private Account getAccountInfo() {
        double rateOfInterest = Convertor.stringToDouble(editTextRateOfInterest.getText().toString());
        double years = Convertor.stringToDouble(editTextYears.getText().toString());
        double amount = Convertor.stringToDouble(editTextAmount.getText().toString());
        return new Account(rateOfInterest, years, amount);
    }

    private void setCalculatedInterest(String calculatedSimpleInterest) {
        editTextCalculatedInterest.setText(calculatedSimpleInterest);
    }

    private void calculateCompoundInterest() {
        Account account = getAccountInfo();
        CompoundInterest compoundInterest = new CompoundInterest(account.getRateOfInterest(), account.getYears(), account.getAmount());
        String calculatedSimpleInterest = Convertor.doubleToString(compoundInterest.calculateCompoundInterest());
        setCalculatedInterest(calculatedSimpleInterest);
    }

}
