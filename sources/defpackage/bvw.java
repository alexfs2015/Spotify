package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bvw reason: default package */
final class bvw implements buu {
    private final /* synthetic */ bvt a;

    private bvw(bvt bvt) {
        this.a = bvt;
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            bvt.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.e = connectionResult;
            bvt.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f) {
                this.a.f = false;
                bvt.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.a.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }

    /* synthetic */ bvw(bvt bvt, byte b) {
        this(bvt);
    }
}
