package defpackage;

import com.spotify.playlist.endpoints.PlaylistEndpointImpl;

/* renamed from: uxe reason: default package */
public final class uxe implements vua<PlaylistEndpointImpl> {
    private final wlc<uxd> a;

    private uxe(wlc<uxd> wlc) {
        this.a = wlc;
    }

    public static uxe a(wlc<uxd> wlc) {
        return new uxe(wlc);
    }

    public static PlaylistEndpointImpl a(Object obj) {
        return new PlaylistEndpointImpl((uxd) obj);
    }

    public final /* synthetic */ Object get() {
        return new PlaylistEndpointImpl((uxd) this.a.get());
    }
}
