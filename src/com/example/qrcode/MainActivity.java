package com.example.qrcode;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;

import org.apache.cordova.*;

public class MainActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		 
	 	super.onCreate(savedInstanceState);
		 
         super.setIntegerProperty("splashscreen", R.drawable.splash);
	 	super.loadUrl("file:///android_asset/www/index.html",3500);
		//super.onCreate(savedInstanceState);
	}
 //	public boolean onCreateOptionsMenu(Menu menu) {
//		menu.add(0, 1, 1, R.string.about);
//		menu.add(0, 2, 2, R.string.navigation);
//		menu.add(0, 3, 3, R.string.exit);
//		// TODO Auto-generated method stub
//		return super.onCreateOptionsMenu(menu);
//	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 3) {
			finish();
		}
		if (item.getItemId() == 1) {
			super.loadUrl("file:///android_asset/www/about.html");
		}
		if (item.getItemId() == 2) {
			super.loadUrl("file:///android_asset/www/setting.html");
		}
		return super.onOptionsItemSelected(item);
	}
}
