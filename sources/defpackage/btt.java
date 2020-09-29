package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: btt reason: default package */
final class btt implements b, c {
    private final /* synthetic */ btk a;

    private btt(btk btk) {
        this.a = btk;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        this.a.e.a(new btr(this.a));
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.b.lock();
        try {
            if (this.a.a(connectionResult)) {
                this.a.f();
                this.a.e();
            } else {
                this.a.b(connectionResult);
            }
        } finally {
            this.a.b.unlock();
        }
    }

    /* synthetic */ btt(btk btk, byte b) {
        this(btk);
    }
}
