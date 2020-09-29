package defpackage;

/* renamed from: xmq reason: default package */
public final class xmq<E> extends xmu<E> {
    public xmq(int i) {
        super(i);
    }

    public final boolean isEmpty() {
        return this.consumerIndex == this.producerIndex;
    }

    public final boolean offer(E e) {
        if (e != null) {
            Object[] objArr = this.b;
            long j = this.a;
            long j2 = this.producerIndex;
            long a = a(j2);
            if (a(objArr, a) == null) {
                xnm.a.putObject(objArr, a, e);
                c(j2 + 1);
            } else if (j2 - this.consumerIndex > j) {
                return false;
            } else {
                do {
                } while (a(objArr, a) != null);
            }
            xnm.a.putObject(objArr, a, e);
            c(j2 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final E peek() {
        E b;
        long j = this.c;
        do {
            long j2 = this.consumerIndex;
            if (j2 >= j) {
                long j3 = this.producerIndex;
                if (j2 >= j3) {
                    return null;
                }
                this.c = j3;
            }
            b = b(a(j2));
        } while (b == null);
        return b;
    }

    public final E poll() {
        long j;
        long j2 = this.c;
        do {
            j = this.consumerIndex;
            if (j >= j2) {
                long j3 = this.producerIndex;
                if (j >= j3) {
                    return null;
                }
                this.c = j3;
            }
        } while (!a(j, 1 + j));
        long a = a(j);
        Object[] objArr = this.b;
        E object = xnm.a.getObject(objArr, a);
        a(objArr, a, null);
        return object;
    }

    public final int size() {
        long j = this.consumerIndex;
        while (true) {
            long j2 = this.producerIndex;
            long j3 = this.consumerIndex;
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}
