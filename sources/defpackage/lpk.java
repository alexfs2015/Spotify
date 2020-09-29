package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: lpk reason: default package */
public final class lpk implements vua<lpj> {
    private final wlc<HubsGlueImageDelegate> a;

    private lpk(wlc<HubsGlueImageDelegate> wlc) {
        this.a = wlc;
    }

    public static lpk a(wlc<HubsGlueImageDelegate> wlc) {
        return new lpk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lpj((HubsGlueImageDelegate) this.a.get());
    }
}
