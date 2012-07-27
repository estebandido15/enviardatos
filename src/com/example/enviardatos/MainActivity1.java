package com.example.enviardatos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity1 extends Activity {

	public final static String MENSAJE = "com.example.clase23dejunio.MENSAJE";
	private EditText pass;
	private EditText usu;

	 

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main_activity1, menu);
		return true;
	}

	public void enviar(View view) {
		String[] arreglomensaje = new String[2];
		Intent hi = new Intent(MainActivity1.this, Recibirdatos.class);
		pass = (EditText) findViewById(R.id.enviopass);
		usu = (EditText) findViewById(R.id.enviousu);

		arreglomensaje[0] = pass.getText().toString();
		arreglomensaje[1] = usu.getText().toString();
		Log.e("LOG", arreglomensaje[0]);
		Log.e("LOG", arreglomensaje[1]);
		hi.putExtra(MENSAJE, arreglomensaje);
		startActivity(hi);
	}
}
