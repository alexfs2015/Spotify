package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gzb reason: default package */
public final class gzb implements wig<a> {
    private final wzi<HubsGlueImageDelegate> a;

    private gzb(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static gzb a(wzi<HubsGlueImageDelegate> wzi) {
        return new gzb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new a((HubsGlueImageDelegate) this.a.get());
    }
}
