package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.apis.RecommendedPlaylists.Response;

/* renamed from: ili reason: default package */
public final class ili implements vua<gky<Response>> {
    private final wlc<gkz> a;

    private ili(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static ili a(wlc<gkz> wlc) {
        return new ili(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(Response.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
