package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: gyv reason: default package */
public final class gyv implements wig<a> {
    private final wzi<HubsGlueImageDelegate> a;

    private gyv(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static gyv a(wzi<HubsGlueImageDelegate> wzi) {
        return new gyv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new a((HubsGlueImageDelegate) this.a.get());
    }
}
