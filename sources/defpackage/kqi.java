package defpackage;

import android.content.Context;

/* renamed from: kqi reason: default package */
public final class kqi implements wig<kqh> {
    private final wzi<Context> a;
    private final wzi<sff> b;

    private kqi(wzi<Context> wzi, wzi<sff> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kqi a(wzi<Context> wzi, wzi<sff> wzi2) {
        return new kqi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kqh((Context) this.a.get(), (sff) this.b.get());
    }
}
