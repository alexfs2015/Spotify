package defpackage;

import android.app.Application;

/* renamed from: kwo reason: default package */
public final class kwo implements wig<kwn> {
    private final wzi<Application> a;
    private final wzi<kwf> b;

    private kwo(wzi<Application> wzi, wzi<kwf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kwo a(wzi<Application> wzi, wzi<kwf> wzi2) {
        return new kwo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kwn((Application) this.a.get(), (kwf) this.b.get());
    }
}
