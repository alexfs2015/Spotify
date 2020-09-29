package defpackage;

import com.spotify.playlist.endpoints.PlaylistEndpointImpl;

/* renamed from: vjg reason: default package */
public final class vjg implements wig<PlaylistEndpointImpl> {
    private final wzi<vjf> a;

    private vjg(wzi<vjf> wzi) {
        this.a = wzi;
    }

    public static PlaylistEndpointImpl a(Object obj) {
        return new PlaylistEndpointImpl((vjf) obj);
    }

    public static vjg a(wzi<vjf> wzi) {
        return new vjg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new PlaylistEndpointImpl((vjf) this.a.get());
    }
}
