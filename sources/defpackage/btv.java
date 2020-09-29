package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: btv reason: default package */
public final class btv implements bue {
    private final buf a;

    public btv(buf buf) {
        this.a = buf;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, bsc<?> bsc, boolean z) {
    }

    public final boolean b() {
        return true;
    }

    public final void a() {
        for (f f : this.a.f.values()) {
            f.f();
        }
        this.a.m.c = Collections.emptySet();
    }

    public final <A extends b, R extends bsl, T extends a<R, A>> T a(T t) {
        this.a.m.a.add(t);
        return t;
    }

    public final <A extends b, T extends a<? extends bsl, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void c() {
        buf buf = this.a;
        buf.a.lock();
        try {
            btk btk = new btk(buf, buf.h, buf.i, buf.d, buf.j, buf.a, buf.c);
            buf.k = btk;
            buf.k.a();
            buf.b.signalAll();
        } finally {
            buf.a.unlock();
        }
    }
}
