package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent.a;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;

/* renamed from: gxq reason: default package */
public final class gxq implements wig<gxp> {
    private final wzi<HubsGlueImageDelegate> a;
    private final wzi<a> b;
    private final wzi<HubsGlue2Row.a> c;

    private gxq(wzi<HubsGlueImageDelegate> wzi, wzi<a> wzi2, wzi<HubsGlue2Row.a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gxq a(wzi<HubsGlueImageDelegate> wzi, wzi<a> wzi2, wzi<HubsGlue2Row.a> wzi3) {
        return new gxq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new gxp((HubsGlueImageDelegate) this.a.get(), (a) this.b.get(), (HubsGlue2Row.a) this.c.get());
    }
}
