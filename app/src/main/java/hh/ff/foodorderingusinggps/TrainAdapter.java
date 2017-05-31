
package hh.ff.foodorderingusinggps;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TrainAdapter extends BaseAdapter {
	Context con;
	ArrayList<TrainDetail> getDetails;

Integer[] trainimages={R.drawable.train1,R.drawable.train2,R.drawable.train3,R.drawable.train4,R.drawable.train5,R.drawable.train1,R.drawable.train2,R.drawable.train3,R.drawable.train4,R.drawable.train5,R.drawable.train1,R.drawable.train2,R.drawable.train3,R.drawable.train4,R.drawable.train5,R.drawable.train1,R.drawable.train2,R.drawable.train3,R.drawable.train4,R.drawable.train5,R.drawable.train1,R.drawable.train2,R.drawable.train3,R.drawable.train4,R.drawable.train5};
	LayoutInflater ll;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return getDetails.size();
	}

public TrainAdapter(Context con, ArrayList<TrainDetail> getDetails) {
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
			convertView = ll.inflate(R.layout.train, null);
			holder = new ViewHolder();
			holder.traindept = (TextView) convertView.findViewById(R.id.desg);
			holder.trainno = (TextView) convertView.findViewById(R.id.runs);
		holder.image=(ImageView)convertView.findViewById(R.id.photo);
			

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.traindept.setText(getDetails.get(position).getName()+"");
		holder.trainno.setText(getDetails.get(position).getSno()+"");
		holder.image.setImageResource(trainimages[position]);


		return convertView;
	}

	static class ViewHolder {
		ImageView image;
		TextView traindept;
		TextView trainno;
	}
}
