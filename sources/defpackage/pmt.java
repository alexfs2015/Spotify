package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: pmt reason: default package */
public final class pmt implements wig<String> {
    private final wzi<SpSharedPreferences<Object>> a;

    private pmt(wzi<SpSharedPreferences<Object>> wzi) {
        this.a = wzi;
    }

    public static pmt a(wzi<SpSharedPreferences<Object>> wzi) {
        return new pmt(wzi);
    }

    public final /* synthetic */ Object get() {
        String a2 = ((SpSharedPreferences) this.a.get()).a(pns.b, (String) null);
        if (fbo.a(a2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append("T00:00:00");
        return sb.toString();
    }
}
