package defpackage;

/* renamed from: wyl reason: default package */
public final class wyl<E> extends wyp<E> {
    public wyl(int i) {
        super(i);
    }

    public final boolean offer(E e) {
        if (e != null) {
            Object[] objArr = this.b;
            long j = this.a;
            long j2 = this.producerIndex;
            long a = a(j2);
            if (a(objArr, a) == null) {
                wzh.a.putObject(objArr, a, e);
                c(j2 + 1);
            } else if (j2 - this.consumerIndex > j) {
                return false;
            } else {
                do {
                } while (a(objArr, a) != null);
            }
            wzh.a.putObject(objArr, a, e);
            c(j2 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
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
        E object = wzh.a.getObject(objArr, a);
        a(objArr, a, null);
        return object;
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

    public final boolean isEmpty() {
        return this.consumerIndex == this.producerIndex;
    }
}
