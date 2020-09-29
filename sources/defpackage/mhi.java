package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: mhi reason: default package */
public final class mhi implements wig<mhe> {
    private final wzi<hgz> a;
    private final wzi<SpSharedPreferences<Object>> b;
    private final wzi<hhc> c;
    private final wzi<jtz> d;

    private mhi(wzi<hgz> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<hhc> wzi3, wzi<jtz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mhi a(wzi<hgz> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<hhc> wzi3, wzi<jtz> wzi4) {
        return new mhi(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mhe((hgz) this.a.get(), (SpSharedPreferences) this.b.get(), (hhc) this.c.get(), (jtz) this.d.get());
    }
}
