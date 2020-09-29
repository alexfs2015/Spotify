package defpackage;

import android.os.Handler;

/* renamed from: tzx reason: default package */
final class tzx {
    Handler a;

    tzx() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(Runnable runnable) {
        ((Handler) fay.a(this.a)).removeCallbacks(runnable);
    }
}
