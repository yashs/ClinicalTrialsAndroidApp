package com.example.buttontest;

import org.apache.http.util.EncodingUtils;

import com.example.buttontest.R;
import com.example.buttontest.WebViewActivity;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button continueToWebView;
	Button signup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addListenerOnButton();

	}

	public void addListenerOnButton() {
		final Context context = this;
		//final EditText userEmail = (EditText) findViewById(R.id.editText1);
		//final EditText password = (EditText) findViewById(R.id.editText2);
		continueToWebView = (Button) findViewById(R.id.button1);
		//signup = (Button) findViewById(R.id.button2);
		continueToWebView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			  Intent browserIntent = 
                            new Intent(context, WebViewActivity.class);
			  //browserIntent.putExtra("userEmail", userEmail.getText().toString());
			  //browserIntent.putExtra("password", password.getText().toString());
			  startActivity(browserIntent);
				
			}			
		});
		
		/*signup.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent browserIntent = 
                        new Intent(context, WebViewActivity.class);
			  startActivity(browserIntent);
			}			
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
