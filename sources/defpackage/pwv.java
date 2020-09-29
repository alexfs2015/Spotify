package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: pwv reason: default package */
public final class pwv implements vua<String> {
    private static final pwv a = new pwv();

    public static pwv a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(SpotifyLocale.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
