package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: ijs reason: default package */
public final class ijs implements wig<ijr> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<jxz> b;
    private final wzi<hzx> c;

    private ijs(wzi<SpSharedPreferences<Object>> wzi, wzi<jxz> wzi2, wzi<hzx> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ijs a(wzi<SpSharedPreferences<Object>> wzi, wzi<jxz> wzi2, wzi<hzx> wzi3) {
        return new ijs(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ijr((SpSharedPreferences) this.a.get(), (jxz) this.b.get(), (hzx) this.c.get());
    }
}
