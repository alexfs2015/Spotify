package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: vaq reason: default package */
public final class vaq implements wig<vap> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<jtz> b;

    private vaq(wzi<SpSharedPreferences<Object>> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vaq a(wzi<SpSharedPreferences<Object>> wzi, wzi<jtz> wzi2) {
        return new vaq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vap((SpSharedPreferences) this.a.get(), (jtz) this.b.get());
    }
}
