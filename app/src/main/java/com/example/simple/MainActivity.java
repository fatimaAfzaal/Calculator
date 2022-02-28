package com.example.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    TextView t3;
    int n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) this.findViewById(R.id.editTextTextPersonName);
        t2=(EditText) this.findViewById(R.id.editTextTextPersonName2);
        t3=(TextView) this.findViewById(R.id.textView2);
    }

    public void clickS(View view) {
        n1= Integer.parseInt(t1.getText().toString());
        n2= Integer.parseInt(t2.getText().toString());
        n3=n1+n2;
        t3.setText(Integer.toString(n3));
    }

    public void clickSub(View view) {
        n1= Integer.parseInt(t1.getText().toString());
        n2= Integer.parseInt(t2.getText().toString());
        n3=n1-n2;
        t3.setText(Integer.toString(n3));
    }

    public void clickMul(View view) {
        n1= Integer.parseInt(t1.getText().toString());
        n2= Integer.parseInt(t2.getText().toString());
        n3=n1*n2;
        t3.setText(Integer.toString(n3));
    }

    public void clickDiv(View view) {
        float n4,n5,n6;
        n4= Float.parseFloat(t1.getText().toString());
        n5= Float.parseFloat(t2.getText().toString());
        n6=n4/n5;
        t3.setText(Float.toString(n6));
    }
}