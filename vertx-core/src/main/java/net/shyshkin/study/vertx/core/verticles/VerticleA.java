package net.shyshkin.study.vertx.core.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getName());
    this.vertx.deployVerticle(new VerticleA1());
    this.vertx.deployVerticle(new VerticleA2());
    startPromise.complete();
  }
}
