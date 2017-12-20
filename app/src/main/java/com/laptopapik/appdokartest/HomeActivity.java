package com.laptopapik.appdokartest;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

public class HomeActivity extends AppCompatActivity {
    ViewPager mViewPager;
    TabPageAdapter mAdapter;
    TabLayout mTablayout;
    Toolbar mytoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mytoolbar= findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setTitle("Dokar Home");
        mViewPager = findViewById(R.id.container);
        mAdapter = new TabPageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mTablayout = findViewById(R.id.tab1);
        mTablayout.setupWithViewPager(mViewPager);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.act_bar, menu);
        return true;
    }

    public void onGroupItemClick (MenuItem item) {
        /*
        One of the group items (using the onClick attribute) was clicked
        The item parameter passed here indicates which item it is
        All other menu item clicks are handled by onOptionsItemSelected()
        */
    }

}
