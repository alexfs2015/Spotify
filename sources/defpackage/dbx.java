package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dbx reason: default package */
final class dbx extends dbt<Boolean> implements ddd<Boolean>, RandomAccess {
    private boolean[] b;
    private int c;

    dbx() {
        this(new boolean[10], 0);
    }

    private dbx(boolean[] zArr, int i) {
        this.b = zArr;
        this.c = i;
    }

    private final void a(int i, boolean z) {
        c();
        if (i >= 0) {
            int i2 = this.c;
            if (i <= i2) {
                boolean[] zArr = this.b;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.b, i, zArr2, i + 1, this.c - i);
                    this.b = zArr2;
                }
                this.b[i] = z;
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

    public final /* synthetic */ ddd a(int i) {
        if (i >= this.c) {
            return new dbx(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    public final void a(boolean z) {
        a(this.c, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        dda.a(collection);
        if (!(collection instanceof dbx)) {
            return super.addAll(collection);
        }
        dbx dbx = (dbx) collection;
        int i = dbx.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.b;
            if (i3 > zArr.length) {
                this.b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(dbx.b, 0, this.b, this.c, dbx.c);
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
        if (!(obj instanceof dbx)) {
            return super.equals(obj);
        }
        dbx dbx = (dbx) obj;
        if (this.c != dbx.c) {
            return false;
        }
        boolean[] zArr = dbx.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        b(i);
        return Boolean.valueOf(this.b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + dda.a(this.b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Boolean.valueOf(this.b[i]))) {
                boolean[] zArr = this.b;
                System.arraycopy(zArr, i + 1, zArr, i, this.c - i);
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
            boolean[] zArr = this.b;
            System.arraycopy(zArr, i2, zArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        b(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.c;
    }

    static {
        new dbx().a = false;
    }
}
