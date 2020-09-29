package defpackage;

import android.content.Context;

/* renamed from: pmw reason: default package */
public final class pmw implements vua<iqo> {
    private final wlc<Context> a;

    public static iqo a(Context context) {
        return (iqo) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
