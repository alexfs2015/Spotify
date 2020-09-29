package defpackage;

import com.spotify.music.libs.mediabrowserservice.MediaSessionCallbackResolver;

/* renamed from: rtq reason: default package */
public final class rtq implements vua<rtp> {
    private final wlc<MediaSessionCallbackResolver> a;

    private rtq(wlc<MediaSessionCallbackResolver> wlc) {
        this.a = wlc;
    }

    public static rtq a(wlc<MediaSessionCallbackResolver> wlc) {
        return new rtq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rtp((MediaSessionCallbackResolver) this.a.get());
    }
}
