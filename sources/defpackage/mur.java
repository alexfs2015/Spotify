package defpackage;

import com.spotify.music.offline.OfflineError;

/* renamed from: mur reason: default package */
public final class mur {
    final mul a;
    final til b;
    final a c = new $$Lambda$mur$d_VtF8YBMVcEvdItl2EkZUu7fMg(this);

    public mur(mul mul, til til) {
        this.a = mul;
        this.b = til;
    }

    /* access modifiers changed from: private */
    public void a(OfflineError offlineError) {
        if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
            mul mul = this.a;
            if (mul.d != null) {
                mul.d.bf_();
            }
            if (mul.c) {
                mul.c = false;
                mul.b.a(mul.a, false);
            }
        }
    }
}
