package com.example.gouree.loginintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // two text views for name and password
    TextView name;
    TextView pwd;

    //submit button
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit= (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=(TextView)findViewById(R.id.name);
                pwd=(TextView)findViewById(R.id.password);

                //store name and password entered into nam and pw
                String nam = name.getText().toString();
                String pw = pwd.getText().toString();

                //check whether the name and password are correct
                if(nam.equals("vibhashree")&& pw.equals("honda123"))
                {

                    //create intent
                    Intent intent = new Intent(MainActivity.this,activityb.class);

                    //create a bundle to pass values
                    Bundle bundle= new Bundle();

                    //putstring with key and value
                    bundle.putString("nameval",nam);

                    intent.putExtras(bundle);

                    startActivity(intent);
                }

                //toast a message if any of the field is empty
                else if (nam.equals("")|| pw.equals(""))
                    Toast.makeText(getBaseContext(),"Enter both user name and password",Toast.LENGTH_SHORT ).show();

                //toast a message if the name or password is incorrect
                else

                    Toast.makeText(getBaseContext(),"Incorrect User name or password",Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
