package defpackage;

import io.reactivex.Flowable;

/* renamed from: pxd reason: default package */
public final class pxd implements vua<Flowable<gzz>> {
    private static final pxd a = new pxd();

    public static pxd a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(Flowable.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
