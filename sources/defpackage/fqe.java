package defpackage;

import android.content.Context;

/* renamed from: fqe reason: default package */
public final class fqe implements wig<fqd> {
    private final wzi<Context> a;

    private fqe(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static fqd a(Context context) {
        return new fqd(context);
    }

    public static fqe a(wzi<Context> wzi) {
        return new fqe(wzi);
    }

    public final /* synthetic */ Object get() {
        return new fqd((Context) this.a.get());
    }
}
