package com.mehadi.hassan.nstusyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class about extends AppCompatActivity {
    TextView b1;
    TextView b2;
    TextView b3;
    TextView b4;
    TextView b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView b1 =(TextView)findViewById(R.id.mehadi);
        b1.setClickable(true);
        b1.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.facebook.com/Mehadinstu'> 1. Mehadi Hassan </a>";
        b1.setText(Html.fromHtml(text));
        TextView b2 =(TextView)findViewById(R.id.mahbub);
        b2.setClickable(true);
        b2.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='https://www.facebook.com/MahbubulAlamNaeem'> 2. Mahbubul Alam Naeem</a>";
        b2.setText(Html.fromHtml(text1));
        TextView b3 =(TextView)findViewById(R.id.ayan);
        b3.setClickable(true);
        b3.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='https://www.facebook.com/ayan.chakraborty2'> 3. Ayan Chakraborty </a>";
        b3.setText(Html.fromHtml(text2));
        TextView b4 =(TextView)findViewById(R.id.nabo);
        b4.setClickable(true);
        b4.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='https://www.facebook.com/nobo.chowdhury.1'> 4. Nobo Chowdhury </a>";
        b4.setText(Html.fromHtml(text3));
        TextView b5 =(TextView)findViewById(R.id.saif);
        b5.setClickable(true);
        b5.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='https://www.facebook.com/quazisaifur'>Saifur Rahman Saif'sir'</a>";
        b5.setText(Html.fromHtml(text4));

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
                Intent newActivity = new Intent(about.this, MainActivity.class);
                startActivity(newActivity);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
}
}
