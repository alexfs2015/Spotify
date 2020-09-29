package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: qfs reason: default package */
public final class qfs implements wig<String> {
    private static final qfs a = new qfs();

    public static qfs a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(SpotifyLocale.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
