package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* renamed from: uid reason: default package */
public final class uid implements uic {
    private uik a;
    private final jvr b;
    private final uia c;

    uid(uia uia, jvr jvr) {
        this.b = jvr;
        this.c = uia;
    }

    public final void a(uik uik) {
        this.a = uik;
    }

    public final void a(Activity activity) {
        String str = "android.permission.CAMERA";
        if (this.b.a((Context) activity, str)) {
            this.a.c(-1);
            return;
        }
        this.b.a(activity, str);
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

    public final void a() {
        this.a.c(0);
    }

    public final void a(int i) {
        if (i == -1) {
            uia uia = this.c;
            jjf jjf = uia.b;
            bg bgVar = r3;
            bg bgVar2 = new bg(null, uia.c, null, 0, 0, uia.a, "tap-camera-onboarding", "complete-camera-onboarding", (double) jrf.a.a());
            jjf.a(bgVar);
            return;
        }
    }
}
