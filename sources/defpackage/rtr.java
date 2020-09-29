package defpackage;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.libs.mediabrowserservice.MediaSessionCallbackResolver;

/* renamed from: rtr reason: default package */
public final class rtr implements vua<MediaSessionCallbackResolver> {
    private final wlc<MediaSessionCompat> a;
    private final wlc<rtn> b;

    private rtr(wlc<MediaSessionCompat> wlc, wlc<rtn> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rtr a(wlc<MediaSessionCompat> wlc, wlc<rtn> wlc2) {
        return new rtr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new MediaSessionCallbackResolver((MediaSessionCompat) this.a.get(), (rtn) this.b.get());
    }
}
