package defpackage;

import android.content.Context;

/* renamed from: mev reason: default package */
public final class mev implements wig<meu> {
    private final wzi<Context> a;
    private final wzi<ovj> b;
    private final wzi<a<ovg>> c;
    private final wzi<ovh> d;

    private mev(wzi<Context> wzi, wzi<ovj> wzi2, wzi<a<ovg>> wzi3, wzi<ovh> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mev a(wzi<Context> wzi, wzi<ovj> wzi2, wzi<a<ovg>> wzi3, wzi<ovh> wzi4) {
        return new mev(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new meu(this.a, this.b, this.c, this.d);
    }
}
