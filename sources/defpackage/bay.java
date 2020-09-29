package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bay reason: default package */
final class bay implements bac {
    private final azz[] a;
    private final long[] b;

    public bay(azz[] azzArr, long[] jArr) {
        this.a = azzArr;
        this.b = jArr;
    }

    public final int a(long j) {
        int b2 = ben.b(this.b, j, false, false);
        if (b2 < this.b.length) {
            return b2;
        }
        return -1;
    }

    public final int b() {
        return this.b.length;
    }

    public final List<azz> b(long j) {
        int a2 = ben.a(this.b, j, true, false);
        if (a2 != -1) {
            azz[] azzArr = this.a;
            if (azzArr[a2] != null) {
                return Collections.singletonList(azzArr[a2]);
            }
        }
        return Collections.emptyList();
    }

    public final long b_(int i) {
        boolean z = true;
        bdl.a(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        bdl.a(z);
        return this.b[i];
    }
}
