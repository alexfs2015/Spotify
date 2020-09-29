package defpackage;

import android.app.Application;

/* renamed from: kyc reason: default package */
public final class kyc implements vua<kyb> {
    private final wlc<Application> a;

    private kyc(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static kyc a(wlc<Application> wlc) {
        return new kyc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kyb((Application) this.a.get());
    }
}
