package defpackage;

import android.content.Context;

/* renamed from: ock reason: default package */
public final class ock implements wig<ocj> {
    private final wzi<xii<String>> a;
    private final wzi<Context> b;
    private final wzi<jyg> c;

    private ock(wzi<xii<String>> wzi, wzi<Context> wzi2, wzi<jyg> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ock a(wzi<xii<String>> wzi, wzi<Context> wzi2, wzi<jyg> wzi3) {
        return new ock(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ocj((xii) this.a.get(), (Context) this.b.get(), (jyg) this.c.get());
    }
}
