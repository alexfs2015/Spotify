package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;

/* renamed from: qlm reason: default package */
public final class qlm implements vua<gky<ArtistSearchResponse>> {
    private final wlc<gkz> a;

    private qlm(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static qlm a(wlc<gkz> wlc) {
        return new qlm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(ArtistSearchResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
