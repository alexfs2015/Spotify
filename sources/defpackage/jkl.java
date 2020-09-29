package defpackage;

import android.content.Context;

/* renamed from: jkl reason: default package */
public final class jkl implements wig<jkk> {
    private final wzi<Context> a;
    private final wzi<hje> b;

    private jkl(wzi<Context> wzi, wzi<hje> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jkl a(wzi<Context> wzi, wzi<hje> wzi2) {
        return new jkl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jkk((Context) this.a.get(), (hje) this.b.get());
    }
}
