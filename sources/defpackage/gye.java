package defpackage;

import com.spotify.mobile.android.hubframework.defaults.fallbacks.SpotifyHubsFallbackUsageReporter;

/* renamed from: gye reason: default package */
final class gye implements a {
    private final SpotifyHubsFallbackUsageReporter a;

    gye(a aVar) {
        this.a = new SpotifyHubsFallbackUsageReporter(aVar);
    }

    public final void a(gzt gzt, int i) {
        if (i != 0) {
            SpotifyHubsFallbackUsageReporter spotifyHubsFallbackUsageReporter = this.a;
            StringBuilder sb = new StringBuilder("Using fallback binder for category ");
            sb.append(gzt.componentId().category());
            spotifyHubsFallbackUsageReporter.a(sb.toString(), gzt);
        }
    }
}
