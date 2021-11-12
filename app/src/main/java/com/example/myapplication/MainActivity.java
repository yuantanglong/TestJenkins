package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CatchExcep application;
    TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello();
//        application = (CatchExcep) getApplication();
//        application.init();
//        application.addActivity(this);
//        tv_text = findViewById(R.id.tv_test);
//        tv_text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//                new Handler().post(new Runnable() {
//                    @Override
//                    public void run() {
//                        MyDialog dialog = new MyDialog(MainActivity.this);
//                        dialog.setContentView(R.layout.dialog_view);
//                        dialog.show();
//
//                    }
//                });
//            }
//        });
    }

    public void test() {
//        Class.forName("android.view.WindowManager")
    }

    private static final String TAG = "MainActivity";
    public static void hello() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        Log.e(TAG, "className: "+ className);
        Log.e(TAG, "methodName: "+ methodName);
        Log.e(TAG, "lineNumber: "+ lineNumber);
        System.out.println(className);
        System.out.println(methodName);
        System.out.println(lineNumber);
    }
    /**
     * 人为制造的异常
     */
    public void press() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                tv_text.setText("dfsd");
            }
        }).start();
    }
}