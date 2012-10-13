package org.sharevisionteam.krom.fragments;

import org.sharevisionteam.krom.R;
import org.sharevisionteam.krom.adapters.GroupAdapter;
import com.actionbarsherlock.app.SherlockListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class GroupListFragment extends SherlockListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] {"ShareVisionTeam","AndroidGroup"};
		setListAdapter(new GroupAdapter(getActivity(), R.layout.group_list_item, values));
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.group_list, container, false);
		
	}
}
