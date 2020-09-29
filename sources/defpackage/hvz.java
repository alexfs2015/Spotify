package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: hvz reason: default package */
public final class hvz {
    public final wlc<AdRules> a;

    public hvz(wlc<AdRules> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
