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

public class List_Of_Trains extends Activity {
ArrayList<TrainDetail> storeDetails;
static SQLiteDatabase db;
Bundle extras ;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listoftrains);
	
		StorageHelper sh=new StorageHelper(getApplicationContext());
		db=sh.getWritableDatabase();
		extras = getIntent().getExtras(); 
		storeDetails=new ArrayList<TrainDetail>();

		if(extras !=null) {

			String[] cols=new String[]{"pnr","name","fromplace","toplace"};
	    	Cursor c=db.query("traindata",cols, "fromplace=? and toplace=? or pnr=?",new String[] {extras.getString("from"),extras.getString("to"),extras.getString("pnr")},null,null,null);
	    	if(c.moveToFirst())
	    		do
	    		{
    		int id=c.getInt(0);
	    		String name=c.getString(1);
	    	
	    		TrainDetail pd=new TrainDetail();
	    		pd.setSno(id);
	    		pd.setName(name);
	    		
	    	
	    		storeDetails.add(pd);
	    		}while(c.moveToNext());
	    	c.close();
		
		ListView player_list=(ListView)findViewById(R.id.listView1);
		player_list.setAdapter(new TrainAdapter(this,storeDetails));
		
		player_list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent senddatafromto=new Intent(getApplicationContext(), List_Of_Hotel.class);
				Bundle putfromto=new Bundle();
				putfromto.putString("location",extras.getString("from"));
				putfromto.putString("trainname",storeDetails.get(arg2).getName());
				
				senddatafromto.putExtras(putfromto);
	            startActivity(senddatafromto);			
			}
		});
		}
	}
	

}
