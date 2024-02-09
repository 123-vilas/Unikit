package com.example.unikit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import kotlin.Metadata;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"},
        d2 = {"Lcom/example/unikit/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCal", "", "v", "Landroid/view/View;", "onCon", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDat", "onNote", "onTran", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {


    public static int notes;
    public static ArrayAdapter<Object> arrayAdapter;

    protected void onCreate(Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);
       this.setContentView(R.layout.activity_main);

   }

   public final void onCal( View v) {
      Intent i = new Intent((Context)this, scientificcalculator.class);
      this.startActivity(i);
   }

   public final void onCon( View v) {
      Intent i = new Intent((Context)this, temp_cal.class);
      this.startActivity(i);
   }

   public final void onTran( View v) {
     Intent i = new Intent((Context)this, Translator.class);
     this.startActivity(i);
  }

   public final void onDat( View v) {
      Intent i = new Intent((Context)this, DateCounter.class);
      this.startActivity(i);
   }



}
