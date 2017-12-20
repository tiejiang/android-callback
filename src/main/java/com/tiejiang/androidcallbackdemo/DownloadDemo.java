package com.tiejiang.androidcallbackdemo;

import com.tiejiang.androidcallbackdemo.listener.OnDownload;

/**
 * Created by yinyu-tiejiang on 17-12-20.
 */

public class DownloadDemo {

    private OnDownload mOnDownload;
    private static DownloadDemo mDownloadDemo;

    public void setOnDownload(OnDownload onDownload){

        this.mOnDownload = onDownload;

    }

    public static DownloadDemo getInstance(){

        return (mDownloadDemo == null?new DownloadDemo():mDownloadDemo);
    }

    public void dosth(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                mOnDownload.onDownloadSuccess("download ok");
            }
        }).start();
    }
}
