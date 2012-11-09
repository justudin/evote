package com.justudin.evote;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.justudin.evote.MESSAGE";

	public static LibEvote pil1 = new LibEvote(1, 0);
	public static LibEvote pil2 = new LibEvote(2, 0);
	public static LibEvote pil3 = new LibEvote(3, 0);
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	public void login(View v) {
		String ids, namas, data;
		EditText id, nama;
		id = (EditText) findViewById(R.id.txt_id);
		nama = (EditText) findViewById(R.id.txt_nama);
		ids = id.getText().toString();
		namas = nama.getText().toString();
		data = ids+","+namas;
		Intent log = new Intent(getApplicationContext(), DashboardActivity.class);
		log.putExtra(EXTRA_MESSAGE, data);
		startActivity(log);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}
}
