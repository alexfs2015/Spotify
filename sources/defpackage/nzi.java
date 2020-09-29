package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: nzi reason: default package */
public final class nzi implements wig<String> {
    private static final nzi a = new nzi();

    public static nzi a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(SpotifyLocale.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
