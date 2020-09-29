package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: kar reason: default package */
public final class kar implements jyc {
    private final WeakReference<apz> a;

    public kar(apz apz) {
        this.a = new WeakReference<>(apz);
    }

    public final void a(long[] jArr, a aVar) {
        a(jArr, true, aVar);
    }

    public final void a(int i, long j, a aVar) {
        if (((apz) this.a.get()) != null) {
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

    private void a(long[] jArr, boolean z, a aVar) {
        apz apz = (apz) this.a.get();
        if (apz != null) {
            for (long j : jArr) {
                if (j >= 0) {
                    aqn a2 = apz.a((b) new $$Lambda$kar$dWU1rEOoLXwg4kBB8TkDwm5t8Tw(aVar, j));
                    a2.a(z);
                    a2.a(j);
                    a2.a();
                }
            }
        }
    }
}
