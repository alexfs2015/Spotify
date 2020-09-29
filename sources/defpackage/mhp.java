package defpackage;

import android.app.Application;

/* renamed from: mhp reason: default package */
public final class mhp implements wig<mho> {
    private final wzi<hit> a;
    private final wzi<Application> b;

    private mhp(wzi<hit> wzi, wzi<Application> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mhp a(wzi<hit> wzi, wzi<Application> wzi2) {
        return new mhp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mho((hit) this.a.get(), (Application) this.b.get());
    }
}
