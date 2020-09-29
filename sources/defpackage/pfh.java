package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: pfh reason: default package */
public final class pfh implements vua<String> {
    private final wlc<SpSharedPreferences<Object>> a;

    private pfh(wlc<SpSharedPreferences<Object>> wlc) {
        this.a = wlc;
    }

    public static pfh a(wlc<SpSharedPreferences<Object>> wlc) {
        return new pfh(wlc);
    }

    public final /* synthetic */ Object get() {
        String a2 = ((SpSharedPreferences) this.a.get()).a(pgr.b, (String) null);
        if (fax.a(a2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append("T00:00:00");
        return sb.toString();
    }
}
