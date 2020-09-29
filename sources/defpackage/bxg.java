package defpackage;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: bxg reason: default package */
public final class bxg {
    public final SparseIntArray a;
    private bsp b;

    public bxg() {
        this(bso.a());
    }

    public bxg(bsp bsp) {
        this.a = new SparseIntArray();
        bxo.a(bsp);
        this.b = bsp;
    }

    public final int a(Context context, f fVar) {
        bxo.a(context);
        bxo.a(fVar);
        int e = fVar.e();
        int i = this.a.get(e, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                break;
            }
            int keyAt = this.a.keyAt(i2);
            if (keyAt > e && this.a.get(keyAt) == 0) {
                i = 0;
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.b.b(context, e);
        }
        this.a.put(e, i);
        return i;
    }
}
