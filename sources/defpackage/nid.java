package defpackage;

import com.spotify.music.features.hiddencontent.loader.BansLoader.BansResponse;

/* renamed from: nid reason: default package */
public final class nid implements wig<gmm<BansResponse>> {
    private final wzi<gmn> a;

    private nid(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static nid a(wzi<gmn> wzi) {
        return new nid(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(BansResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
