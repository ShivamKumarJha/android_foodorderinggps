package hh.ff.foodorderingusinggps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class WelcomePopUpMessage extends Activity {
String station;
Bundle bun;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		bun=this.getIntent().getExtras();
		if(bun!=null)
		{
		processStopService(LocationService.TAG);
			station=bun.getString("location");
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(WelcomePopUpMessage.this);
		 
		// set title
		alertDialogBuilder.setTitle("Welcome to "+station);

		// set dialog message
		alertDialogBuilder
			.setMessage("Click OK to See List of Hotels")
			.setCancelable(false)
			.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					Intent start=new Intent(getApplicationContext(), List_Of_Hotel.class);
					Bundle b=new Bundle();
					b.putString("location",station);
					start.putExtras(b);
					startActivity(start);
					finish();
				}
			  });

			// create alert dialog
			AlertDialog alertDialog = alertDialogBuilder.create();

			// show it
			alertDialog.show();
	}
	}
	private void processStopService(final String tag) {
	    Intent intent = new Intent(getApplicationContext(), LocationService.class);
	    intent.addCategory(tag);
	    stopService(intent);
	}	
}
