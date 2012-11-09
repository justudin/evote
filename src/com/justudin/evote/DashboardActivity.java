package com.justudin.evote;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		tampilMenu();
	}

	private void tampilMenu() {
		TextView sts = (TextView) findViewById(R.id.status);
		Intent dt = getIntent();
		String data = dt.getStringExtra(LoginActivity.EXTRA_MESSAGE);
		String login[] = data.split(",");
		if (login[0].equals("001")) {
			sts.setText("ID : " + login[0] + " || Nama : " + login[1]);
		} else {
			sts.setText("ID : " + login[0] + "  || Nama : " + login[1]);
			Button btn_rekap = (Button) findViewById(R.id.btn_rekap);
			btn_rekap.setVisibility(View.GONE);
		}
	}

	public void buka_pilih(View v) {
		Intent pilih = new Intent(getApplicationContext(),
				PilihanCalonActivity.class);
		startActivity(pilih);

	}

	public void buka_rekap(View v) {
		Intent pilih = new Intent(getApplicationContext(), RekapActivity.class);
		startActivity(pilih);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_dashboard, menu);
		return true;
	}
}
