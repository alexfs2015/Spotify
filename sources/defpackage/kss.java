package defpackage;

import android.os.Build.VERSION;

/* renamed from: kss reason: default package */
public final class kss implements wig<ksv> {
    private final wzi<ktb> a;
    private final wzi<ksz> b;

    private kss(wzi<ktb> wzi, wzi<ksz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kss a(wzi<ktb> wzi, wzi<ksz> wzi2) {
        return new kss(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        wzi<ktb> wzi = this.a;
        Object obj = (ksz) this.b.get();
        if (VERSION.SDK_INT >= 25) {
            obj = (ksv) wzi.get();
        }
        return (ksv) wil.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
