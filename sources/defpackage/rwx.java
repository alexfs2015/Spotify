package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: rwx reason: default package */
public final class rwx implements vua<rww> {
    private final wlc<HubsGlueImageDelegate> a;
    private final wlc<Context> b;

    private rwx(wlc<HubsGlueImageDelegate> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rwx a(wlc<HubsGlueImageDelegate> wlc, wlc<Context> wlc2) {
        return new rwx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rww((HubsGlueImageDelegate) this.a.get(), (Context) this.b.get());
    }
}
