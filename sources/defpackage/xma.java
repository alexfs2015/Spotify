package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: xma reason: default package */
abstract class xma<E> extends AbstractQueue<E> {
    protected final AtomicReferenceArray<E> a;
    protected final int b;

    public xma(int i) {
        int a2 = xmp.a(i);
        this.b = a2 - 1;
        this.a = new AtomicReferenceArray<>(a2);
    }

    /* access modifiers changed from: protected */
    public final int a(long j) {
        return this.b & ((int) j);
    }

    /* access modifiers changed from: protected */
    public final E a(int i) {
        return this.a.get(i);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
