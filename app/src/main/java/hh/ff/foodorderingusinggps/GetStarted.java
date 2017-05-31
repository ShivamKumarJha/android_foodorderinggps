package hh.ff.foodorderingusinggps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class GetStarted extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(GetStarted.this);
 
			// set title
			alertDialogBuilder.setTitle("Context Aware computing");
 
			// set dialog message
			alertDialogBuilder
				.setMessage("Do You Want to Use this Service ?")
				.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						dialog.cancel();
//processStartService(LocationService.TAG);			
//finish();
					}
				  }).setNeutralButton("About", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							startActivity(new Intent(getApplicationContext(), About.class));

							finish();	
						}
					})
				.setNegativeButton("No",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
						startActivity(new Intent(getApplicationContext(), Home.class));

						finish();
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
	}
	
	private void processStartService(final String tag) {
	    Intent intent = new Intent(getApplicationContext(), LocationService.class);
	    intent.addCategory(tag);
	    startService(intent);
	}
	

}
