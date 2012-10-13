package org.sharevisionteam.krom.activities;

import org.sharevisionteam.krom.R;
import org.sharevisionteam.krom.fragments.GroupListFragment;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class GroupActivity extends SherlockFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group);
        
        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null){
        	// However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
        	if (savedInstanceState != null){
        		return;
        	}
        	
        	FragmentManager fragmentManager = getSupportFragmentManager();
        	FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        	
        	// In case this activity was started with special instructions from an Intent,
            // pass the Intent's extras to the fragment as arguments
        	GroupListFragment groupListFragment = new GroupListFragment();
        	groupListFragment.setArguments(getIntent().getExtras());
        	
        	// Add the fragment to the 'fragment_container'
        	fragmentTransaction.add(R.id.fragment_container, groupListFragment);
        	fragmentTransaction.commit();
        	
        	
        }
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getSupportMenuInflater().inflate(R.menu.group, menu);
    	return true;
    }

}
