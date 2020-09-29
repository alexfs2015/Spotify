package defpackage;

import android.content.Context;

/* renamed from: kfa reason: default package */
public final class kfa implements vua<apz> {
    private final wlc<Context> a;

    public static apz a(Context context) {
        return (apz) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
