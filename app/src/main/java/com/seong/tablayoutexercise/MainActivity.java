package com.seong.tablayoutexercise;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.seong.tablayoutexercise.Adapter.TabAdapter;
import com.seong.tablayoutexercise.Fragments.Tab1Fragment;
import com.seong.tablayoutexercise.Fragments.Tab2Fragment;
import com.seong.tablayoutexercise.Fragments.Tab3Fragment;

public class MainActivity extends AppCompatActivity {

    private TabAdapter mAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        mAdapter = new TabAdapter(getSupportFragmentManager());
        mAdapter.addFragment(new Tab1Fragment(), "Tab 1");
        mAdapter.addFragment(new Tab2Fragment(), "Tab 2");
        mAdapter.addFragment(new Tab3Fragment(), "Tab 3");

        viewPager.setAdapter(mAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
