package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bvv reason: default package */
final class bvv implements buu {
    private final /* synthetic */ bvt a;

    private bvv(bvt bvt) {
        this.a = bvt;
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            bvt bvt = this.a;
            if (bvt.c == null) {
                bvt.c = bundle;
            } else if (bundle != null) {
                bvt.c.putAll(bundle);
            }
            this.a.d = ConnectionResult.a;
            bvt.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.d = connectionResult;
            bvt.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (!this.a.f && this.a.e != null) {
                if (this.a.e.b()) {
                    this.a.f = true;
                    this.a.b.a(i);
                    this.a.g.unlock();
                    return;
                }
            }
            this.a.f = false;
            bvt.a(this.a, i, z);
        } finally {
            this.a.g.unlock();
        }
    }

    /* synthetic */ bvv(bvt bvt, byte b) {
        this(bvt);
    }
}
