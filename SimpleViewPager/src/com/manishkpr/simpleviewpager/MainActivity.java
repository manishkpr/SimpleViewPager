package com.manishkpr.simpleviewpager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.manishkpr.simpleviewpager.adapter.PagerAdapter;


public class MainActivity extends FragmentActivity {
	ViewPager viewPager;
	PagerAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initView();
		setUpAdapter();
	}
	void initView(){
		setContentView(R.layout.activity_main);
		viewPager=(ViewPager)findViewById(R.id.viewPager);
	}
	void setUpAdapter(){
		adapter=new PagerAdapter(getApplicationContext(),getSupportFragmentManager());
		viewPager.setAdapter(adapter);
	}
}
