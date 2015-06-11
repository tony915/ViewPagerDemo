package com.tonycube.demo.viewpagerdemo;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		initToolbar();
		initViewPager();
	}
	
	private void initToolbar() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
	    setSupportActionBar(toolbar);
	    
	    ActionBar actionbar = getSupportActionBar();
	    actionbar.setTitle("ViewPager Demo");
	}

	private void initViewPager(){
		List<Fragment> fragments = getFragments();
		PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), fragments);
		
		ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
		pager.setAdapter(adapter);
	}

	private List<Fragment> getFragments() {
		List<Fragment> fragments = new ArrayList<Fragment>();
		fragments.add(PageFragment.newInstance("Fragment 1", R.drawable.wallpaper_1));
		fragments.add(PageFragment.newInstance("Fragment 2", R.drawable.wallpaper_2));
		fragments.add(PageFragment.newInstance("Fragment 3", R.drawable.wallpaper_3));
		fragments.add(PageFragment.newInstance("Fragment 4", R.drawable.wallpaper_4));
		fragments.add(PageFragment.newInstance("Fragment 5", R.drawable.wallpaper_5));
		fragments.add(PageFragment.newInstance("Fragment 6", R.drawable.wallpaper_6));
		return fragments;
	}
}
