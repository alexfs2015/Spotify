package defpackage;

import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.RecentlyPlayedTracksResponse;

/* renamed from: lus reason: default package */
public final class lus implements wig<RecentlyPlayedTracksLoader> {
    private final wzi<gmm<RecentlyPlayedTracksResponse>> a;

    public static RecentlyPlayedTracksLoader a(gmm<RecentlyPlayedTracksResponse> gmm) {
        return new RecentlyPlayedTracksLoader(gmm);
    }

    public final /* synthetic */ Object get() {
        return new RecentlyPlayedTracksLoader((gmm) this.a.get());
    }
}
