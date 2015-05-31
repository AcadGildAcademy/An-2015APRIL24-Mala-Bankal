package com.example.mala.mytestapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.util.Log.d;


/**
 * Created by Mala on 24-05-2015.
 */
public class ccard extends Activity implements View.OnClickListener {

    EditText card_balance, yearly_interest, min_payment, final_balance, months, interest;
    Button compute, clear;
    private Double principal, rate, minpayment;
    Double monthlyBalance, monthlyfloatInterestPaid, monthlyPrincipal;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        card_balance = (EditText) findViewById(R.id.editCardBalance);
        yearly_interest = (EditText) findViewById(R.id.editCardInterest);
        min_payment = (EditText) findViewById(R.id.editCardMinPayment);
        final_balance = (EditText) findViewById(R.id.editCardFinalBalance);
        months = (EditText) findViewById(R.id.editCardMonths);
        interest = (EditText) findViewById(R.id.editCardInterestPaid);

        compute = (Button) findViewById(R.id.bt_compute);
        clear = (Button) findViewById(R.id.bt_clear);

        compute.setOnClickListener(this);
        clear.setOnClickListener(this);

        principal = Double.parseDouble(card_balance.getText().toString());
        rate = Double.parseDouble(yearly_interest.getText().toString());
        minpayment = Double.parseDouble(min_payment.getText().toString());

        //for (int i=0; i<6; i++) {
            monthlyfloatInterestPaid = (double) Math.round((principal * (rate / (100 * 12))));
            monthlyPrincipal = minpayment - monthlyfloatInterestPaid;
            monthlyBalance = principal - monthlyPrincipal;
        //}
        final_balance.setText(Double.toString(monthlyBalance));

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_compute:
                //final_balance.setText(Double.toString(monthlyBalance));
                d("TAG value", "COMPUTE");
            case R.id.bt_clear:
                d("TAG value", "CLEAR");

        }

    }

}
