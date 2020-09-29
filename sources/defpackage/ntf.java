package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: ntf reason: default package */
public final class ntf implements vua<String> {
    private static final ntf a = new ntf();

    public static ntf a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(SpotifyLocale.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
