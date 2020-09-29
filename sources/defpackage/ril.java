package defpackage;

import android.content.Context;

/* renamed from: ril reason: default package */
public final class ril implements wig<rik> {
    private final wzi<Context> a;

    private ril(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ril a(wzi<Context> wzi) {
        return new ril(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rik((Context) this.a.get());
    }
}
