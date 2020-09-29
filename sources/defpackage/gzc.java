package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gzc reason: default package */
public final class gzc implements wig<b> {
    private final wzi<HubsGlueImageDelegate> a;

    private gzc(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static gzc a(wzi<HubsGlueImageDelegate> wzi) {
        return new gzc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new b((HubsGlueImageDelegate) this.a.get());
    }
}
