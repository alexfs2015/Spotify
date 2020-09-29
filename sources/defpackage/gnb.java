package defpackage;

import android.content.Context;

/* renamed from: gnb reason: default package */
public final class gnb implements vua<gmy> {
    private final wlc<Context> a;

    public static gmy a(Context context) {
        return (gmy) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
