package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: lpm reason: default package */
public final class lpm implements vua<lpl> {
    private final wlc<HubsGlueImageDelegate> a;

    private lpm(wlc<HubsGlueImageDelegate> wlc) {
        this.a = wlc;
    }

    public static lpm a(wlc<HubsGlueImageDelegate> wlc) {
        return new lpm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lpl((HubsGlueImageDelegate) this.a.get());
    }
}
