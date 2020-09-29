package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: iof reason: default package */
public final class iof implements wig<ioe> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<rwl> b;

    private iof(wzi<SpSharedPreferences<Object>> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static iof a(wzi<SpSharedPreferences<Object>> wzi, wzi<rwl> wzi2) {
        return new iof(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ioe((SpSharedPreferences) this.a.get(), (rwl) this.b.get());
    }
}
