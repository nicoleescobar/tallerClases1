package com.example.wawandco.zxyshoes;

import android.content.res.Resources;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cantidad;
    private Spinner shoesList;
    private RadioButton radio_man, radio_woman, radio_clasics , radio_sneakers;
    private TextView messageTotal, totalbox;
    private Resources resources;


    private ArrayAdapter<String> adapter;
    private String[] opc;

    boolean isMan = true;
    boolean isWoman = false;

    boolean isSneaker = true;
    boolean isClasic = false;

    double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resources = this.getResources();


        messageTotal = (TextView)findViewById(R.id.messagetotal);
        totalbox = (TextView)findViewById(R.id.totalbox);
        cantidad = (EditText)findViewById(R.id.cantidad);
        shoesList = (Spinner)findViewById(R.id.shoesList);

        radio_man = (RadioButton)findViewById(R.id.radio_man);
        radio_woman = (RadioButton)findViewById(R.id.radio_woman);
        radio_clasics = (RadioButton)findViewById(R.id.radio_clasic);
        radio_sneakers = (RadioButton)findViewById(R.id.radio_sneaker);

        opc = this.getResources().getStringArray(R.array.tipos);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        shoesList.setAdapter(adapter);
    }

    public void showTotal(View v){
        String shoe;
        String strAdidas = resources.getString(R.string.adidas);
        String strNike = resources.getString(R.string.nike);
        String strPuma = resources.getString(R.string.puma);


        shoe = shoesList.getSelectedItem().toString();

        if (isMan){
            if(isSneaker) {
                if(shoe.equals(strAdidas)){
                    total = 140.000;
                }

                if(shoe.equals(strPuma)){
                    total = 130.000;
                }

                if(shoe.equals(strNike)){
                    total = 120.000;
                }
            }

            if(isClasic) {
                if(shoe.equals(strAdidas)){
                    total = 80.000;
                }

                if(shoe.equals(strPuma)){
                    total = 100.000;
                }

                if(shoe.equals(strNike)){
                    total = 50.000;
                }
            }
        }

        if (isWoman){
            if(isSneaker) {
                if(shoe.equals(strAdidas)){
                    total = 130.000;
                }

                if(shoe.equals(strPuma)){
                    total = 100.000;
                }

                if(shoe.equals(strNike)){
                    total = 100.000;
                }
            }

            if(isClasic) {
                if(shoe.equals(strAdidas)){
                    total = 70.000;
                }

                if(shoe.equals(strPuma)){
                    total = 120.000;
                }

                if(shoe.equals(strNike)){
                    total = 60.000;
                }
            }
        }

        total = total *  Integer.parseInt(cantidad.getText().toString());


        messageTotal.setText(resources.getString(R.string.messageTotalCost));
        totalbox.setText((int) total);

    }

    public void cambioGenero(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_man:
                if (checked)
                    isMan = true;
                    isWoman = false;
                break;
            case R.id.radio_woman:
                if (checked)
                    isWoman = true;
                    isMan = false;
                break;
        }
    }

    public void cambioTipo(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_clasic:
                if (checked)
                    isClasic = true;
                    isSneaker = false;
                break;
            case R.id.radio_sneaker:
                if (checked)
                    isSneaker = true;
                    isClasic = false;
                break;
        }
    }
}
