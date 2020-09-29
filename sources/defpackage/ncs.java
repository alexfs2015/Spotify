package defpackage;

import com.spotify.music.features.hiddencontent.loader.BansLoader;
import com.spotify.music.features.hiddencontent.loader.BansLoader.BansResponse;

/* renamed from: ncs reason: default package */
public final class ncs implements vua<BansLoader> {
    private final wlc<gky<BansResponse>> a;

    private ncs(wlc<gky<BansResponse>> wlc) {
        this.a = wlc;
    }

    public static ncs a(wlc<gky<BansResponse>> wlc) {
        return new ncs(wlc);
    }

    public final /* synthetic */ Object get() {
        return new BansLoader((gky) this.a.get());
    }
}
