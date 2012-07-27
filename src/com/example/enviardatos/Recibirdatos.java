package com.example.enviardatos;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Recibirdatos extends Activity {
	
	private String [] mensaje;
	private TextView texto1;
	private TextView texto2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibirdatos);
        
        
        
Intent men=getIntent();
        
        mensaje=men.getStringArrayExtra(MainActivity1.MENSAJE);
        
        Log.e("TAG", mensaje[0]);
        Log.e("TAG", mensaje[1]);
        
        texto1 = (TextView) findViewById(R.id.resulusu);
        texto1.setText(mensaje[1]);
        texto2 = (TextView) findViewById(R.id.resulpass);
        texto2.setText(mensaje[0]);
        
    }
    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_recibirdatos, menu);
        return true;
    }
    
public void salir(View view){
    	
    	
    	Intent hi =new Intent(this, MainActivity1.class );
    	startActivity(hi);
    	
    }
}
