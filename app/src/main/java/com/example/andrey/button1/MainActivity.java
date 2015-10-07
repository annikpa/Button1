package com.example.andrey.button1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;
import static com.example.andrey.button1.R.id.button1;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    //Button b;
    int id1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(button1);
        Button b2 = (Button) findViewById(R.id.button2);
        b.setOnClickListener(this);
        b2.setOnClickListener(this);
       /* b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("-----------Click-------------");
                System.out.println(Runtime.getRuntime().freeMemory());

            }
        });*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*@Override*/
    public void onClick(View v) {

       // int id1 = v.getId();
       /* System.out.println("-----------Click-------------");
        System.out.println(Runtime.getRuntime().freeMemory());*/
       /* if (id1 == R.id.button1)System.out.println("---Click1---");

        if (id1 == R.id.button2)System.out.println("---Click2---");*/

        switch (v.getId()){

            case R.id.button1:System.out.println("---Click1---");
                break;
            case R.id.button2:System.out.println("---Click2---");
                break;
        }



    }

}
