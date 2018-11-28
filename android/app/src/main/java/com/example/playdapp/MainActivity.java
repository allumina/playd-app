package com.example.playdapp;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setStatusBarColor(0x00000000);

    GeneratedPluginRegistrant.registerWith(this);

    ViewTreeObserver viewTreeObserver = getFlutterView().getViewTreeObserver();
    viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
      @Override
      public void onGlobalLayout() {
        getFlutterView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
      }
    });
  }
}
