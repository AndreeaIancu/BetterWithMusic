package com.example.android.bwm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView paymentDescTxtView = (TextView) findViewById(R.id.payment_desc_text_view);
        paymentDescTxtView.setMovementMethod(new ScrollingMovementMethod());
    }
}
