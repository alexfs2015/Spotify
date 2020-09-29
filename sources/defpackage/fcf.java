package defpackage;

import java.util.Queue;

/* renamed from: fcf reason: default package */
public abstract class fcf<E> extends fby<E> implements Queue<E> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Queue<E> delegate();

    protected fcf() {
    }

    public boolean offer(E e) {
        return delegate().offer(e);
    }

    public E poll() {
        return delegate().poll();
    }

    public E remove() {
        return delegate().remove();
    }

    public E peek() {
        return delegate().peek();
    }

    public E element() {
        return delegate().element();
    }
}
