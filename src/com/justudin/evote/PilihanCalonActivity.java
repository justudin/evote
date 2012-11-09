package com.justudin.evote;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.support.v4.app.NavUtils;

public class PilihanCalonActivity extends Activity implements OnClickListener {

	public final static String EXTRA_MESSAGE = "com.justudin.evote.MESSAGE";
	final Context context = this;
	private ImageButton pil1, pil2, pil3;
	private String pesan, txt;
	private int op;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pilihan_calon);

		pil1 = (ImageButton) findViewById(R.id.pil1);
		pil2 = (ImageButton) findViewById(R.id.pil2);
		pil3 = (ImageButton) findViewById(R.id.pil3);

		// add button listener
		pil1.setOnClickListener(this);
		pil2.setOnClickListener(this);
		pil3.setOnClickListener(this);

	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.pil1:
			pesan = "iOS";
			op = 1;
			break;
		case R.id.pil2:
			pesan = "Android";
			op = 2;
			break;

		case R.id.pil3:
			pesan = "Windows 8";
			op = 3;
			break;

		}

		switch (op) {
		case 1:

			break;
		case 2:
			break;

		case 3:

			break;
		}
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

		// set title
		alertDialogBuilder.setTitle("Konfirmasi");

		// set dialog message
		alertDialogBuilder
				.setMessage(
						"Pilihan Anda : " + pesan
								+ " \nApakah Anda YAKIN dengan PILIHAN Anda?")
				.setCancelable(false)

				.setNegativeButton("TIDAK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								// if this button is clicked, just close
								// the dialog box and do nothing
								dialog.cancel();

							}
						})
				.setPositiveButton("YA", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// if this button is clicked, close
						// current activity
						// PilihanCalonActivity.this.finish();
						kirim_pilihan(op);
					}
				});

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_pilihan_calon, menu);
		return true;
	}

	public void kirim_pilihan(int a) {
		txt = String.valueOf(a);
		Intent kir_pil = new Intent(getApplicationContext(),
				HasilPilihanActivity.class);
		kir_pil.putExtra(EXTRA_MESSAGE, a);
		startActivity(kir_pil);

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
