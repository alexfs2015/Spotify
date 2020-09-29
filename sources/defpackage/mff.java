package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration.FeatureFlagOverrideValue;
import com.spotify.music.features.connect.cast.discovery.DiscoveryTechnology;

/* renamed from: mff reason: default package */
public final class mff implements mfe {
    private final mfi a;

    private static boolean c() {
        return false;
    }

    public mff(mfi mfi) {
        this.a = mfi;
    }

    public final DiscoveryConfiguration a() {
        if (this.a.a()) {
            Optional b = this.a.b();
            if (b.b()) {
                DiscoveryConfiguration discoveryConfiguration = (DiscoveryConfiguration) b.c();
                DiscoveryConfiguration b2 = b();
                b2.b.putAll(discoveryConfiguration.b);
                b2.a.putAll(discoveryConfiguration.a);
                discoveryConfiguration.b.clear();
                discoveryConfiguration.a.clear();
                discoveryConfiguration.b.putAll(b2.b);
                discoveryConfiguration.a.putAll(b2.a);
                return discoveryConfiguration;
            }
        }
        return b();
    }

    private static DiscoveryConfiguration b() {
        DiscoveryTechnology[] discoveryTechnologyArr;
        DiscoveryConfiguration discoveryConfiguration = new DiscoveryConfiguration();
        for (DiscoveryTechnology discoveryTechnology : DiscoveryTechnology.b) {
            discoveryConfiguration.a.put(discoveryTechnology, FeatureFlagOverrideValue.a);
            if (!c() || DiscoveryConfiguration.b(discoveryTechnology).isEmpty()) {
                discoveryConfiguration.b.put(discoveryTechnology, DiscoveryConfiguration.a(discoveryTechnology));
            } else {
                discoveryConfiguration.b.put(discoveryTechnology, DiscoveryConfiguration.b(discoveryTechnology).get(0));
            }
        }
        return discoveryConfiguration;
    }
}
