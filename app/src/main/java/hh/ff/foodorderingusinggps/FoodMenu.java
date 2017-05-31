package hh.ff.foodorderingusinggps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class FoodMenu extends Activity  {
EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
Button fs;
String trainname;
Bundle fbun;
StringBuilder sb,orderedfood;
int totalamount,amount;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.foodmenu);
fbun=this.getIntent().getExtras();
if(fbun!=null)
{

sb=new StringBuilder();
orderedfood=new StringBuilder();
trainname=fbun.getString("trainname");
e1=(EditText)findViewById(R.id.editText1);
e2=(EditText)findViewById(R.id.editText2);
e3=(EditText)findViewById(R.id.editText3);
e4=(EditText)findViewById(R.id.editText4);
e5=(EditText)findViewById(R.id.editText5);
e6=(EditText)findViewById(R.id.editText6);
e7=(EditText)findViewById(R.id.editText7);
e8=(EditText)findViewById(R.id.editText8);
e9=(EditText)findViewById(R.id.editText9);
e10=(EditText)findViewById(R.id.editText10);
c1=(CheckBox)findViewById(R.id.checkBox1);
c2=(CheckBox)findViewById(R.id.checkBox2);
c3=(CheckBox)findViewById(R.id.checkBox3);
c4=(CheckBox)findViewById(R.id.checkBox4);
c5=(CheckBox)findViewById(R.id.checkBox5);
c6=(CheckBox)findViewById(R.id.checkBox6);
c7=(CheckBox)findViewById(R.id.checkBox7);
c8=(CheckBox)findViewById(R.id.checkBox8);
c9=(CheckBox)findViewById(R.id.checkBox9);
c10=(CheckBox)findViewById(R.id.checkBox10);
fs=(Button)findViewById(R.id.foodsubmit);
c1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e1.getText().toString()+"     "+amount+"     "+c1.getText().toString()+"\n");
			orderedfood.append(""+c1.getText().toString()+",");

			if(e1!=null)
			{
			totalamount+=Integer.parseInt((e1.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e2.getText().toString()+"     "+amount+"     "+c2.getText().toString()+"\n");
			orderedfood.append(""+c2.getText().toString()+",");

			if(e2!=null)
			{
			totalamount+=Integer.parseInt((e2.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e3.getText().toString()+"     "+amount+"     "+c3.getText().toString()+"\n");
			orderedfood.append(""+c3.getText().toString()+",");

			if(e3!=null)
			{
			totalamount+=Integer.parseInt((e3.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e4.getText().toString()+"     "+amount+"     "+c4.getText().toString()+"\n");
			orderedfood.append(""+c4.getText().toString()+",");

			if(e4!=null)
			{
			totalamount+=Integer.parseInt((e4.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e5.getText().toString()+"     "+amount+"     "+c5.getText().toString()+"\n");
			orderedfood.append(""+c5.getText().toString()+",");

			if(e5!=null)
			{
			totalamount+=Integer.parseInt((e5.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e6.getText().toString()+"     "+amount+"     "+c6.getText().toString()+"\n");
			orderedfood.append(""+c6.getText().toString()+",");

			if(e6!=null)
			{
			totalamount+=Integer.parseInt((e6.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e7.getText().toString()+"     "+amount+"     "+c7.getText().toString()+"\n");
			orderedfood.append(""+c7.getText().toString()+",");

			if(e7!=null)
			{
			totalamount+=Integer.parseInt((e7.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e8.getText().toString()+"     "+amount+"     "+c8.getText().toString()+"\n");
			orderedfood.append(""+c8.getText().toString()+",");

			if(e8!=null)
			{
			totalamount+=Integer.parseInt((e8.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e9.getText().toString()+"     "+amount+"     "+c9.getText().toString()+"\n");
			orderedfood.append(""+c9.getText().toString()+",");

			if(e9!=null)
			{
			totalamount+=Integer.parseInt((e9.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});
c10.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (((CheckBox) v).isChecked())

		{
			amount=50;
			
			sb.append(e10.getText().toString()+"     "+amount+"     "+c10.getText().toString()+"\n");
			orderedfood.append(""+c10.getText().toString()+",");

			if(e10!=null)
			{
			totalamount+=Integer.parseInt((e10.getText().toString()))*amount;
			Toast.makeText(FoodMenu.this,sb.toString(),Toast.LENGTH_LONG).show();
			}
		}
		
	}
});


fs.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		sb.append("\n\n\n\nTotal amount :"+totalamount);
		Toast.makeText(FoodMenu.this, sb.toString(),Toast.LENGTH_LONG).show();
		Intent senddatafromto=new Intent(FoodMenu.this, FoodSelected.class);
		Bundle putfromto=new Bundle();
		putfromto.putString("foodselected",orderedfood.toString());
		putfromto.putInt("total",totalamount);
	
		putfromto.putString("ftrainname",trainname);
			putfromto.putString("food",sb.toString());
	    
		senddatafromto.putExtras(putfromto);
        startActivity(senddatafromto);	
       
	}
});

}


}
}
