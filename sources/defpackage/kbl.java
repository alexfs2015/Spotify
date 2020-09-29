package defpackage;

import com.google.common.base.Optional;

/* renamed from: kbl reason: default package */
public final class kbl implements wig<kah> {
    private final wzi<fqn> a;

    private kbl(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static kbl a(wzi<fqn> wzi) {
        return new kbl(wzi);
    }

    public final /* synthetic */ Object get() {
        fqn fqn = (fqn) this.a.get();
        kah kah = new kah();
        kah.b = ((Boolean) fqn.a(kaz.e)).booleanValue();
        kah.c = ((Integer) fqn.a(kaz.d)).intValue();
        kah.a = Optional.c(fqn.a(kaz.b));
        return (kah) wil.a(kah, "Cannot return null from a non-@Nullable @Provides method");
    }
}
