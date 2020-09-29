package defpackage;

import java.util.Queue;

/* renamed from: fcx reason: default package */
public abstract class fcx<E> extends fcq<E> implements Queue<E> {
    protected fcx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Queue<E> delegate();

    public E element() {
        return delegate().element();
    }

    public boolean offer(E e) {
        return delegate().offer(e);
    }

    public E peek() {
        return delegate().peek();
    }

    public E poll() {
        return delegate().poll();
    }

    public E remove() {
        return delegate().remove();
    }
}
