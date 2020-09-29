package defpackage;

import android.content.Context;

/* renamed from: myv reason: default package */
public final class myv implements wig<urm> {
    private final wzi<Context> a;

    private myv(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static myv a(wzi<Context> wzi) {
        return new myv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (urm) wil.a(new urm((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
