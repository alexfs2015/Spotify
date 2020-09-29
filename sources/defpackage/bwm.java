package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bwm reason: default package */
final class bwm implements bvl {
    private final /* synthetic */ bwk a;

    private bwm(bwk bwk) {
        this.a = bwk;
    }

    /* synthetic */ bwm(bwk bwk, byte b) {
        this(bwk);
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
            bwk.a(this.a, i, z);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            bwk bwk = this.a;
            if (bwk.c == null) {
                bwk.c = bundle;
            } else if (bundle != null) {
                bwk.c.putAll(bundle);
            }
            this.a.d = ConnectionResult.a;
            bwk.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.d = connectionResult;
            bwk.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
