package defpackage;

import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: hei reason: default package */
public final class hei implements vua<wug> {
    private static final hei a = new hei();

    public static hei a() {
        return a;
    }

    public static wug b() {
        return (wug) vuf.a(vun.a(AndroidSchedulers.a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
