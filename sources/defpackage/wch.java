package defpackage;

import android.content.Context;

/* renamed from: wch reason: default package */
public final class wch implements wig<gcr<Void, Boolean>> {
    private final wzi<Context> a;

    private wch(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static gcr<Void, Boolean> a(Context context) {
        return (gcr) wil.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static wch a(wzi<Context> wzi) {
        return new wch(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
