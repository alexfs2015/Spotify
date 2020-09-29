package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: wku reason: default package */
abstract class wku<E> extends AbstractQueue<E> {
    protected final AtomicReferenceArray<E> a;
    protected final int b;

    public wku(int i) {
        int a2 = wkz.a(i);
        this.b = a2 - 1;
        this.a = new AtomicReferenceArray<>(a2);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int a(long j) {
        return this.b & ((int) j);
    }

    /* access modifiers changed from: protected */
    public final void a(int i, E e) {
        this.a.lazySet(i, e);
    }
}
