package defpackage;

import android.app.Application;

/* renamed from: kzo reason: default package */
public final class kzo implements vua<jro> {
    private final wlc<Application> a;
    private final wlc<jsi> b;

    private kzo(wlc<Application> wlc, wlc<jsi> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kzo a(wlc<Application> wlc, wlc<jsi> wlc2) {
        return new kzo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (jro) vuf.a(new kwy((Application) this.a.get(), "com.spotify.music", false, (jsi) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
