package com.example.gouree.loginintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activityb extends AppCompatActivity {
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityb);

        display= (TextView)findViewById(R.id.disp);

        //create a bundle  and get the values
        Bundle bundle= new Bundle();

        bundle = getIntent().getExtras();

        //store the recieved value in name
        String name = bundle.getString("nameval");

        //display the value in second activitys text view
        display.setText("welcome "+ name);


    }
}
