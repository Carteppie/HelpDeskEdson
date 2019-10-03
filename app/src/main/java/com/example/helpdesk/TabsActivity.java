package com.example.helpdesk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class TabsActivity extends AppCompatActivity {

    private TabAdapter adpter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.layoutTab);
        adpter = new TabAdapter(getSupportFragmentManager());
        adpter.addFragment(new Tab1Fragment(), "Tab 1");
        adpter.addFragment(new Tab1Fragment(),"Tab 2");
        adpter.addFragment(new Tab1Fragment(),"Tab 3");
        viewPager.setAdapter(adpter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
