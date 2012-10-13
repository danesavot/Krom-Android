package org.sharevisionteam.krom.adapters;

import org.sharevisionteam.krom.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GroupAdapter extends ArrayAdapter<String>{
	private Context context;
	private int resourceId;
	private String[] values;
	
	static class ViewHolder {
		ImageView logoImageView;
		TextView titleTextView;
		TextView descriptionTextView;
	}
	
	public GroupAdapter(Context context, int resourceId,
			String[] values) {
		super(context, resourceId, values);
		this.context = context;
		this.resourceId = resourceId;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView;
		rowView = convertView;
		if (rowView == null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflater.inflate(resourceId, parent, false);
			
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.logoImageView = (ImageView) rowView.findViewById(R.id.logoImageView);
			viewHolder.titleTextView = (TextView) rowView.findViewById(R.id.titleTextView);
			viewHolder.descriptionTextView = (TextView) rowView.findViewById(R.id.descriptionTextView);
			
			rowView.setTag(viewHolder);
		}
		
			ViewHolder viewHolder = (ViewHolder) rowView.getTag();
			viewHolder.titleTextView.setText(values[position]);
			
		return rowView;
	}
	
}