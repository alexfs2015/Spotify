package defpackage;

import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;

/* renamed from: qtv reason: default package */
public final class qtv implements wig<gmm<ArtistSearchResponse>> {
    private final wzi<gmn> a;

    private qtv(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static qtv a(wzi<gmn> wzi) {
        return new qtv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(ArtistSearchResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
