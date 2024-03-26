package com.sakhacontent.webviewplayer;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {




    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        VideoView videoView = findViewById(R.id.videoView2);
        String vPath = "android.resource://" + getPackageName() + "/raw/android_11v";
        String onlinePath = "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4";

        Uri videoURI = Uri.parse(vPath);
        Uri onlineVideoURI = Uri.parse(onlinePath);
        //videoView.setVideoPath(vPath);
        videoView.setVideoURI(onlineVideoURI);


        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        //https://wscubetechapps.com/android-course/android_11v.mp4
        //
        //https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4

        //      webView = findViewById(R.id.webview);
    }

    public void buttonPlayVideo(View view){
//        webView.loadUrl("https://videos.files.wordpress.com/Fo0X2qAf/samplevideos2_hd.mp4");
//        webView.loadUrl("https://www.youtube.com/watch?v=Wl7X8wlrfBs");
    }
}
