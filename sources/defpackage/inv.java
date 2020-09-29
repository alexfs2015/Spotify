package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.apis.RecommendedPlaylists.Response;

/* renamed from: inv reason: default package */
public final class inv implements wig<gmm<Response>> {
    private final wzi<gmn> a;

    private inv(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static inv a(wzi<gmn> wzi) {
        return new inv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(Response.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
