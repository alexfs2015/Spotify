package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: pzt reason: default package */
public final class pzt implements wig<pxt> {
    private final wzi<pxw> a;
    private final wzi<pxu> b;
    private final wzi<qbh> c;
    private final wzi<SpSharedPreferences<Object>> d;

    public static pxt a(pxw pxw, pxu pxu, qbh qbh, SpSharedPreferences<Object> spSharedPreferences) {
        return (pxt) wil.a(CC.a(pxw, pxu, qbh, spSharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((pxw) this.a.get(), (pxu) this.b.get(), (qbh) this.c.get(), (SpSharedPreferences) this.d.get());
    }
}
