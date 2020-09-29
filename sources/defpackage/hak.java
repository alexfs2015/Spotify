package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: hak reason: default package */
public final class hak implements wig<haj> {
    private final wzi<HubsGlueImageDelegate> a;

    private hak(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static hak a(wzi<HubsGlueImageDelegate> wzi) {
        return new hak(wzi);
    }

    public final /* synthetic */ Object get() {
        return new haj((HubsGlueImageDelegate) this.a.get());
    }
}
