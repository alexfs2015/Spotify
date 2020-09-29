package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: fkh reason: default package */
public final class fkh extends fjz<Integer> implements c, RandomAccess {
    private static final fkh b;
    private int[] c;
    private int d;

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        e(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    static {
        fkh fkh = new fkh();
        b = fkh;
        fkh.a = false;
    }

    public static fkh d() {
        return b;
    }

    fkh() {
        this(new int[10], 0);
    }

    private fkh(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkh)) {
            return super.equals(obj);
        }
        fkh fkh = (fkh) obj;
        if (this.d != fkh.d) {
            return false;
        }
        int[] iArr = fkh.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    /* renamed from: a */
    public final c c(int i) {
        if (i >= this.d) {
            return new fkh(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i) {
        e(i);
        return this.c[i];
    }

    public final int size() {
        return this.d;
    }

    public final void d(int i) {
        a(this.d, i);
    }

    private void a(int i, int i2) {
        c();
        if (i >= 0) {
            int i3 = this.d;
            if (i <= i3) {
                int[] iArr = this.c;
                if (i3 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
                } else {
                    int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
                    this.c = iArr2;
                }
                this.c[i] = i2;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        if (collection == null) {
            throw new NullPointerException();
        } else if (!(collection instanceof fkh)) {
            return super.addAll(collection);
        } else {
            fkh fkh = (fkh) collection;
            int i = fkh.d;
            if (i == 0) {
                return false;
            }
            int i2 = this.d;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.c;
                if (i3 > iArr.length) {
                    this.c = Arrays.copyOf(iArr, i3);
                }
                System.arraycopy(fkh.c, 0, this.c, this.d, fkh.d);
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
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                int[] iArr = this.c;
                System.arraycopy(iArr, i + 1, iArr, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private void e(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    private String f(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.d);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        e(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.d - i);
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(b(i));
    }
}
