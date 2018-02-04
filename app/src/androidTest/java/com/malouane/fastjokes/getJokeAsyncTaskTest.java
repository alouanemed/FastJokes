package com.malouane.fastjokes;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class) public class getJokeAsyncTaskTest {

  private JokeRepo repo = new JokeRepo() {
    @Override public void showJoke(String joke) {

    }
  };

  @Test public void verifyAsyncTask() {
    getJokeAsyncTask asyncTask = new getJokeAsyncTask();
    String result = asyncTask.doInBackground(repo);
    assertEquals("Joke Lorem", result);
  }
}