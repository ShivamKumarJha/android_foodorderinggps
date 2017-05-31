package hh.ff.foodorderingusinggps;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class HotelAdapter extends BaseAdapter {
	Context con;
	ArrayList<HotelDetail> getDetails;
	Integer[] images={R.drawable.dinner,R.drawable.dinner2,R.drawable.lunch2,R.drawable.lunch1,
			R.drawable.lunch,R.drawable.dinner2,R.drawable.dinner1,R.drawable.dinner,R.drawable.dinner2,R.drawable.lunch2,R.drawable.lunch1,
			R.drawable.lunch,R.drawable.dinner2,R.drawable.dinner1,R.drawable.dinner,R.drawable.dinner2,R.drawable.lunch2,R.drawable.lunch1,
			R.drawable.lunch,R.drawable.dinner2,R.drawable.dinner1,R.drawable.dinner,R.drawable.dinner2,R.drawable.lunch2,R.drawable.lunch1,
			R.drawable.lunch,R.drawable.dinner2,R.drawable.dinner1,R.drawable.dinner,R.drawable.dinner2,R.drawable.lunch2,R.drawable.lunch1,
			R.drawable.lunch,R.drawable.dinner2,R.drawable.dinner1};
    LayoutInflater ll;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return getDetails.size();
	}

public HotelAdapter(Context con, ArrayList<HotelDetail> getDetails) {
	super();
	this.con = con;
	this.getDetails = getDetails;
	ll=LayoutInflater.from(con);
}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return getDetails.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
	
		ViewHolder holder;
		if (convertView == null) {
			convertView = ll.inflate(R.layout.hotel, null);
			holder = new ViewHolder();
			holder.playerName = (TextView) convertView.findViewById(R.id.name);
			holder.player_Desg = (TextView) convertView.findViewById(R.id.desg);
			holder.runs = (TextView) convertView.findViewById(R.id.runs);
		
			holder.image=(ImageView)convertView.findViewById(R.id.photo);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.playerName.setText(getDetails.get(position).getHotelname()+"");
		holder.player_Desg.setText(getDetails.get(position).getHotellocation()+"");
		holder.runs.setText(getDetails.get(position).getHotelphrase()+"");
		holder.image.setImageResource(images[position]);


		return convertView;
	}

	static class ViewHolder {
		TextView playerName;
		ImageView image;
		TextView player_Desg;
		TextView runs;
	}
}
