package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private TextView Result;
    int n1,n2;
void Use()
{
     n1=Integer.parseInt(a.getText().toString());
     n2=Integer.parseInt(b.getText().toString());
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.Number1);
        b=findViewById(R.id.Number2);
        Result=findViewById(R.id.Res);

    }

    public void btnSum(View view) {
        Use();
         int sum=n1+n2;
         Result.setText(String.valueOf(sum));

    }

    public void btnDiff(View view) {
        Use();

        int sum=n1-n2;
        Result.setText(String.valueOf(sum));
    }

    public void btnDiv(View view) {
        Use();

        int sum=n1/n2;
        Result.setText(String.valueOf(sum));
    }

    public void btnMul(View view) {
        Use();

        int sum=n1*n2;
        Result.setText(String.valueOf(sum));
    }
}