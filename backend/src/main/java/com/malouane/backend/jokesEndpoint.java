package com.malouane.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.malouane.data.JokersRepo;

/** An endpoint class we are exposing */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "backend.FastJokes.alouane.com", ownerName = "backend.FastJokes.alouane.com", packagePath = ""))
public class jokesEndpoint {

  /** Endpoint method that that retrieves a joke */
  @ApiMethod(name = "getJoke") public MyBean retrieveJoke() {
    MyBean response = new MyBean();
    JokersRepo jokersRepo = new JokersRepo();
    response.setData(jokersRepo.tellJoke());
    return response;
  }
}
