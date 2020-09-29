package defpackage;

import android.content.Context;

/* renamed from: krl reason: default package */
public final class krl implements wig<krk> {
    private final wzi<Context> a;

    private krl(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static krl a(wzi<Context> wzi) {
        return new krl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new krk((Context) this.a.get());
    }
}
