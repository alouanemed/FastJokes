package com.malouane.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

  private static final String KEY = "jokeToDisplay";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_joke_displayer);

    TextView jokeTextView = findViewById(R.id.tv_joke);
    if (getIntent().getExtras() != null) {
      if (getIntent().hasExtra(KEY)) {
        Bundle intentData = getIntent().getExtras();
        String joke = intentData.getString("jokeToDisplay", "Failed!");
        jokeTextView.setText(joke);
      }
    } else {
      jokeTextView.setText(R.string.empty);
    }
  }
}
