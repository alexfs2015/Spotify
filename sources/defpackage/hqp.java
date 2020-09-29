package defpackage;

import android.content.Context;

/* renamed from: hqp reason: default package */
public final class hqp implements wig<hqo> {
    private final wzi<Context> a;
    private final wzi<ure> b;
    private final wzi<hqy> c;
    private final wzi<ury> d;

    private hqp(wzi<Context> wzi, wzi<ure> wzi2, wzi<hqy> wzi3, wzi<ury> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hqp a(wzi<Context> wzi, wzi<ure> wzi2, wzi<hqy> wzi3, wzi<ury> wzi4) {
        return new hqp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hqo((Context) this.a.get(), (ure) this.b.get(), (hqy) this.c.get(), (ury) this.d.get());
    }
}
