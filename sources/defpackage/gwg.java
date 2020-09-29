package defpackage;

import android.util.SparseIntArray;

/* renamed from: gwg reason: default package */
public final class gwg {
    public final SparseIntArray a = new SparseIntArray();
    public final boolean b;
    private final SparseIntArray c = new SparseIntArray();
    private final SparseIntArray d = new SparseIntArray();
    private final int e;

    public gwg(int i, boolean z) {
        this.e = i;
        this.b = z;
    }

    private int a(b bVar) {
        int a2 = bVar.a();
        return ((a2 + 1) * this.e) / a2;
    }

    public int a(int i, b bVar) {
        if (i == 0) {
            return this.e;
        }
        int i2 = this.c.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        int b2 = this.e - b(i - 1, bVar);
        this.c.put(i, b2);
        return b2;
    }

    public int b(int i, b bVar) {
        if (i == bVar.a() - 1) {
            return this.e;
        }
        int i2 = this.d.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        int a2 = a(bVar) - a(i, bVar);
        this.d.put(i, a2);
        return a2;
    }

    public int c(int i, b bVar) {
        int i2 = this.a.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        int a2 = bVar.a(i);
        this.a.put(i, a2);
        return a2;
    }
}
