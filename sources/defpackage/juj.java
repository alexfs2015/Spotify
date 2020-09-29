package defpackage;

import android.content.Context;

/* renamed from: juj reason: default package */
public final class juj implements wig<jui> {
    private final wzi<Context> a;

    private juj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static juj a(wzi<Context> wzi) {
        return new juj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jui((Context) this.a.get());
    }
}
