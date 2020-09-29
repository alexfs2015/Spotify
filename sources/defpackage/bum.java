package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: bum reason: default package */
public final class bum implements buv {
    private final buw a;

    public bum(buw buw) {
        this.a = buw;
    }

    public final <A extends b, R extends btc, T extends a<R, A>> T a(T t) {
        this.a.m.a.add(t);
        return t;
    }

    public final void a() {
        for (f f : this.a.f.values()) {
            f.f();
        }
        this.a.m.c = Collections.emptySet();
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ConnectionResult connectionResult, bst<?> bst, boolean z) {
    }

    public final <A extends b, T extends a<? extends btc, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        buw buw = this.a;
        buw.a.lock();
        try {
            bub bub = new bub(buw, buw.h, buw.i, buw.d, buw.j, buw.a, buw.c);
            buw.k = bub;
            buw.k.a();
            buw.b.signalAll();
        } finally {
            buw.a.unlock();
        }
    }
}
