package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: baf reason: default package */
final class baf implements azl {
    private final azi[] a;
    private final long[] b;

    public baf(azi[] aziArr, long[] jArr) {
        this.a = aziArr;
        this.b = jArr;
    }

    public final int a(long j) {
        int b2 = bdw.b(this.b, j, false, false);
        if (b2 < this.b.length) {
            return b2;
        }
        return -1;
    }

    public final int b() {
        return this.b.length;
    }

    public final long b_(int i) {
        boolean z = true;
        bcu.a(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        bcu.a(z);
        return this.b[i];
    }

    public final List<azi> b(long j) {
        int a2 = bdw.a(this.b, j, true, false);
        if (a2 != -1) {
            azi[] aziArr = this.a;
            if (aziArr[a2] != null) {
                return Collections.singletonList(aziArr[a2]);
            }
        }
        return Collections.emptyList();
    }
}
