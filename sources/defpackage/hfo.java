package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: hfo reason: default package */
public final class hfo implements wig<SpotifyIconDrawable> {
    private final wzi<Context> a;

    private hfo(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static hfo a(wzi<Context> wzi) {
        return new hfo(wzi);
    }

    public final /* synthetic */ Object get() {
        return (SpotifyIconDrawable) wil.a(new SpotifyIconDrawable((Context) this.a.get(), SpotifyIcon.REFRESH_16), "Cannot return null from a non-@Nullable @Provides method");
    }
}
