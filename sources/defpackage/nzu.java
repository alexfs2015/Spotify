package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: nzu reason: default package */
public final class nzu {
    private final nzo a;
    private final nze b;
    private final jry c;
    private final nzx d;
    private final vhb e;
    private final nzv f;

    public nzu(nzv nzv, nzo nzo, nze nze, jry jry, nzx nzx, vhb vhb) {
        this.f = nzv;
        this.a = nzo;
        this.b = nze;
        this.c = jry;
        this.d = nzx;
        this.e = vhb;
    }

    public final wuh<Boolean> a() {
        boolean z;
        nzv nzv = this.f;
        String str = "setup needs to be called first";
        if (nzv.d.b()) {
            boolean z2 = false;
            if (((SpSharedPreferences) nzv.d.c()).a(nzv.c, true) && this.e.a() && this.a.c() && this.c.a()) {
                nzx nzx = this.d;
                nzv nzv2 = nzx.a;
                if (nzv2.d.b()) {
                    long a2 = ((SpSharedPreferences) nzv2.d.c()).a(nzv.a, 0);
                    int a3 = nzx.a.a();
                    if (a3 != 0 && (a3 > 2 || a2 + nzx.c[a3 - 1] >= nzx.b.a())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        z2 = true;
                    }
                } else {
                    throw new RuntimeException(str);
                }
            }
            if (!z2) {
                return wxt.a(Boolean.FALSE);
            }
            wuh c2 = this.b.a(this.a.d()).c($$Lambda$nzu$Pb6CxYteZeSU5tUZFOwXcnjhokQ.INSTANCE);
            nzv nzv3 = this.f;
            nzv3.getClass();
            return c2.a((wun<? super T>) new $$Lambda$C4_rxSoOTbAOz7Jh2ypME3CoG1o<Object>(nzv3));
        }
        throw new RuntimeException(str);
    }
}
