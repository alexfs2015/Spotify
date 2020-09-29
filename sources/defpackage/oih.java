package defpackage;

import android.content.Context;

/* renamed from: oih reason: default package */
public final class oih implements wig<glx> {
    private final wzi<Context> a;

    private oih(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static oih a(wzi<Context> wzi) {
        return new oih(wzi);
    }

    public final /* synthetic */ Object get() {
        return (glx) wil.a(new glz((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
