package com.malouane.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.malouane.data.JokersRepo;

/** An endpoint class we are exposing */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "backend.malouane.com", ownerName = "backend.malouane.com", packagePath = ""))
public class JokesApiEndpoint {

  /** Endpoint method that that retrieves a joke */
  @ApiMethod(name = "getJoke") public MyBean retrieveJoke() {
    MyBean response = new MyBean();
    JokersRepo jokersRepo = new JokersRepo();
    response.setData(jokersRepo.tellJoke());
    return response;
  }
}
