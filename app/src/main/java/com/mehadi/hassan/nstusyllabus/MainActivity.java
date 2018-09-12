package com.mehadi.hassan.nstusyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView b1;
    TextView b2;
    TextView b3;
    TextView b4;
    TextView b5;
    TextView b6;
    TextView b7;
    TextView b8;
    TextView b9;
    TextView b10;
    TextView b11;
    TextView b12;
    TextView b13;
    TextView b14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.b1 = ((TextView)findViewById(R.id.iced));
        this.b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, ice.class);
                startActivity(i);
            }
        });
        this.b2 = ((TextView)findViewById(R.id.csted));
        this.b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, cste.class);
                startActivity(i);
            }
        });
        this.b3 = ((TextView)findViewById(R.id.fimsd));
        this.b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i= new Intent(MainActivity.this, fims.class);
                startActivity(i);
            }
        });
        this.b4 = ((TextView)findViewById(R.id.pharmacyd));
        this.b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, pharmacy.class);
                startActivity(i);
            }
        });
        this.b5 = ((TextView)findViewById(R.id.acced));
        this.b5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, acce.class);
                startActivity(i);
            }
        });
        this.b6 = ((TextView)findViewById(R.id.mbgd));
        this.b6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, mbg.class);
                startActivity(i);
            }
        });
        this.b7 = ((TextView)findViewById(R.id.amathd));
        this.b7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, amath.class);
                startActivity(i);
            }
        });
        this.b8 = ((TextView)findViewById(R.id.englishd));
        this.b8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, english.class);
                startActivity(i);
            }
        });
        this.b9 = ((TextView)findViewById(R.id.ftnsdsd));
        this.b9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i= new Intent(MainActivity.this, ftns.class);
                startActivity(i);
            }
        });
        this.b10 = ((TextView)findViewById(R.id.esdmd));
        this.b10.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, esdm.class);
                startActivity(i);
            }
        });
        this.b11 = ((TextView)findViewById(R.id.bbad));
        this.b11.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, bba.class);
                startActivity(i);
            }
        });
        this.b12 = ((TextView)findViewById(R.id.bged));
        this.b12.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, bge.class);
                startActivity(i);
            }
        });
        this.b13 = ((TextView)findViewById(R.id.ecod));
        this.b13.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, economics.class);
                startActivity(i);
            }
        });
        this.b14 = ((TextView)findViewById(R.id.agrid));
        this.b14.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(MainActivity.this, agricultural.class);
                startActivity(i);
            }
        });







    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.action0,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.about:
                Intent newActivity = new Intent(MainActivity.this, about.class);
                startActivity(newActivity);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }



    }


}
