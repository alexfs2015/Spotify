package defpackage;

import android.content.Context;

/* renamed from: uhl reason: default package */
public final class uhl implements wig<uhk> {
    private final wzi<Context> a;

    private uhl(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static uhl a(wzi<Context> wzi) {
        return new uhl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uhk((Context) this.a.get());
    }
}
