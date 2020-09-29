package defpackage;

import android.app.Application;

/* renamed from: qqi reason: default package */
public final class qqi implements vua<qqh> {
    private final wlc<Application> a;

    private qqi(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static qqi a(wlc<Application> wlc) {
        return new qqi(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qqh((Application) this.a.get());
    }
}
