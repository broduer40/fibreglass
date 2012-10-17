package org.fibreglass.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import org.fibreglass.TestView;

public class DemoActivity extends Activity {
	private TestView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    	mView = new TestView(this);
        
        setContentView(mView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_demo, menu);
        return true;
    }
}
