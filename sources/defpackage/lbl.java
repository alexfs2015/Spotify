package defpackage;

import android.app.Application;

/* renamed from: lbl reason: default package */
public final class lbl implements wig<lbk> {
    private final wzi<Application> a;

    private lbl(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static lbl a(wzi<Application> wzi) {
        return new lbl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lbk((Application) this.a.get());
    }
}
