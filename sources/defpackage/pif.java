package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: pif reason: default package */
public final class pif implements vua<pie> {
    private final wlc<HubsGlueImageDelegate> a;
    private final wlc<phk> b;

    private pif(wlc<HubsGlueImageDelegate> wlc, wlc<phk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pif a(wlc<HubsGlueImageDelegate> wlc, wlc<phk> wlc2) {
        return new pif(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pie((HubsGlueImageDelegate) this.a.get(), (phk) this.b.get());
    }
}
