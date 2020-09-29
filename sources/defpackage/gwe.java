package defpackage;

import android.app.Application;

/* renamed from: gwe reason: default package */
public final class gwe implements wig<gwd> {
    private final wzi<Application> a;

    private gwe(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static gwe a(wzi<Application> wzi) {
        return new gwe(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gwd((Application) this.a.get());
    }
}
