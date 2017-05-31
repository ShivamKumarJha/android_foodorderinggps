package hh.ff.foodorderingusinggps;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public class LocationService extends Service {
	public static final String TAG = "MyServiceTag";
	protected LocationManager locationManager;
	protected LocationListener locationListener;
	protected Context context;
	static SQLiteDatabase db;
	String lat;
	int i;
	StringBuilder result = new StringBuilder();
	String provider;
	protected String latitude,longitude; 
	protected boolean gps_enabled,network_enabled;
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}


@Override
	public void onCreate() {
		// TODO Auto-generated method stub

	locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
locationListener=new LocationListener() {
	
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub

		String address= getAddress(getApplicationContext(), location.getLatitude(), location.getLongitude());
		 
		if(address.length()!=0)
		{
	    		Intent start=new Intent(LocationService.this, WelcomePopUpMessage.class);
                start.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	    		Bundle b=new Bundle();
	    		
	    		b.putString("location",address);
	    		locationManager.removeUpdates(locationListener);
	    		start.putExtras(b);
	     
	    		startActivity(start);
		}
	}
};
	locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 1.0f, locationListener);
	
		super.onCreate();
	}

@Override
public void onStart(Intent intent, int startId) {
	// TODO Auto-generated method stub
	
	super.onStart(intent, startId);
}

boolean flag;
String station;

	    	    	 		
	

	 String locality;
	 public  String getAddress(Context ctx, double latitude, double longitude) {
	        
	        try {
	            Geocoder geocoder = new Geocoder(ctx, Locale.getDefault());
	            List<Address>
	            addresses = geocoder.getFromLocation(latitude, longitude, 1);
	            if (addresses.size() > 0) {
	                Address address = addresses.get(0);
	     
	    locality=address.getLocality();
	    
	         	    //result.append(zipcode);
	     
	            }
	        } catch (IOException e) {
	            Log.e("tag", e.getMessage());
	        }
	 
	        return locality;
	    }
}
