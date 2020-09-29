package defpackage;

import android.content.Context;

/* renamed from: kfc reason: default package */
public final class kfc implements wig<kfb> {
    private final wzi<Context> a;
    private final wzi<vwu> b;

    private kfc(wzi<Context> wzi, wzi<vwu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kfc a(wzi<Context> wzi, wzi<vwu> wzi2) {
        return new kfc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kfb((Context) this.a.get(), (vwu) this.b.get());
    }
}
