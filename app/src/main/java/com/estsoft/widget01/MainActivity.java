package com.estsoft.widget01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         findViewById( R.id.button ).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 EditText et = (EditText)findViewById( R.id.editText );
                 String name = et.getText().toString();

                 TextView tv = (TextView)findViewById( R.id.textView );
                 tv.setText( name );
                 et.setText( "" );
             }
         });

        Spinner spinner = (Spinner)findViewById( R.id.spinner );
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d( "---------->", "onItemSelected" );

                String item = (String) parent.getItemAtPosition( position );
                TextView tv = (TextView)findViewById( R.id.textView );
                tv.setText( item );
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Log.d( "---------->", "onNothingSelected" );
            }
        });


    }
}
