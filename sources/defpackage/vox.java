package defpackage;

import android.content.Context;

/* renamed from: vox reason: default package */
public final class vox implements vua<jti> {
    private final wlc<Context> a;

    private vox(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static vox a(wlc<Context> wlc) {
        return new vox(wlc);
    }

    public static jti a(Context context) {
        return (jti) vuf.a(jtj.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
