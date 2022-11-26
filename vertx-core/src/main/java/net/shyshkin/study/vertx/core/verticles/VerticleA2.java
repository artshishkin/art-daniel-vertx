package net.shyshkin.study.vertx.core.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleA2 extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getName());
    startPromise.complete();
  }
}
