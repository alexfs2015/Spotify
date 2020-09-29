package defpackage;

/* renamed from: wyk reason: default package */
public final class wyk<E> extends wyl<E> {
    public wyk(int i) {
        super(i);
    }

    public final boolean isEmpty() {
        return b() == this.h;
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
                    wzg.a.putOrderedLong(this, wym.e, j3);
                }
            } while (!wzg.a.compareAndSwapLong(this, wyq.g, j, j + 1));
            wzh.b(this.b, wyz.a(j, j2), e);
            return true;
        }
        throw new NullPointerException();
    }

    public final E peek() {
        Object[] objArr = this.b;
        long a = a();
        long a2 = a(a);
        E a3 = wzh.a(objArr, a2);
        if (a3 != null) {
            return a3;
        }
        if (a == this.h) {
            return null;
        }
        do {
            a3 = wzh.a(objArr, a2);
        } while (a3 == null);
        return a3;
    }

    public final E poll() {
        long a = a();
        long a2 = a(a);
        Object[] objArr = this.b;
        E a3 = wzh.a(objArr, a2);
        if (a3 != null) {
            wzh.a(objArr, a2, null);
            wzg.a.putOrderedLong(this, wyl.c, a + 1);
        } else if (a == this.h) {
            return null;
        } else {
            do {
                a3 = wzh.a(objArr, a2);
            } while (a3 == null);
        }
        wzh.a(objArr, a2, null);
        wzg.a.putOrderedLong(this, wyl.c, a + 1);
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
}
