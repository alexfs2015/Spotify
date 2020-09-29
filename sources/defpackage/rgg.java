package defpackage;

import android.content.Context;

/* renamed from: rgg reason: default package */
public final class rgg implements wig<rgf> {
    private final wzi<Context> a;
    private final wzi<rbg> b;
    private final wzi<String> c;

    private rgg(wzi<Context> wzi, wzi<rbg> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rgg a(wzi<Context> wzi, wzi<rbg> wzi2, wzi<String> wzi3) {
        return new rgg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rgf((Context) this.a.get(), (rbg) this.b.get(), (String) this.c.get());
    }
}
