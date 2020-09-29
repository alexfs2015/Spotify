package defpackage;

import android.util.Log;

/* renamed from: fht reason: default package */
final class fht implements Runnable {
    private final /* synthetic */ fhq a;
    private final /* synthetic */ fhs b;

    fht(fhs fhs, fhq fhq) {
        this.b = fhs;
        this.a = fhq;
    }

    public final void run() {
        Log.isLoggable("EnhancedIntentService", 3);
        this.b.a.b(this.a.a);
        this.a.a();
    }
}
