package hh.ff.foodorderingusinggps;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StorageHelper extends SQLiteOpenHelper {
	String table="create table traindata(pnr integer primary key,name text,fromplace text,toplace text);";
	String table1="create table FoodData(pnr integer,passenger_name text,trainname text,email text," +
			"mobile text,menuordered text,ordercost integer,coach text,seat text,placeofdelivery text);";
	String table2="create table hoteldata(sno integer primary key,hotel_name text,location text,minimalorder text);";
	
	public StorageHelper(Context context) {
		super(context,"FOODORDERINGDATABASE",null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(table);
		db.execSQL(table1);
		db.execSQL(table2);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		  db.execSQL("DROP TABLE IF EXISTS " + table);
	        db.execSQL("DROP TABLE IF EXISTS " + table1);
	        db.execSQL("DROP TABLE IF EXISTS " + table2);
	        
	 
	}

}
