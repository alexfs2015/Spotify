package defpackage;

import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.RecentlyPlayedTracksResponse;

/* renamed from: lqg reason: default package */
public final class lqg implements vua<gky<RecentlyPlayedTracksResponse>> {
    private final wlc<gkz> a;

    public static gky<RecentlyPlayedTracksResponse> a(gkz gkz) {
        return (gky) vuf.a(gkz.a(RecentlyPlayedTracksResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gkz) this.a.get());
    }
}
