package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: buk reason: default package */
final class buk implements b, c {
    private final /* synthetic */ bub a;

    private buk(bub bub) {
        this.a = bub;
    }

    /* synthetic */ buk(bub bub, byte b) {
        this(bub);
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        this.a.e.a(new bui(this.a));
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
}
