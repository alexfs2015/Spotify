package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.bst.d;

/* renamed from: bvh reason: default package */
public final class bvh<O extends d> extends btx {
    private final bsx<O> a;

    public bvh(bsx<O> bsx) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.a = bsx;
    }

    public final <A extends b, R extends btc, T extends a<R, A>> T a(T t) {
        return this.a.a(t);
    }

    public final Context b() {
        return this.a.a;
    }

    public final <A extends b, T extends a<? extends btc, A>> T b(T t) {
        return this.a.b(t);
    }

    public final Looper c() {
        return this.a.e;
    }
}
