package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gza reason: default package */
public final class gza implements wig<gyz> {
    private final wzi<HubsGlueImageDelegate> a;

    private gza(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static gza a(wzi<HubsGlueImageDelegate> wzi) {
        return new gza(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gyz((HubsGlueImageDelegate) this.a.get());
    }
}
