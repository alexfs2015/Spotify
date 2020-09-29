package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dda reason: default package */
final class dda extends dck<Double> implements ddu<Double>, RandomAccess {
    private double[] b;
    private int c;

    static {
        new dda().a = false;
    }

    dda() {
        this(new double[10], 0);
    }

    private dda(double[] dArr, int i) {
        this.b = dArr;
        this.c = i;
    }

    private final void a(int i, double d) {
        c();
        if (i >= 0) {
            int i2 = this.c;
            if (i <= i2) {
                double[] dArr = this.b;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.b, i, dArr2, i + 1, this.c - i);
                    this.b = dArr2;
                }
                this.b[i] = d;
                this.c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(c(i));
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ ddu a(int i) {
        if (i >= this.c) {
            return new dda(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    public final void a(double d) {
        a(this.c, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        ddr.a(collection);
        if (!(collection instanceof dda)) {
            return super.addAll(collection);
        }
        dda dda = (dda) collection;
        int i = dda.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.b;
            if (i3 > dArr.length) {
                this.b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(dda.b, 0, this.b, this.c, dda.c);
            this.c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dda)) {
            return super.equals(obj);
        }
        dda dda = (dda) obj;
        if (this.c != dda.c) {
            return false;
        }
        double[] dArr = dda.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + ddr.a(Double.doubleToLongBits(this.b[i2]));
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        double[] dArr = this.b;
        double d = dArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Double.valueOf(this.b[i]))) {
                double[] dArr = this.b;
                System.arraycopy(dArr, i + 1, dArr, i, this.c - i);
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
            double[] dArr = this.b;
            System.arraycopy(dArr, i2, dArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        b(i);
        double[] dArr = this.b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.c;
    }
}
