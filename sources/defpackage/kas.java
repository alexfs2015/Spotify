package defpackage;

import android.os.Looper;

/* renamed from: kas reason: default package */
public final class kas implements wig<kds> {
    private final wzi<Looper> a;

    private kas(wzi<Looper> wzi) {
        this.a = wzi;
    }

    public static kas a(wzi<Looper> wzi) {
        return new kas(wzi);
    }

    public final /* synthetic */ Object get() {
        return (kds) wil.a(new kds((Looper) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
