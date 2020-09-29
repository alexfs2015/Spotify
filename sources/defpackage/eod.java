package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: eod reason: default package */
final class eod extends emh<Long> implements ent<Long>, eoz, RandomAccess {
    private long[] b;
    private int c;

    static {
        new eod().a = false;
    }

    eod() {
        this(new long[10], 0);
    }

    private eod(long[] jArr, int i) {
        this.b = jArr;
        this.c = i;
    }

    private final void a(int i, long j) {
        c();
        if (i >= 0) {
            int i2 = this.c;
            if (i <= i2) {
                long[] jArr = this.b;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.b, i, jArr2, i + 1, this.c - i);
                    this.b = jArr2;
                }
                this.b[i] = j;
                this.c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(d(i));
    }

    private final void c(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    private final String d(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ ent a(int i) {
        if (i >= this.c) {
            return new eod(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    public final void a(long j) {
        a(this.c, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        enp.a(collection);
        if (!(collection instanceof eod)) {
            return super.addAll(collection);
        }
        eod eod = (eod) collection;
        int i = eod.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.b;
            if (i3 > jArr.length) {
                this.b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(eod.b, 0, this.b, this.c, eod.c);
            this.c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i) {
        c(i);
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eod)) {
            return super.equals(obj);
        }
        eod eod = (eod) obj;
        if (this.c != eod.c) {
            return false;
        }
        long[] jArr = eod.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + enp.a(this.b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Long.valueOf(this.b[i]))) {
                long[] jArr = this.b;
                System.arraycopy(jArr, i + 1, jArr, i, this.c - i);
                this.c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            long[] jArr = this.b;
            System.arraycopy(jArr, i2, jArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.c;
    }
}
