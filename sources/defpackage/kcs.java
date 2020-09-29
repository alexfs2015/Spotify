package defpackage;

import android.os.Handler;
import android.view.Surface;

/* renamed from: kcs reason: default package */
public final class kcs implements bex {
    public final Handler a;
    public boolean b = false;
    /* access modifiers changed from: private */
    public final bex c;

    public kcs(bex bex, Handler handler) {
        this.c = bex;
        this.a = handler;
    }

    public final void a(int i, int i2, int i3, float f) {
        this.c.a(i, i2, i3, f);
    }

    public final void a(int i, long j) {
        this.c.a(i, j);
    }

    public final void a(Surface surface) {
    }

    public final void a(aqv aqv) {
    }

    public final void a(asl asl) {
    }

    public final void a(String str, long j, long j2) {
        this.c.a(str, j, j2);
    }

    public final void b(asl asl) {
    }
}
