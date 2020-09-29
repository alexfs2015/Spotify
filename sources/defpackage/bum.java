package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: bum reason: default package */
final class bum implements Runnable {
    private final /* synthetic */ ConnectionResult a;
    private final /* synthetic */ a b;

    bum(a aVar, ConnectionResult connectionResult) {
        this.b = aVar;
        this.a = connectionResult;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
