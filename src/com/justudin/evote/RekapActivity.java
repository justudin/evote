package com.justudin.evote;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class RekapActivity extends Activity {

	TextView jml1,jml2,jml3;
	@SuppressLint("NewApi")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekap);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
        jml1 = (TextView) findViewById(R.id.jml1);
        jml2 = (TextView) findViewById(R.id.jml2);
        jml3 = (TextView) findViewById(R.id.jml3);
        
    
        jml1.setText("0");
        jml2.setText("0");
        jml3.setText("0");
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_rekap, menu);
        return true;
    }

    public void back_utama(View v)
    {
    	Intent back_u = new Intent(this, LoginActivity.class);
    	startActivity(back_u);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
