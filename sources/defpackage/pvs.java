package defpackage;

import android.content.Context;

/* renamed from: pvs reason: default package */
public final class pvs implements wig<itb> {
    private final wzi<Context> a;

    public static itb a(Context context) {
        return (itb) wil.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
