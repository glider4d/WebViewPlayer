package com.sakhacontent.webviewplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);


        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setMediaPlaybackRequiresUserGesture(true);

        webView.setWebChromeClient(new WebChromeClient());

        //webView.setWebViewClient(new WebViewClient());
        //add javascript interface
        JavaScriptInterface jsInterface = new JavaScriptInterface(this);

        webView.addJavascriptInterface(jsInterface, "JSInterface");

        //setWebChromeClient(new WebChromeClient());
        webView.loadUrl("http://192.168.1.227:5500/index.html");
        //        webView.loadUrl("http://192.168.1.227:5500/index.html");
        //webView.loadUrl("https://192.168.1.227:7167/") ;
        //webView.loadUrl("https://extrashell.online/mail/") ;


    }
    @JavascriptInterface
    public void startVideo(String videoAddress) {
    }
    public void buttonClick(View view) {
//        setContentView(R.layout.activity_second);

        /*
        VideoView videoView = findViewById(R.id.videoView);
        String vPath = "android.resource://" + getPackageName() + "/raw/android_11v";
        String onlinePath = "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4";

        Uri videoURI = Uri.parse(vPath);
        Uri onlineVideoURI = Uri.parse(onlinePath);
        //videoView.setVideoPath(vPath);
        videoView.setVideoURI(onlineVideoURI);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);*/
    }

    public void FromJsInterface(String videoUrl){
        Intent myInt = new Intent(getApplicationContext(), SecondActivity.class);
        myInt.putExtra("VideoAdress", videoUrl);
        startActivity(myInt);
    }

    public void buttonClick2(View view){
        Intent myInt = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(myInt);


        //        setContentView(R.layout.activity_second);
    }
}