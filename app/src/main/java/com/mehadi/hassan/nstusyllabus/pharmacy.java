package com.mehadi.hassan.nstusyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class pharmacy extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);

        this.b1 = ((Button)findViewById(R.id.f1));
        this.b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma11.class);
                startActivity(i);
            }
        });
        this.b2 = ((Button)findViewById(R.id.f2));
        this.b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma12.class);
                startActivity(i);
            }
        });
        this.b3 = ((Button)findViewById(R.id.s1));
        this.b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i= new Intent(pharmacy.this, pharma21.class);
                startActivity(i);
            }
        });
        this.b4 = ((Button)findViewById(R.id.s2));
        this.b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma22.class);
                startActivity(i);
            }
        });
        this.b5 = ((Button)findViewById(R.id.th1));
        this.b5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma31.class);
                startActivity(i);
            }
        });
        this.b6 = ((Button)findViewById(R.id.th2));
        this.b6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma32.class);
                startActivity(i);
            }
        });
        this.b7 = ((Button)findViewById(R.id.fo1));
        this.b7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma41.class);
                startActivity(i);
            }
        });
        this.b8 = ((Button)findViewById(R.id.fo2));
        this.b8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma42.class);
                startActivity(i);
            }
        });
        this.b9 = ((Button)findViewById(R.id.fi1));
        this.b9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma51.class);
                startActivity(i);
            }
        });
        this.b10 = ((Button)findViewById(R.id.fi2));
        this.b10.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                Intent i = new Intent(pharmacy.this, pharma52.class);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.activity_main_actions,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.homeid:
                Intent newActivity = new Intent(pharmacy.this, MainActivity.class);
                startActivity(newActivity);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }



    }
}
