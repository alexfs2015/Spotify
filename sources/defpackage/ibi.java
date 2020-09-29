package defpackage;

import android.app.Application;

/* renamed from: ibi reason: default package */
public final class ibi implements wig<ibh> {
    private final wzi<Application> a;

    private ibi(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static ibi a(wzi<Application> wzi) {
        return new ibi(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ibh((Application) this.a.get());
    }
}
