package com.uber.tkpd.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.uber.tkpd.R;
import com.uber.tkpdkotlin.MainKotlinActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.button).setOnClickListener(v -> {
      Intent intent = new Intent(MainActivity.this, MainKotlinActivity.class);
      startActivity(intent);
    });
  }

}
