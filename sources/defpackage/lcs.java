package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: lcs reason: default package */
public final class lcs implements vua<String> {
    static {
        new lcs();
    }

    public static String a() {
        return (String) vuf.a(SpotifyLocale.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
