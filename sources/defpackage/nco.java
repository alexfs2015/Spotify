package defpackage;

import com.spotify.music.features.hiddencontent.loader.BansLoader.BansResponse;

/* renamed from: nco reason: default package */
public final class nco implements vua<gky<BansResponse>> {
    private final wlc<gkz> a;

    private nco(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static nco a(wlc<gkz> wlc) {
        return new nco(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(BansResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
