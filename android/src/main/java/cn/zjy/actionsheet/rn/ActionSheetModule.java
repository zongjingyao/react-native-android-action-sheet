package cn.zjy.actionsheet.rn;

import android.app.Activity;
import android.graphics.Color;
import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

/**
 * Created by ZJY on 2016/10/7.
 */
public class ActionSheetModule extends ReactContextBaseJavaModule {
    public ActionSheetModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "AndroidActionSheet";
    }

    @ReactMethod
    public void showActionSheetWithOptions(ReadableMap params, Callback callback) {
        final Activity activity = getCurrentActivity();
        if (activity == null) return;
    }
}
