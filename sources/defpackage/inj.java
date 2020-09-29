package defpackage;

import android.content.Context;

/* renamed from: inj reason: default package */
public final class inj implements wig<ini> {
    private final wzi<Context> a;

    private inj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static inj a(wzi<Context> wzi) {
        return new inj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ini((Context) this.a.get());
    }
}
