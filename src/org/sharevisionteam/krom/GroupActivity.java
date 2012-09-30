package org.sharevisionteam.krom;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GroupActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.group, menu);
        return true;
    }
}
