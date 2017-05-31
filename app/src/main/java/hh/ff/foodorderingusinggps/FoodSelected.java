package hh.ff.foodorderingusinggps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class FoodSelected extends Activity  {
TextView tv;
Button cfood;
int totalamount;
Bundle bun;
String value;
String trainname;
String foodselected;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.foodselected);
tv=(TextView)findViewById(R.id.foodselected);
cfood=(Button)findViewById(R.id.cfood);
bun=this.getIntent().getExtras();
if(bun!=null)
{
	foodselected=bun.getString("foodselected");
	value=bun.getString("food");
	tv.setText(value);
	totalamount=bun.getInt("total");
	trainname=bun.getString("trainname");
	cfood.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent fs=new Intent(FoodSelected.this,PlaceOrder.class);
			Bundle bun=new Bundle();
			bun.putString("foodselected",foodselected);
			bun.putInt("total",totalamount);
			bun.putString("trainname",trainname);
			fs.putExtras(bun);
			startActivity(fs);
			
		}
	});
}
}

@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
	
	value="";
	super.onBackPressed();
	}

}
