package defpackage;

import android.app.Application;

/* renamed from: lsx reason: default package */
public final class lsx implements wig<lsw> {
    private final wzi<Application> a;

    private lsx(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static lsx a(wzi<Application> wzi) {
        return new lsx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lsw((Application) this.a.get());
    }
}
