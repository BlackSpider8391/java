package io.kubernetes.client.extended.workqueue;

import io.kubernetes.client.extended.workqueue.ratelimiter.DefaultControllerRateLimiter;
import io.kubernetes.client.extended.workqueue.ratelimiter.RateLimiter;
import java.util.concurrent.ExecutorService;

/** The default rate limiting queue implementation. */
public class DefaultRateLimitingQueue<T> extends DefaultDelayingQueue<T>
    implements RateLimitingQueue<T> {

  private RateLimiter<T> rateLimiter;

  public DefaultRateLimitingQueue(ExecutorService waitingWorker) {
    super(waitingWorker);
    this.rateLimiter = new DefaultControllerRateLimiter<>();
  }

  public DefaultRateLimitingQueue(ExecutorService waitingWorker, RateLimiter<T> rateLimiter) {
    super(waitingWorker);
    this.rateLimiter = rateLimiter;
  }

  @Override
  public int numRequeues(T item) {
    return rateLimiter.numRequeues(item);
  }

  @Override
  public void forget(T item) {
    rateLimiter.forget(item);
  }

  @Override
  public void addRateLimited(T item) {
    super.addAfter(item, rateLimiter.when(item));
  }
}
