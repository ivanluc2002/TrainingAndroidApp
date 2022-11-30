package com.example.trainingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    private TextView fraseFinale;
    private EditText mioEdit;
    private EditText mioEdit1;
    private EditText mioEdit2;
    private Button mioButton;
    private Button mioButton1;
    private Button mioButton2;
    private Button genera;
    private String string;

    private  String itemname;
     private ArrayList<String> nomi=new ArrayList<String>();
    private ArrayList<String> azioni=new ArrayList<String>();
    private ArrayList<String> modalita=new ArrayList<String>();



    private int i;
    private int o;
    private int p;
    private int k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mioButton = findViewById(R.id.MioButton);
        mioButton1 = findViewById(R.id.MioButton1);
        mioButton2 = findViewById(R.id.MioButton2);
        mioEdit = findViewById(R.id.MioEdit);
        mioEdit1 = findViewById(R.id.MioEdit1);
        mioEdit2= findViewById(R.id.MioEdit2);
        fraseFinale = findViewById(R.id.IdFraseFinita);
        genera=findViewById(R.id.IdGenera);
        string = getString(R.string.stringaProva);
        nomi.add("ivan");
        nomi.add("andre");
        nomi.add("gabri");
        nomi.add("riki");
        azioni.add("guarda");
        azioni.add("mangia");
        azioni.add("picchia");
        azioni.add("bacia");
        modalita.add("con amore");
        modalita.add("con una mazza");
        modalita.add("starnutendo");
        mioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nomi.add(String.valueOf(mioEdit.getText()));



            }
        });
        mioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                azioni.add(String.valueOf(mioEdit1.getText()));

            }
        });
        mioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modalita.add(String.valueOf(mioEdit2.getText()));

            }
        });
        genera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=(int)(Math.random() * nomi.size()) ;
                o=(int)(Math.random() * azioni.size()) ;
                p=(int)(Math.random() * modalita.size()) ;
                k=(int)(Math.random() * modalita.size()) ;
                if(k==i);
                else{
                    fraseFinale.setText(nomi.get(i)+" "+azioni.get(o)+" "+nomi.get(k)+" "+modalita.get(p));

                }
            }
        });


    }
}