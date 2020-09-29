package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: pyw reason: default package */
public final class pyw implements wig<pyt> {
    private final wzi<gix> a;
    private final wzi<SpSharedPreferences<Object>> b;
    private final wzi<juc> c;
    private final wzi<pyu> d;

    private pyw(wzi<gix> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<juc> wzi3, wzi<pyu> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pyw a(wzi<gix> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<juc> wzi3, wzi<pyu> wzi4) {
        return new pyw(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pyt((gix) this.a.get(), (SpSharedPreferences) this.b.get(), (juc) this.c.get(), (pyu) this.d.get());
    }
}
