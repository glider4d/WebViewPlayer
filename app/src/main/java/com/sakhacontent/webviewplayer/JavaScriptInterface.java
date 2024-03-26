package com.sakhacontent.webviewplayer;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;

import androidx.appcompat.app.AppCompatActivity;

public class JavaScriptInterface extends AppCompatActivity {
    private Activity activity;

    public JavaScriptInterface(Activity activity) {
        this.activity = activity;
    }

    private void MainAct(MainActivity act){}

    @JavascriptInterface
    public void startVideo(String videoAddress){
        MainActivity mainActivity = (MainActivity) activity;
        mainActivity.FromJsInterface(videoAddress);

    }

}

//        MainAct(activity);
//      Intent myInt = new Intent(getApplicationContext(), SecondActivity.class);

//        startActivity(myInt);
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setDataAndType(Uri.parse(videoAddress), "video/3gpp");
//        activity.startActivity(intent);