package defpackage;

import android.content.Context;

/* renamed from: mnx reason: default package */
public final class mnx implements wig<mnw> {
    private final wzi<mnr> a;
    private final wzi<Context> b;
    private final wzi<jlr> c;
    private final wzi<jtz> d;
    private final wzi<String> e;

    private mnx(wzi<mnr> wzi, wzi<Context> wzi2, wzi<jlr> wzi3, wzi<jtz> wzi4, wzi<String> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static mnx a(wzi<mnr> wzi, wzi<Context> wzi2, wzi<jlr> wzi3, wzi<jtz> wzi4, wzi<String> wzi5) {
        mnx mnx = new mnx(wzi, wzi2, wzi3, wzi4, wzi5);
        return mnx;
    }

    public final /* synthetic */ Object get() {
        mnw mnw = new mnw(this.a, this.b, this.c, this.d, this.e);
        return mnw;
    }
}
