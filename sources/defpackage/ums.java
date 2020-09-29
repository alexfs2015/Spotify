package defpackage;

import android.os.Handler;

/* renamed from: ums reason: default package */
final class ums {
    Handler a;

    ums() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(Runnable runnable) {
        ((Handler) fbp.a(this.a)).removeCallbacks(runnable);
    }
}
