package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* renamed from: utr reason: default package */
public final class utr implements utq {
    private uty a;
    private final jxz b;
    private final uto c;

    utr(uto uto, jxz jxz) {
        this.b = jxz;
        this.c = uto;
    }

    public final void a() {
        this.a.c(0);
    }

    public final void a(int i) {
        if (i == -1) {
            uto uto = this.c;
            jlr jlr = uto.b;
            bf bfVar = r3;
            bf bfVar2 = new bf(null, uto.c, null, 0, 0, uto.a, "tap-camera-onboarding", "complete-camera-onboarding", (double) jtp.a.a());
            jlr.a(bfVar);
            return;
        }
    }

    public final void a(int i, Intent intent) {
        if (i == 4660) {
            if (this.b.a(intent).a("android.permission.CAMERA")) {
                this.c.a(true);
                this.a.c(-1);
                return;
            }
            this.c.a(false);
        }
    }

    public final void a(Activity activity) {
        String str = "android.permission.CAMERA";
        if (this.b.a((Context) activity, str)) {
            this.a.c(-1);
            return;
        }
        this.b.a(activity, str);
    }

    public final void a(uty uty) {
        this.a = uty;
    }
}
