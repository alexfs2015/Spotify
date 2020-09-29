package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: sbu reason: default package */
public final class sbu implements wig<sbt> {
    private final wzi<sbx> a;
    private final wzi<SpSharedPreferences<Object>> b;

    private sbu(wzi<sbx> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sbu a(wzi<sbx> wzi, wzi<SpSharedPreferences<Object>> wzi2) {
        return new sbu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sbt((sbx) this.a.get(), (SpSharedPreferences) this.b.get());
    }
}
