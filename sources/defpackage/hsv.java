package defpackage;

import android.content.Context;

/* renamed from: hsv reason: default package */
public final class hsv implements wig<hsu> {
    private final wzi<Context> a;
    private final wzi<vqy> b;

    private hsv(wzi<Context> wzi, wzi<vqy> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hsv a(wzi<Context> wzi, wzi<vqy> wzi2) {
        return new hsv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hsu((Context) this.a.get(), (vqy) this.b.get());
    }
}
