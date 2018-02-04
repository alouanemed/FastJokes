package com.malouane.fastjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.malouane.jokedisplay.JokeDisplayActivity;

public class MainActivity extends AppCompatActivity implements JokeRepo {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void performGetJoke(View view) {

        Log.d("Main", "clicked");
        new getJokeAsyncTask().execute(this);
    }

  @Override public void showJoke(String joke) {
    Intent intent = new Intent(this, JokeDisplayActivity.class);
    intent.putExtra("jokeToDisplay", joke);
    startActivity(intent);
  }
}
