package defpackage;

import android.content.Context;

/* renamed from: szd reason: default package */
public final class szd implements wig<szc> {
    private final wzi<Context> a;

    private szd(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static szd a(wzi<Context> wzi) {
        return new szd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new szc((Context) this.a.get());
    }
}
