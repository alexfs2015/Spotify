package defpackage;

/* renamed from: wyt reason: default package */
public final class wyt<E> extends wyy<E> {
    public wyt(int i) {
        super(i);
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
            wzh.a.putOrderedLong(this, d, j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
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
        wzh.a.putOrderedLong(this, c, j + 1);
        return a2;
    }

    public final E peek() {
        return b(a(this.consumerIndex));
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

    public final boolean isEmpty() {
        return a() == b();
    }

    private long a() {
        return wzh.a.getLongVolatile(this, d);
    }

    private long b() {
        return wzh.a.getLongVolatile(this, c);
    }
}
