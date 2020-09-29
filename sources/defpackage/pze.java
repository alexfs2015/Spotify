package defpackage;

/* renamed from: pze reason: default package */
public final class pze implements a, b {
    private final pzg a;
    private final ryy b;

    public pze(pzg pzg, ryy ryy) {
        this.a = pzg;
        this.b = ryy;
    }

    public final void a(gzz gzz, String str, String str2) {
        if (!a(gzz)) {
            boolean z = true;
            if (b(gzz) && fax.a(str) && !fax.a(str2)) {
                this.a.a();
                return;
            }
            if ((!b(gzz) && !qbw.c(gzz)) || !fax.a(str2)) {
                z = false;
            }
            if (z) {
                this.a.b();
            }
        }
    }

    public final void a(gzz gzz, gzz gzz2) {
        if (!a(gzz)) {
            if (b(gzz) || qbw.c(gzz)) {
                if (a(gzz2)) {
                    this.a.c();
                } else if (qbw.a(gzz2)) {
                    this.a.d();
                } else if (!b(gzz2) && !qbw.c(gzz2)) {
                    this.a.e();
                }
            }
        }
    }

    private static boolean a(gzz gzz) {
        return gzz != null && gzz.custom().boolValue("isOnlineResults", false);
    }

    private boolean b(gzz gzz) {
        return gzz == null || c(gzz) || qbw.b(gzz);
    }

    private boolean c(gzz gzz) {
        return gzz != null && this.b.a(gzz);
    }
}
