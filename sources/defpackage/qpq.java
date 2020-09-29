package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qpq reason: default package */
public final class qpq implements wig<qpp> {
    private final wzi<szp> a;
    private final wzi<SpSharedPreferences<Object>> b;
    private final wzi<jlr> c;
    private final wzi<jtz> d;

    public static qpp a(szp szp, SpSharedPreferences<Object> spSharedPreferences, jlr jlr, jtz jtz) {
        return new qpp(szp, spSharedPreferences, jlr, jtz);
    }

    public final /* synthetic */ Object get() {
        return new qpp((szp) this.a.get(), (SpSharedPreferences) this.b.get(), (jlr) this.c.get(), (jtz) this.d.get());
    }
}
