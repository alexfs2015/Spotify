package defpackage;

import android.os.Looper;

/* renamed from: kbi reason: default package */
public final class kbi implements wig<kds> {
    private final wzi<Looper> a;

    private kbi(wzi<Looper> wzi) {
        this.a = wzi;
    }

    public static kbi a(wzi<Looper> wzi) {
        return new kbi(wzi);
    }

    public final /* synthetic */ Object get() {
        return (kds) wil.a(new kds((Looper) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
