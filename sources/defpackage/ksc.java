package defpackage;

import android.content.Context;

/* renamed from: ksc reason: default package */
public final class ksc implements wig<ksb> {
    private final wzi<Context> a;
    private final wzi<szp> b;

    private ksc(wzi<Context> wzi, wzi<szp> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ksc a(wzi<Context> wzi, wzi<szp> wzi2) {
        return new ksc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ksb((Context) this.a.get(), (szp) this.b.get());
    }
}
