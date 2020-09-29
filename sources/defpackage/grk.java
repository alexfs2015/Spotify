package defpackage;

import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;

/* renamed from: grk reason: default package */
public final class grk implements vua<DiscoveryConfiguration> {
    private final wlc<mfe> a;

    private grk(wlc<mfe> wlc) {
        this.a = wlc;
    }

    public static grk a(wlc<mfe> wlc) {
        return new grk(wlc);
    }

    public final /* synthetic */ Object get() {
        return (DiscoveryConfiguration) vuf.a(((mfe) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
