package defpackage;

import android.util.Log;

/* renamed from: fgz reason: default package */
final class fgz implements Runnable {
    private final /* synthetic */ fgw a;
    private final /* synthetic */ fgy b;

    fgz(fgy fgy, fgw fgw) {
        this.b = fgy;
        this.a = fgw;
    }

    public final void run() {
        Log.isLoggable("EnhancedIntentService", 3);
        this.b.a.b(this.a.a);
        this.a.a();
    }
}
