package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: hfe reason: default package */
public final class hfe implements vua<hfh> {
    private final wlc<Cosmonaut> a;
    private final wlc<hff> b;

    private hfe(wlc<Cosmonaut> wlc, wlc<hff> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hfe a(wlc<Cosmonaut> wlc, wlc<hff> wlc2) {
        return new hfe(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (hfh) vuf.a(new hfh((Cosmonaut) this.a.get(), (hff) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
