package defpackage;

/* renamed from: qic reason: default package */
public final class qic implements a, b {
    private final qie a;
    private final sim b;

    public qic(qie qie, sim sim) {
        this.a = qie;
        this.b = sim;
    }

    private static boolean a(hcs hcs) {
        return hcs != null && hcs.custom().boolValue("isOnlineResults", false);
    }

    private boolean b(hcs hcs) {
        return hcs == null || c(hcs) || qkw.b(hcs);
    }

    private boolean c(hcs hcs) {
        return hcs != null && this.b.a(hcs);
    }

    public final void a(hcs hcs, hcs hcs2) {
        if (!a(hcs)) {
            if (b(hcs) || qkw.c(hcs)) {
                if (a(hcs2)) {
                    this.a.c();
                } else if (qkw.a(hcs2)) {
                    this.a.d();
                } else if (!b(hcs2) && !qkw.c(hcs2)) {
                    this.a.e();
                }
            }
        }
    }

    public final void a(hcs hcs, String str, String str2) {
        if (!a(hcs)) {
            boolean z = true;
            if (b(hcs) && fbo.a(str) && !fbo.a(str2)) {
                this.a.a();
                return;
            }
            if ((!b(hcs) && !qkw.c(hcs)) || !fbo.a(str2)) {
                z = false;
            }
            if (z) {
                this.a.b();
            }
        }
    }
}
