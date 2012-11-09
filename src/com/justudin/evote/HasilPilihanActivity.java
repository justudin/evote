package com.justudin.evote;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.support.v4.app.NavUtils;

@SuppressLint("NewApi")
public class HasilPilihanActivity extends Activity {

	private ImageView img;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_pilihan);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        Intent a = getIntent();
        int data = a.getIntExtra(PilihanCalonActivity.EXTRA_MESSAGE, 0);
        img = (ImageView) findViewById(R.id.hsl_pil);
        switch(data)
        {
        case 1:
        	img.setImageResource(R.drawable.ios6);
        	break;
        case 2:
        	img.setImageResource(R.drawable.android);
        	break;
        case 3:
        	img.setImageResource(R.drawable.windows);
        	break;

        }
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hasil_pilihan, menu);
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
