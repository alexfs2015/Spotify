package defpackage;

import android.content.Context;

/* renamed from: laq reason: default package */
public final class laq implements vua<String> {
    private final wlc<Context> a;

    private laq(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static laq a(wlc<Context> wlc) {
        return new laq(wlc);
    }

    public static String a(Context context) {
        return (String) vuf.a(context.getClass().getSimpleName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
