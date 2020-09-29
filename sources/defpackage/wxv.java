package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: wxv reason: default package */
abstract class wxv<E> extends AbstractQueue<E> {
    protected final AtomicReferenceArray<E> a;
    protected final int b;

    public wxv(int i) {
        int a2 = wyk.a(i);
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
    public final E a(int i) {
        return this.a.get(i);
    }
}
