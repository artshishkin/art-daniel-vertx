package net.shyshkin.study.vertx.core.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleN extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getSimpleName() +
      " on thread " + Thread.currentThread().getName() +
      " with config " + this.config()
    );
    startPromise.complete();
  }
}
