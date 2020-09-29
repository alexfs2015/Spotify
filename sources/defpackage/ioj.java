package defpackage;

import android.content.Context;

/* renamed from: ioj reason: default package */
public final class ioj implements wig<ioi> {
    private final wzi<Context> a;

    private ioj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ioj a(wzi<Context> wzi) {
        return new ioj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ioi((Context) this.a.get());
    }
}
