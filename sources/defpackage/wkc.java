package defpackage;

import java.util.Iterator;

/* renamed from: wkc reason: default package */
public abstract class wkc<E> extends wkd<E> {
    protected final long a;
    protected final E[] b;

    public wkc(int i) {
        int a2 = wkz.a(i);
        this.a = (long) (a2 - 1);
        this.b = wkt.a(a2);
    }

    /* access modifiers changed from: protected */
    public final long a(long j) {
        return wkt.a(j, this.a);
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
}
