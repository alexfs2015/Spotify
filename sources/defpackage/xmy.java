package defpackage;

/* renamed from: xmy reason: default package */
public final class xmy<E> extends xnd<E> {
    public xmy(int i) {
        super(i);
    }

    private long a() {
        return xnm.a.getLongVolatile(this, d);
    }

    private long b() {
        return xnm.a.getLongVolatile(this, c);
    }

    public final boolean isEmpty() {
        return a() == b();
    }

    public final boolean offer(E e) {
        if (e != null) {
            Object[] objArr = this.b;
            long j = this.producerIndex;
            long a = a(j);
            if (a(objArr, a) != null) {
                return false;
            }
            a(objArr, a, e);
            xnm.a.putOrderedLong(this, d, j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final E peek() {
        return b(a(this.consumerIndex));
    }

    public final E poll() {
        long j = this.consumerIndex;
        long a = a(j);
        Object[] objArr = this.b;
        E a2 = a(objArr, a);
        if (a2 == null) {
            return null;
        }
        a(objArr, a, null);
        xnm.a.putOrderedLong(this, c, j + 1);
        return a2;
    }

    public final int size() {
        long b = b();
        while (true) {
            long a = a();
            long b2 = b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }
}
