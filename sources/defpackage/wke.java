package defpackage;

/* renamed from: wke reason: default package */
public final class wke<E> extends wkf<E> {
    public wke(int i) {
        super(i);
    }

    public final boolean offer(E e) {
        long j;
        if (e != null) {
            long j2 = this.a;
            long j3 = this.f;
            do {
                j = this.h;
                if (j >= j3) {
                    j3 = b() + j2 + 1;
                    if (j >= j3) {
                        return false;
                    }
                    wla.a.putOrderedLong(this, wkg.e, j3);
                }
            } while (!wla.a.compareAndSwapLong(this, wkk.g, j, j + 1));
            wlb.b(this.b, wkt.a(j, j2), e);
            return true;
        }
        throw new NullPointerException();
    }

    public final E poll() {
        long a = a();
        long a2 = a(a);
        Object[] objArr = this.b;
        E a3 = wlb.a(objArr, a2);
        if (a3 != null) {
            wlb.a(objArr, a2, null);
            wla.a.putOrderedLong(this, wkf.c, a + 1);
        } else if (a == this.h) {
            return null;
        } else {
            do {
                a3 = wlb.a(objArr, a2);
            } while (a3 == null);
        }
        wlb.a(objArr, a2, null);
        wla.a.putOrderedLong(this, wkf.c, a + 1);
        return a3;
    }

    public final E peek() {
        Object[] objArr = this.b;
        long a = a();
        long a2 = a(a);
        E a3 = wlb.a(objArr, a2);
        if (a3 != null) {
            return a3;
        }
        if (a == this.h) {
            return null;
        }
        do {
            a3 = wlb.a(objArr, a2);
        } while (a3 == null);
        return a3;
    }

    public final int size() {
        long b = b();
        while (true) {
            long j = this.h;
            long b2 = b();
            if (b == b2) {
                return (int) (j - b2);
            }
            b = b2;
        }
    }

    public final boolean isEmpty() {
        return b() == this.h;
    }
}
