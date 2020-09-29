package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bwn reason: default package */
final class bwn implements bvl {
    private final /* synthetic */ bwk a;

    private bwn(bwk bwk) {
        this.a = bwk;
    }

    /* synthetic */ bwn(bwk bwk, byte b) {
        this(bwk);
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            if (this.a.f) {
                this.a.f = false;
                bwk.a(this.a, i, z);
                return;
            }
            this.a.f = true;
            this.a.a.a(i);
            this.a.g.unlock();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            bwk.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.e = connectionResult;
            bwk.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
