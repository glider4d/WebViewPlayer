package com.sakhacontent.webviewplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String videoAdress = intent.getStringExtra("VideoAdress");


        VideoView videoView = findViewById(R.id.videoView3);
        String vPath = "android.resource://" + getPackageName() + "/raw/android_11v";
        String onlinePath = videoAdress;//"https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4";


        Uri videoURI = Uri.parse(vPath);
        Uri onlineVideoURI = Uri.parse(onlinePath);
        //videoView.setVideoPath(vPath);
        videoView.setVideoURI(onlineVideoURI);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

    public void buttonClick(View view) {
        //setContentView(R.layout.activity_webview);
        /*
        VideoView videoView = findViewById(R.id.videoView3);
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
        */
    }
}