package com.malouane.data;

import java.util.ArrayList;
import java.util.Random;

/***
 * Serves static and random jokes
 */

public class JokersRepo {

  private ArrayList<String> jokesList = new ArrayList<>();
  private Random random;

  public JokersRepo() {
    populateJokes();
    random = new Random();
  }

  public String tellJoke() {
    int position = random.nextInt(jokesList.size()-1);
    return jokesList.get(position);
  }

  private void populateJokes() {
    jokesList.add("Joke Lorem");
    jokesList.add("Joke Lorem3");
    jokesList.add("Joke Lorem9");
  }
}
