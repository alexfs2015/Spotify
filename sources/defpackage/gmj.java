package defpackage;

import android.content.Context;

/* renamed from: gmj reason: default package */
public final class gmj implements wig<gmi> {
    private final wzi<Context> a;

    private gmj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static gmj a(wzi<Context> wzi) {
        return new gmj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gmi((Context) this.a.get());
    }
}
