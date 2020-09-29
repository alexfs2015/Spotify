package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: fka reason: default package */
public final class fka extends fjz<Boolean> implements a, RandomAccess {
    private static final fka b;
    private boolean[] c;
    private int d;

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Boolean) obj).booleanValue());
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        d(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    static {
        fka fka = new fka();
        b = fka;
        fka.a = false;
    }

    public static fka d() {
        return b;
    }

    fka() {
        this(new boolean[10], 0);
    }

    private fka(boolean[] zArr, int i) {
        this.c = zArr;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fka)) {
            return super.equals(obj);
        }
        fka fka = (fka) obj;
        if (this.d != fka.d) {
            return false;
        }
        boolean[] zArr = fka.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + fki.a(this.c[i2]);
        }
        return i;
    }

    /* renamed from: a */
    public final a c(int i) {
        if (i >= this.d) {
            return new fka(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean b(int i) {
        d(i);
        return this.c[i];
    }

    public final int size() {
        return this.d;
    }

    public final void a(boolean z) {
        a(this.d, z);
    }

    private void a(int i, boolean z) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                boolean[] zArr = this.c;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.c, i, zArr2, i + 1, this.d - i);
                    this.c = zArr2;
                }
                this.c[i] = z;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(e(i));
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        if (collection == null) {
            throw new NullPointerException();
        } else if (!(collection instanceof fka)) {
            return super.addAll(collection);
        } else {
            fka fka = (fka) collection;
            int i = fka.d;
            if (i == 0) {
                return false;
            }
            int i2 = this.d;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                boolean[] zArr = this.c;
                if (i3 > zArr.length) {
                    this.c = Arrays.copyOf(zArr, i3);
                }
                System.arraycopy(fka.c, 0, this.c, this.d, fka.d);
                this.d = i3;
                this.modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Boolean.valueOf(this.c[i]))) {
                boolean[] zArr = this.c;
                System.arraycopy(zArr, i + 1, zArr, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private void d(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private String e(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.d);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        d(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        System.arraycopy(zArr, i + 1, zArr, i, this.d - i);
        this.d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object get(int i) {
        return Boolean.valueOf(b(i));
    }
}
