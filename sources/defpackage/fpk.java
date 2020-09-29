package defpackage;

import android.content.Context;

/* renamed from: fpk reason: default package */
public final class fpk implements vua<fpj> {
    private final wlc<Context> a;

    private fpk(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static fpk a(wlc<Context> wlc) {
        return new fpk(wlc);
    }

    public static fpj a(Context context) {
        return new fpj(context);
    }

    public final /* synthetic */ Object get() {
        return new fpj((Context) this.a.get());
    }
}
