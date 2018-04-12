package com.android.speldipn.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView tv;
  Button bt;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // MainActivity에서 사용할 레이아웃 파일을 설정
    setContentView(R.layout.activity_main);

    tv = (TextView)findViewById(R.id.textView);
    bt = (Button)findViewById(R.id.button);

    View.OnClickListener listener = new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        tv.setText("Android World !");
      }
    };

    bt.setOnClickListener(listener);
  }

}


