package defpackage;

import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import com.spotify.music.features.connect.cast.discovery.DiscoveryTechnology;

/* renamed from: grh reason: default package */
public final class grh implements vua<String> {
    private final wlc<DiscoveryConfiguration> a;

    private grh(wlc<DiscoveryConfiguration> wlc) {
        this.a = wlc;
    }

    public static grh a(wlc<DiscoveryConfiguration> wlc) {
        return new grh(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((DiscoveryConfiguration) this.a.get()).c(DiscoveryTechnology.a).a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
