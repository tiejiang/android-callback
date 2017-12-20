package com.tiejiang.androidcallbackdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tiejiang.androidcallbackdemo.listener.OnDownload;

public class MainActivity extends AppCompatActivity implements OnDownload {

    private DownloadDemo mDownloadDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDownloadDemo = DownloadDemo.getInstance();
        mDownloadDemo.setOnDownload(this);
        mDownloadDemo.dosth();

    }


    @Override
    public void onDownloadSuccess(String file_string) {
        Log.d("TIEJIANG", "MainActivity---onDownloadSuccess"+" file_string= "+file_string);
    }
}
