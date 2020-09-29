package defpackage;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: bwp reason: default package */
public final class bwp {
    public final SparseIntArray a;
    private bry b;

    public bwp() {
        this(brx.a());
    }

    public bwp(bry bry) {
        this.a = new SparseIntArray();
        bwx.a(bry);
        this.b = bry;
    }

    public final int a(Context context, f fVar) {
        bwx.a(context);
        bwx.a(fVar);
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
