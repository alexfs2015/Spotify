package defpackage;

import android.app.Application;

/* renamed from: iha reason: default package */
public final class iha implements vua<igz> {
    private final wlc<ihc> a;
    private final wlc<igw> b;
    private final wlc<Application> c;

    private iha(wlc<ihc> wlc, wlc<igw> wlc2, wlc<Application> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static iha a(wlc<ihc> wlc, wlc<igw> wlc2, wlc<Application> wlc3) {
        return new iha(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new igz((ihc) this.a.get(), (igw) this.b.get(), (Application) this.c.get());
    }
}
