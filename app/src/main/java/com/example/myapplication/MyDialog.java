package com.example.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.ActionMode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyDialog extends Dialog {
    private static final String TAG = "MyDialog";
    public MyDialog(@NonNull Context context) {
        super(context);
    }

    public MyDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected MyDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Log.e(TAG, "onWindowStartingActionMode:1" );
        return null;
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        Log.e(TAG, "onWindowStartingActionMode: 2" );
        return null;
    }
}
