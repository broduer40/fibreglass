package org.fibreglass.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DemoActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_demo, menu);
        return true;
    }
}
