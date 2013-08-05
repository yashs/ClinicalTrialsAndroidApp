package com.example.buttontest;

import org.apache.http.util.EncodingUtils;

import com.example.buttontest.R;
import com.example.buttontest.R.id;
import com.example.buttontest.R.layout;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends Activity {

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// webView = new WebView(this);
		setContentView(R.layout.activity_webview);
		webView = (WebView) findViewById(R.id.webView1);
		webView.setWebViewClient(new WebViewClient());
		webView.getSettings().setJavaScriptEnabled(true);
		try {
			webView.loadUrl("http://clinictrialsnew.cloudapp.net/ClinicalTrialsMobile/");
			/*String userName = getIntent().getExtras().getString("userEmail");
			String password = getIntent().getExtras().getString("password");
			byte[] post = EncodingUtils.getBytes("email=" + userName + "&pwd="
					+ password, "BASE64");
			webView.postUrl(
					"http://clinictrialsnew.cloudapp.net/ClinicalTrialsMobile/rest/params/login",
					post);*/
		} catch (Exception e) {
			e.printStackTrace();
			webView.loadUrl("http://clinictrialsnew.cloudapp.net/ClinicalTrialsMobile/register.html");
		}
	}
}