package hh.ff.foodorderingusinggps;

import java.io.ByteArrayOutputStream;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Home extends Activity 
{
	static SQLiteDatabase db=null;
      EditText trainnameorno,from,to,pnr;
	 Button submit;
	 byte[] img=null;
	 Bitmap b;
	 ByteArrayOutputStream bos;
	 ContentValues cv;
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.home);
	trainnameorno=(EditText)findViewById(R.id.editText1);
	to=(EditText)findViewById(R.id.editText3);
	from=(EditText)findViewById(R.id.editText2);
	pnr=(EditText)findViewById(R.id.editText5);
submit=(Button)findViewById(R.id.button1);
	submit.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			if(!TextUtils.isEmpty(from.getText().toString())&&!TextUtils.isEmpty(to.getText().toString())||!TextUtils.isEmpty(pnr.getText().toString()))
			{
			Intent senddatafromto=new Intent(getApplicationContext(), List_Of_Trains.class);
			Bundle putfromto=new Bundle();
			putfromto.putString("from",from.getText().toString());
			putfromto.putString("to",to.getText().toString());
     		putfromto.putString("pnr",pnr.getText().toString());
			senddatafromto.putExtras(putfromto);
            startActivity(senddatafromto);		
			finish();
			}
			else if(TextUtils.isEmpty(from.getText().toString()))
			{
				customalert("Source Station cannot be Empty");
			}
			else if(TextUtils.isEmpty(to.getText().toString()))
			{
				customalert("Destination Station cannot be Empty");
			}
			else if(TextUtils.isEmpty(pnr.getText().toString()))
			{
				customalert("PNR Must be entered");
			}
			
			else
			{
				customalert("No Field must be empty");
			}
		}
			
	});
	StorageHelper sh=new StorageHelper(getApplicationContext());
	db=sh.getWritableDatabase();
	String[] cols=new String[]{"pnr"};
	Cursor ctrain=db.query("traindata",cols, null,null,null,null,null);
	if(ctrain.getCount()==0)
	{
	

		cv=new ContentValues();
		cv.put("pnr",12702);
		cv.put("name","Hussain sagar Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",17221);
		cv.put("name","COALTT Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",17204);
		cv.put("name","CCTBVC Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",17018);
		cv.put("name","RAJKOT Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",19201);
		cv.put("name","SCPBR Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",22882);
		cv.put("name","BBS PUNE Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",11020);
		cv.put("name","KONARK Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);



	cv=new ContentValues();
		cv.put("pnr",17032);
		cv.put("name","MUMBAI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",17014);
		cv.put("name","HYB PUNE Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Pune");
		
		db.insert("traindata",null,cv);


	//from HYDERABAD to VISAKHAPATNAM

	cv=new ContentValues();
		cv.put("pnr",22204);
		cv.put("name","DURONTO Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12740);
		cv.put("name","GARIB RATH Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12704);
		cv.put("name","FALAKNUMA Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",22850);
		cv.put("name","SC SHM WKLY Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
		
		


	cv=new ContentValues();
		cv.put("pnr",12728);
		cv.put("name","GODAVARI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
		
		
	cv=new ContentValues();
		cv.put("pnr",12806);
		cv.put("name","JANMABHOOMI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
		
		
	cv=new ContentValues();
		cv.put("pnr",18310);
		cv.put("name","NAGAWALI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
		
		
	cv=new ContentValues();
		cv.put("pnr",11019);
		cv.put("name","KONARK Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
		
	cv=new ContentValues();
		cv.put("pnr",18646);
		cv.put("name","EAST COAST Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",17016);
		cv.put("name","VISHAKA Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
		


	cv=new ContentValues();
		cv.put("pnr",8402);
		cv.put("name","SC VSKP SPL");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
		
	cv=new ContentValues();
		cv.put("pnr",8504);
		cv.put("name","LTT VSKP Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",22881);
		cv.put("name","PUNE BBS Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",18504);
		cv.put("name","SNSI VSKP Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",18510);
		cv.put("name","NED VSKP Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","VISHAKAPATNAM");
		
		db.insert("traindata",null,cv);

	//Hyderabad to Delhi
	cv=new ContentValues();
		cv.put("pnr",12722);
		cv.put("name","DAKSHIN Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Delhi");
		
		db.insert("traindata",null,cv);

		




	cv=new ContentValues();
		cv.put("pnr",12724);
		cv.put("name","AP Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Delhi");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",12648);
		cv.put("name","KONGU Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Delhi");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",22694);
		cv.put("name","BANGLORE RAJDHNI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Delhi");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",12650);
		cv.put("name","KTK SMPRK Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Delhi");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",12286);
		cv.put("name","NZM DURONTO Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Delhi");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12438);
		cv.put("name","NZM RJDHNI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Delhi");
		
		db.insert("traindata",null,cv);

	//Hyderabad to Tirupathi

	cv=new ContentValues();
		cv.put("pnr",17406);
		cv.put("name","KRISHNA Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Tirupati");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12730);
		cv.put("name","SABARI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Tirupati");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",17429);
		cv.put("name","RAYALASEEMA Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Tirupati");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",12770);
		cv.put("name","SEVEN HILLS SF Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Tirupati");
		
		db.insert("traindata",null,cv);

	cv=new ContentValues();
		cv.put("pnr",12734);
		cv.put("name","NARAYANADRI SF Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Tirupati");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12764);
		cv.put("name","PADMAVATHI SF Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Tirupati");
		
		db.insert("traindata",null,cv);


	cv=new ContentValues();
		cv.put("pnr",12797);
		cv.put("name","VENKATADRI SF Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Tirupati");
		
		db.insert("traindata",null,cv);


	//HYD TO CHENNAI

	cv=new ContentValues();
		cv.put("pnr",12604);
		cv.put("name","CHENNAI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Chennai");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12760);
		cv.put("name","CHARMINAR Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Chennai");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12776);
		cv.put("name","COCANADA Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Chennai");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",12734);
		cv.put("name","NARAYANADRI Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Chennai");
		
		db.insert("traindata",null,cv);
	cv=new ContentValues();
		cv.put("pnr",16004);
		cv.put("name","NSL MAS WKLY Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Chennai");
		
		db.insert("traindata",null,cv);




	cv=new ContentValues();
		cv.put("pnr",12622);
		cv.put("name","TAMIL NADU Express");
		cv.put("fromplace","Hyderabad");
		cv.put("toplace","Chennai");
		
		db.insert("traindata",null,cv);

		


		
		
		
		
		
		
		
		
		
		


	
	}
	ctrain.close();
	String[] colshotel=new String[]{"sno"};
	Cursor chotel=db.query("hoteldata",colshotel, null,null,null,null,null);
	//sno integer,hotel_name text,location text,minimalorder text
	if(chotel.getCount()==0)
	{
	cv=new ContentValues();
		cv.put("sno",1);
		cv.put("hotel_name","Generation X");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);

	cv.put("sno",2);
		cv.put("hotel_name","GreenLand");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",3);
		cv.put("hotel_name","Aditya");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",4);
		cv.put("hotel_name","Amogh");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",5);
		cv.put("hotel_name","Anmol Continental");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",6);
		cv.put("hotel_name","Avasa Hotel");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",7);
		cv.put("hotel_name","Asoka Klaasic");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",8);
		cv.put("hotel_name","Alpine");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",9);
		cv.put("hotel_name","KFC");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",10);
		cv.put("hotel_name","Nakshatra Inn");
		cv.put("location","Hyderabad");
		cv.put("minimalorder","No minimum");

		db.insert("hoteldata",null,cv);


	cv.put("sno",11);
		cv.put("hotel_name","7 Hills Inn");
		cv.put("location","Tirupati");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",12);
		cv.put("hotel_name","Annapurna");
		cv.put("location","Tirupati");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",13);
		cv.put("hotel_name","Bhimas");
		cv.put("location","Tirupati");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",14);
		cv.put("hotel_name","Candy PLR");
		cv.put("location","Tirupati");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",15);
		cv.put("hotel_name","Fortune Kences");
		cv.put("location","Tirupati");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",16);
		cv.put("hotel_name","Grand World");
		cv.put("location","Tirupathi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",17);
		cv.put("hotel_name","Hotel Bliss");
		cv.put("location","Tirupati");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",18);
		cv.put("hotel_name","Hotel Andhra Spice");
		cv.put("location","Tirupati");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);


	cv.put("sno",19);
		cv.put("hotel_name","Quality Inn");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",20);
		cv.put("hotel_name","Hotel Royalty");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",21);
		cv.put("hotel_name","The Swan Inn");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);


	cv.put("sno",22);
		cv.put("hotel_name","Smart Inn");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);


	cv.put("sno",23);
		cv.put("hotel_name","Hotal Radiant");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);






	cv.put("sno",24);
		cv.put("hotel_name","Hotel Chhatrapati");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",25);
		cv.put("hotel_name","Deccan Rendezvous");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",26);
		cv.put("hotel_name","Hotel Moneta");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",27);
		cv.put("hotel_name","Hotel Pichola");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",28);
		cv.put("hotel_name","Ramee Grand");
		cv.put("location","Pune");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);



	cv.put("sno",29);
		cv.put("hotel_name","Bless Inn");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",30);
		cv.put("hotel_name","Hotel Prince");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",31);
		cv.put("hotel_name","Manvi Hotel");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",32);
		cv.put("hotel_name","Jukoso Inn");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",33);
		cv.put("hotel_name","Hotel Hi Life");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",34);
		cv.put("hotel_name","Anmol Hotel");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",35);
		cv.put("hotel_name","Amax Inn");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",36);
		cv.put("hotel_name","Hotel Flora");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",37);
		cv.put("hotel_name","The Claridges");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",38);
		cv.put("hotel_name","Eros Hotel");
		cv.put("location","Delhi");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",39);
		cv.put("hotel_name","6 Degrees");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");
	 	db.insert("hoteldata",null,cv);

	cv.put("sno",40);
		cv.put("hotel_name","11 Echoes");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",41);
		cv.put("hotel_name","Alfredo");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	
	cv.put("sno",42);
		cv.put("hotel_name","Alps");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",43);
		cv.put("hotel_name","Aryans");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",44);
		cv.put("hotel_name","Asia Wok");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",45);
		cv.put("hotel_name","Baluchi");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",46);
		cv.put("hotel_name","Bamboo Shoot");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);


	cv.put("sno",47);
		cv.put("hotel_name","Bollyhood Dhaba");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",48);
		cv.put("hotel_name","China House");
		cv.put("location","Mumbai");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",49);
		cv.put("hotel_name","Dolphin Hotel");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",50);
		cv.put("hotel_name","The Orange");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",51);
		cv.put("hotel_name","Daspalla");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",53);
		cv.put("hotel_name","Talasila Continental");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	cv.put("sno",54);
		cv.put("hotel_name","Palm");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",55);
		cv.put("hotel_name","The Gateway");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",56);
		cv.put("hotel_name","The Park");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	 
	cv.put("sno",57);
		cv.put("hotel_name","Welcom Grand Bay");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",58);
		cv.put("hotel_name","Fortune Inn");
		cv.put("location","Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);

	cv.put("sno",59);
		cv.put("hotel_name","Prashanth Continental");
		cv.put("location"," Vizag");
		cv.put("minimalorder","No minimum");

	 	db.insert("hoteldata",null,cv);
	 



	 

	
	
	
	
	
	}
	chotel.close();
	
	
	db.close();
	}
	public void customalert(String msg)
	{
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Home.this);
		 
		// set title
		alertDialogBuilder.setTitle(msg);

		// set dialog message
		alertDialogBuilder
			.setMessage("Should not be Empty")
			.setCancelable(false)
			.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					// if this button is clicked, close
					// current activity
dialog.dismiss();				}
			  }).create().show();

			
	}

}
