package defpackage;

import android.content.Context;

/* renamed from: ins reason: default package */
public final class ins implements wig<inr> {
    private final wzi<Context> a;

    private ins(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ins a(wzi<Context> wzi) {
        return new ins(wzi);
    }

    public final /* synthetic */ Object get() {
        return new inr((Context) this.a.get());
    }
}
