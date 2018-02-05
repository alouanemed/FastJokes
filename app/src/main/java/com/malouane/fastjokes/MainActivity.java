package com.malouane.fastjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import com.malouane.jokedisplay.JokeDisplayActivity;

public class MainActivity extends AppCompatActivity implements JokeRepo {

  ProgressBar progressBar;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    progressBar = findViewById(R.id.pb_get_joke);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();

    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  public void performGetJoke(View view) {
    progressBar.setVisibility(View.VISIBLE);
    new getJokeAsyncTask().execute(this);
  }

  @Override public void showJoke(String joke) {
    progressBar.setVisibility(View.GONE);
    Intent intent = new Intent(this, JokeDisplayActivity.class);
    intent.putExtra("jokeToDisplay", joke);
    startActivity(intent);
  }
}
