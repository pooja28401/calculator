package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    EditText e;
    String value[]=new String[3];
    int i=0;
    Button b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e=(EditText)findViewById(R.id.editText);

        b25=(Button)findViewById(R.id.button25);
        b26=(Button)findViewById(R.id.button26);
        b27=(Button)findViewById(R.id.button27);
        b28=(Button)findViewById(R.id.button28);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
        b18=(Button)findViewById(R.id.button18);
        b19=(Button)findViewById(R.id.button19);
        b20=(Button)findViewById(R.id.button20);
        b21=(Button)findViewById(R.id.button21);
        b22=(Button)findViewById(R.id.button22);
        b23=(Button)findViewById(R.id.button23);
        b24=(Button)findViewById(R.id.button24);
        b30=(Button)findViewById(R.id.button30);


        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="1";
                e.setText("1");
                i++;
            }
        });


        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="2";
                e.setText("2");
                i++;
            }
        });

        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="3";
                e.setText("3");
                i++;
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="4";
                e.setText("4");
                i++;
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="5";
                e.setText("5");
                i++;
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="6";
                e.setText("6");
                i++;
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="7";
                e.setText("7");
                i++;
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="8";
                e.setText("8");
                i++;
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="9";
                e.setText("9");
                i++;
            }
        });

        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="0";
                e.setText("0");
                i++;
            }
        });


        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="+";
                e.setText("+");
                i++;
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="-";
                e.setText("-");
                i++;
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="*";
                e.setText("*");
                i++;
            }
        });


        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="/";
                e.setText("/");
                i++;
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value[i]="%";
                e.setText("%");
                i++;
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText("");

            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e.setText("");
            }
        });
    }
    public void perform(View v){
        if(value[1]=="+"){
            int sum=0;

            int num1=Integer.parseInt(value[0].toString());
            int num2=Integer.parseInt(value[2].toString());
            sum=num1+num2;
            e.setText(String.valueOf(sum));
            i=0;

        }

        if(value[1]=="-"){
            int sub=0;

            int num1=Integer.parseInt(value[0].toString());
            int num2=Integer.parseInt(value[2].toString());
            sub=num1-num2;
            e.setText(String.valueOf(sub));
            i=0;

        }
        if(value[1]=="*"){
            int mul=0;

            int num1=Integer.parseInt(value[0].toString());
            int num2=Integer.parseInt(value[2].toString());
            mul=num1*num2;
            e.setText(String.valueOf(mul));
            i=0;

        }

        if(value[1]=="/"){
            int div=0;
            int num1=Integer.parseInt(value[0].toString());
            int num2=Integer.parseInt(value[2].toString());
            div=num1/num2;
            e.setText(String.valueOf(div));
            i=0;

        }

        if(value[1]=="%"){
            int per=0;
            int p=0;
            int num1=Integer.parseInt(value[0].toString());
            int num2=Integer.parseInt(value[2].toString());
            per=num1/100;
            p=per+num2;
            e.setText(String.valueOf(per));
            i=0;

        }
    }
}
