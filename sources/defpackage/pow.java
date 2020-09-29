package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: pow reason: default package */
public final class pow implements wig<pov> {
    private final wzi<HubsGlueImageDelegate> a;
    private final wzi<pob> b;

    private pow(wzi<HubsGlueImageDelegate> wzi, wzi<pob> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pow a(wzi<HubsGlueImageDelegate> wzi, wzi<pob> wzi2) {
        return new pow(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pov((HubsGlueImageDelegate) this.a.get(), (pob) this.b.get());
    }
}
