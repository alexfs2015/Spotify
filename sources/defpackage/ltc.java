package defpackage;

import android.app.Application;

/* renamed from: ltc reason: default package */
public final class ltc implements wig<ltb> {
    private final wzi<Application> a;

    private ltc(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static ltc a(wzi<Application> wzi) {
        return new ltc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ltb((Application) this.a.get());
    }
}
