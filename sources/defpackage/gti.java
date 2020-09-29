package defpackage;

import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import com.spotify.music.features.connect.cast.discovery.DiscoveryTechnology;

/* renamed from: gti reason: default package */
public final class gti implements wig<String> {
    private final wzi<DiscoveryConfiguration> a;

    private gti(wzi<DiscoveryConfiguration> wzi) {
        this.a = wzi;
    }

    public static gti a(wzi<DiscoveryConfiguration> wzi) {
        return new gti(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((DiscoveryConfiguration) this.a.get()).c(DiscoveryTechnology.a).a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
