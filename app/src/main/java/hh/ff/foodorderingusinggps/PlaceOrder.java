package hh.ff.foodorderingusinggps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class PlaceOrder extends Activity  {
TextView tv;
Button cfood;
int totalamount;
static SQLiteDatabase db;
EditText name,mobile,email,coach,pnr,seat,tname,pod;
Bundle bun;
String foodselected;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.placeorder);
cfood=(Button)findViewById(R.id.placedorder);
bun=this.getIntent().getExtras();
name=(EditText)findViewById(R.id.name);
mobile=(EditText)findViewById(R.id.mobilenumber);
email=(EditText)findViewById(R.id.emailid);
coach=(EditText)findViewById(R.id.coach);
pnr=(EditText)findViewById(R.id.pnrno);
seat=(EditText)findViewById(R.id.seat);
tname=(EditText)findViewById(R.id.trainname);
pod=(EditText)findViewById(R.id.orderplace);
if(bun!=null)
{
	
	foodselected=bun.getString("foodselected");
	totalamount=bun.getInt("total");
	
	cfood.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			StorageHelper sh=new StorageHelper(PlaceOrder.this);
			db=sh.getWritableDatabase();
			ContentValues cv=new ContentValues();
			if(!TextUtils.isEmpty(pnr.getText().toString())&&!TextUtils.isEmpty(pod.getText().toString())&&!TextUtils.isEmpty(mobile.getText().toString())&&!TextUtils.isEmpty(name.getText().toString())&&!TextUtils.isEmpty(coach.getText().toString())&&!TextUtils.isEmpty(seat.getText().toString())&&!TextUtils.isEmpty(tname.getText().toString())&&!TextUtils.isEmpty(email.getText().toString()))
			{
				cv.put("pnr",Integer.parseInt(pnr.getText().toString()));
			cv.put("passenger_name",name.getText().toString());
			cv.put("trainname",tname.getText().toString());
			cv.put("email",email.getText().toString());
			cv.put("mobile",mobile.getText().toString());
			cv.put("menuordered",foodselected);
			cv.put("ordercost",totalamount);
			cv.put("coach",coach.getText().toString());
			cv.put("seat", seat.getText().toString());
			cv.put("placeofdelivery",pod.getText().toString());
			
			 try {
				   sendSmsMessage("9346850551", "Mobile : "+mobile.getText().toString()+"\nPlace :"+pod.getText().toString()+"\nName :"+name.getText().toString()+"\n Train name: "+tname.getText().toString()
						+"\nCoach number :"+coach.getText().toString()+"\nSeat Number :"+seat.getText().toString()+"\nMenu :"+foodselected+""+"Total Amount is Rs"+totalamount);
				  } catch (Exception e) {
				   e.printStackTrace();
		  }
			Toast.makeText(getApplicationContext(),"your order is placed sucessfully",Toast.LENGTH_SHORT).show();
			db.insert("FoodData",null,cv);
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PlaceOrder.this);

			// set title
			alertDialogBuilder.setTitle("Please Select Task");

			// set dialog message
			alertDialogBuilder
				.setMessage("Click On the Task which you Want")
				.setCancelable(false)
				.setPositiveButton("Context Aware Computing",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
			processStartService(LocationService.TAG);			
			if (getIntent().getBooleanExtra("EXIT", false)) {
			    finish();
			}
					}
				  })
				.setNegativeButton("Share Application",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
						//create the send intent
						Intent shareIntent = 
						 new Intent(Intent.ACTION_SEND);

						//set the type
						shareIntent.setType("text/plain");

						//add a subject
						shareIntent.putExtra(Intent.EXTRA_SUBJECT,
						 "Food Ordering System");

						//build the body of the message to be shared
						String shareMessage = "Here is Food Ordering Application";

						//add the message
						shareIntent.putExtra(Intent.EXTRA_TEXT,
						 shareMessage);

						//start the chooser for sharing
						startActivity(Intent.createChooser(shareIntent, 
						 "Food Ordering System"));
						finish();
					}
				});

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
			}
			else
			{
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PlaceOrder.this);
				 
				// set title
				alertDialogBuilder.setTitle("Error");
	 
				// set dialog message
				alertDialogBuilder
					.setMessage("Please Fill All the Details !!!")
					.setCancelable(false)
					.setPositiveButton("OK",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, close
							// current activity
	dialog.dismiss();
						}
					  });
	 
					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();
	 
					// show it
					alertDialog.show();
			}
		}

		 private void sendSmsMessage(String address, String message)
				   throws Exception {
				  SmsManager smsMgr = SmsManager.getDefault();
				  smsMgr.sendTextMessage(address, null, message, null, null);
				 }
	});
}
}


private void processStartService(final String tag) {
    Intent intent = new Intent(getApplicationContext(), LocationService.class);
    intent.addCategory(tag);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
  intent.putExtra("EXIT",true);
    startService(intent);
}

}
