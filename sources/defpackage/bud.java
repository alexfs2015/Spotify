package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: bud reason: default package */
final class bud implements c {
    final boolean a;
    private final WeakReference<bub> b;
    private final bst<?> c;

    public bud(bub bub, bst<?> bst, boolean z) {
        this.b = new WeakReference<>(bub);
        this.c = bst;
        this.a = z;
    }

    public final void a(ConnectionResult connectionResult) {
        bub bub = (bub) this.b.get();
        if (bub != null) {
            bxo.a(Looper.myLooper() == bub.a.m.c(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            bub.b.lock();
            try {
                if (bub.b(0)) {
                    if (!connectionResult.b()) {
                        bub.b(connectionResult, this.c, this.a);
                    }
                    if (bub.d()) {
                        bub.e();
                    }
                    bub.b.unlock();
                }
            } finally {
                bub.b.unlock();
            }
        }
    }
}
