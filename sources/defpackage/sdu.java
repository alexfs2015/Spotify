package defpackage;

import android.app.Application;

/* renamed from: sdu reason: default package */
public final class sdu implements wig<sdt> {
    private final wzi<Application> a;

    private sdu(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static sdu a(wzi<Application> wzi) {
        return new sdu(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sdt((Application) this.a.get());
    }
}
