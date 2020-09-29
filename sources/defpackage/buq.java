package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.bsc.d;

/* renamed from: buq reason: default package */
public final class buq<O extends d> extends btg {
    private final bsg<O> a;

    public buq(bsg<O> bsg) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.a = bsg;
    }

    public final <A extends b, R extends bsl, T extends a<R, A>> T a(T t) {
        return this.a.a(t);
    }

    public final <A extends b, T extends a<? extends bsl, A>> T b(T t) {
        return this.a.b(t);
    }

    public final Looper c() {
        return this.a.e;
    }

    public final Context b() {
        return this.a.a;
    }
}
