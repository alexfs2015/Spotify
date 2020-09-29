package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: bvq reason: default package */
final class bvq implements Runnable {
    private final /* synthetic */ bvp a;

    bvq(bvp bvp) {
        this.a = bvp;
    }

    public final void run() {
        this.a.h.b(new ConnectionResult(4));
    }
}
