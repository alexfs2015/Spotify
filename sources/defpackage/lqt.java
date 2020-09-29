package defpackage;

import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.RecentlyPlayedTracksResponse;

/* renamed from: lqt reason: default package */
public final class lqt implements vua<RecentlyPlayedTracksLoader> {
    private final wlc<gky<RecentlyPlayedTracksResponse>> a;

    public static RecentlyPlayedTracksLoader a(gky<RecentlyPlayedTracksResponse> gky) {
        return new RecentlyPlayedTracksLoader(gky);
    }

    public final /* synthetic */ Object get() {
        return new RecentlyPlayedTracksLoader((gky) this.a.get());
    }
}
