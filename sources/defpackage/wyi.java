package defpackage;

import java.util.Iterator;

/* renamed from: wyi reason: default package */
public abstract class wyi<E> extends wyj<E> {
    protected final long a;
    protected final E[] b;

    public wyi(int i) {
        int a2 = wzf.a(i);
        this.a = (long) (a2 - 1);
        this.b = wyz.a(a2);
    }

    /* access modifiers changed from: protected */
    public final long a(long j) {
        return wyz.a(j, this.a);
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
