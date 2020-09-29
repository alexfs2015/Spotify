package defpackage;

import java.util.Random;

/* renamed from: hir reason: default package */
public final class hir implements wig<hiq> {
    private final wzi<hip> a;
    private final wzi<jtz> b;
    private final wzi<Random> c;

    private hir(wzi<hip> wzi, wzi<jtz> wzi2, wzi<Random> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hir a(wzi<hip> wzi, wzi<jtz> wzi2, wzi<Random> wzi3) {
        return new hir(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hiq((hip) this.a.get(), (jtz) this.b.get(), (Random) this.c.get());
    }
}
