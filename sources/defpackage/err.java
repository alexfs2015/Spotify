package defpackage;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;

/* renamed from: err reason: default package */
final class err implements Runnable {
    private final /* synthetic */ ery a;
    private final /* synthetic */ long b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ Context d;
    private final /* synthetic */ eqw e;
    private final /* synthetic */ PendingResult f;

    err(ery ery, long j, Bundle bundle, Context context, eqw eqw, PendingResult pendingResult) {
        this.a = ery;
        this.b = j;
        this.c = bundle;
        this.d = context;
        this.e = eqw;
        this.f = pendingResult;
    }

    public final void run() {
        long a2 = this.a.b().i.a();
        long j = this.b;
        if (a2 > 0 && (j >= a2 || j <= 0)) {
            j = a2 - 1;
        }
        if (j > 0) {
            this.c.putLong("click_timestamp", j);
        }
        this.c.putString("_cis", "referrer broadcast");
        ery.a(this.d, (eqr) null).d().a("auto", "_cmp", this.c);
        this.e.k.a("Install campaign recorded");
        PendingResult pendingResult = this.f;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
