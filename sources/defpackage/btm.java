package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: btm reason: default package */
final class btm implements c {
    final boolean a;
    private final WeakReference<btk> b;
    private final bsc<?> c;

    public btm(btk btk, bsc<?> bsc, boolean z) {
        this.b = new WeakReference<>(btk);
        this.c = bsc;
        this.a = z;
    }

    public final void a(ConnectionResult connectionResult) {
        btk btk = (btk) this.b.get();
        if (btk != null) {
            bwx.a(Looper.myLooper() == btk.a.m.c(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            btk.b.lock();
            try {
                if (btk.b(0)) {
                    if (!connectionResult.b()) {
                        btk.b(connectionResult, this.c, this.a);
                    }
                    if (btk.d()) {
                        btk.e();
                    }
                    btk.b.unlock();
                }
            } finally {
                btk.b.unlock();
            }
        }
    }
}
