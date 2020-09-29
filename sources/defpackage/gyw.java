package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gyw reason: default package */
public final class gyw implements wig<b> {
    private final wzi<HubsGlueImageDelegate> a;

    private gyw(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static gyw a(wzi<HubsGlueImageDelegate> wzi) {
        return new gyw(wzi);
    }

    public final /* synthetic */ Object get() {
        return new b((HubsGlueImageDelegate) this.a.get());
    }
}
