package defpackage;

import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: hhe reason: default package */
public final class hhe implements wig<xil> {
    private static final hhe a = new hhe();

    public static hhe a() {
        return a;
    }

    public static xil b() {
        return (xil) wil.a(wit.a(AndroidSchedulers.a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
