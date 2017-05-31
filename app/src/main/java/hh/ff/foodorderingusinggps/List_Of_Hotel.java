package hh.ff.foodorderingusinggps;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class List_Of_Hotel extends Activity {
Bundle bun;
ArrayList<HotelDetail> storeDetails;
String location;
static SQLiteDatabase db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listofhotels);
		StorageHelper sh=new StorageHelper(getApplicationContext());
		db=sh.getWritableDatabase();
		bun = getIntent().getExtras(); 
		storeDetails=new ArrayList<HotelDetail>();

		if(bun !=null) {

			String[] cols=new String[]{"sno","hotel_name","location","minimalorder"};
    		Toast.makeText(getBaseContext(), bun.getString("location"), Toast.LENGTH_SHORT).show();

	    	Cursor c=db.query("hoteldata",cols, "location=?",new String[] {bun.getString("location")},null,null,null);
	    	if(c.moveToFirst())
	    		do
	    		{
    		int id=c.getInt(0);
	    		String name=c.getString(1);
	    		String location=c.getString(2);
	    		String mo=c.getString(3);
	    		HotelDetail hd=new HotelDetail();
	   hd.setSno(id);
hd.setHotelname(name);
hd.setHotellocation(location);
hd.setHotelphrase(mo);
hd.setDeptime("depttime");
	    	
	    		storeDetails.add(hd);
	    		}while(c.moveToNext());
	    	c.close();
	    	
	    	ListView player_list=(ListView)findViewById(R.id.listView2);
			player_list.setAdapter(new HotelAdapter(this,storeDetails));
			
			player_list.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
				Intent senddatafromto=new Intent(getApplicationContext(), FoodMenu.class);
		Bundle putfromto=new Bundle();
					putfromto.putString("trainname",bun.getString("trainname"));

				senddatafromto.putExtras(putfromto);
		            startActivity(senddatafromto);			
			
				}
			});
		}
	}
	

}
