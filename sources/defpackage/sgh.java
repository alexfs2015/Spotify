package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: sgh reason: default package */
public final class sgh implements wig<sgg> {
    private final wzi<HubsGlueImageDelegate> a;
    private final wzi<Context> b;

    private sgh(wzi<HubsGlueImageDelegate> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sgh a(wzi<HubsGlueImageDelegate> wzi, wzi<Context> wzi2) {
        return new sgh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sgg((HubsGlueImageDelegate) this.a.get(), (Context) this.b.get());
    }
}
