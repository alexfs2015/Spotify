package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: hcs reason: default package */
public final class hcs implements vua<SpotifyIconDrawable> {
    private final wlc<Context> a;

    private hcs(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static hcs a(wlc<Context> wlc) {
        return new hcs(wlc);
    }

    public final /* synthetic */ Object get() {
        return (SpotifyIconDrawable) vuf.a(new SpotifyIconDrawable((Context) this.a.get(), SpotifyIcon.REFRESH_16), "Cannot return null from a non-@Nullable @Provides method");
    }
}
