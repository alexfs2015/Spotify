package io.reactivex.internal.subscribers;

public interface InnerQueuedSubscriberSupport<T> {
    void a(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void a(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);

    void a(InnerQueuedSubscriber<T> innerQueuedSubscriber, Throwable th);

    void b();
}
