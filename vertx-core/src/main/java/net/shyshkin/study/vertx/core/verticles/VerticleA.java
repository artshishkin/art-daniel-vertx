package net.shyshkin.study.vertx.core.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Promise;

public class VerticleA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getName());
    this.vertx.deployVerticle(new VerticleA1(), new Handler<AsyncResult<String>>() {
      @Override
      public void handle(AsyncResult<String> whenDeployed) {
        System.out.println("Deployed " + VerticleA1.class.getName());
        String deploymentID = whenDeployed.result();
        vertx.undeploy(deploymentID);
      }
    });
    this.vertx.deployVerticle(
      new VerticleA2(),
      whenDeployed -> System.out.println("Deployed " + VerticleA2.class.getName())
    );
    startPromise.complete();
  }
}
