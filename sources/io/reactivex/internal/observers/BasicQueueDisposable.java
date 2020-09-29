package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.QueueDisposable;

public abstract class BasicQueueDisposable<T> implements QueueDisposable<T> {
    public final boolean a(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
