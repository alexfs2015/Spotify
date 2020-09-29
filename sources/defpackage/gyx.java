package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gyx reason: default package */
public final class gyx implements wig<c> {
    private final wzi<HubsGlueImageDelegate> a;

    private gyx(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static gyx a(wzi<HubsGlueImageDelegate> wzi) {
        return new gyx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new c((HubsGlueImageDelegate) this.a.get());
    }
}
