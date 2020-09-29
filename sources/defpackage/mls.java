package defpackage;

import android.content.Context;

/* renamed from: mls reason: default package */
public final class mls implements wig<mlr> {
    private final wzi<Context> a;
    private final wzi<fqn> b;

    private mls(wzi<Context> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mls a(wzi<Context> wzi, wzi<fqn> wzi2) {
        return new mls(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mlr((Context) this.a.get(), (fqn) this.b.get());
    }
}
