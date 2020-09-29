package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: kcr reason: default package */
public final class kcr implements kac {
    private final WeakReference<aqq> a;

    public kcr(aqq aqq) {
        this.a = new WeakReference<>(aqq);
    }

    private void a(long[] jArr, boolean z, a aVar) {
        aqq aqq = (aqq) this.a.get();
        if (aqq != null) {
            for (long j : jArr) {
                if (j >= 0) {
                    are a2 = aqq.a((b) new $$Lambda$kcr$Jfs1IoqEOWJqFiltRnzjk0Ao3I(aVar, j));
                    a2.a(z);
                    a2.a(j);
                    a2.a();
                }
            }
        }
    }

    public final void a(int i, long j, a aVar) {
        if (((aqq) this.a.get()) != null) {
            int i2 = (int) (j / 15000);
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                jArr[i3] = ((long) i4) * 15000;
                i3 = i4;
            }
            a(jArr, false, aVar);
        }
    }

    public final void a(long[] jArr, a aVar) {
        a(jArr, true, aVar);
    }
}
