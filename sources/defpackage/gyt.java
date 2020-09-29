package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gyt reason: default package */
public final class gyt implements wig<gys> {
    private final wzi<HubsGlueImageDelegate> a;

    private gyt(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static gyt a(wzi<HubsGlueImageDelegate> wzi) {
        return new gyt(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gys((HubsGlueImageDelegate) this.a.get());
    }
}
