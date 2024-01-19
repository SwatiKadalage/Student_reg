package com.example.student_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton computer=(RadioButton) findViewById(R.id.rdbtn1);
        RadioButton mechanical=(RadioButton) findViewById(R.id.rdbtn2);
        RadioButton civil=(RadioButton) findViewById(R.id.rdbtn3);
        RadioButton electrical=(RadioButton) findViewById(R.id.rdbtn4);
        Button button=(Button) findViewById(R.id.btn);
        EditText text1=(EditText) findViewById(R.id.edit1);
        EditText text2=(EditText) findViewById(R.id.edit2);
        EditText text3=(EditText) findViewById(R.id.edit3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res="Selected branch:";
                        res+=(computer.isChecked())?"Computer":(mechanical.isChecked())?"Mechanical":(civil.isChecked())?"Civil":(electrical.isChecked())?"Electrical":"";
                if(text1.getText().toString().isEmpty()||text2.getText().toString().isEmpty()||text3.getText().toString().isEmpty())

                    Toast.makeText(getApplicationContext(),"Please Fill all the blocks",Toast.LENGTH_LONG).show();
                else
                {

                        Toast.makeText(getApplicationContext(),"Name:"+text1.getText().toString()+"\n"+"Age:"+text2.getText().toString()+"\n"+"Mobile no:"+text3.getText().toString()+"\n"+res,Toast.LENGTH_LONG).show();

                }

            }

        });

    }
}