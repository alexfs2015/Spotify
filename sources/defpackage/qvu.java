package defpackage;

import android.content.Context;

/* renamed from: qvu reason: default package */
public final class qvu implements vua<jtp> {
    private final wlc<Context> a;

    public static jtp a(Context context) {
        return (jtp) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
