package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules;

/* renamed from: hyl reason: default package */
public final class hyl {
    public final wzi<AdRules> a;

    public hyl(wzi<AdRules> wzi) {
        this.a = (wzi) a(wzi, 1);
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
