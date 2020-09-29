package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: kau reason: default package */
public final class kau implements wig<List<kci>> {
    private final wzi<ije> a;
    private final wzi<ija> b;
    private final wzi<kbv> c;
    private final wzi<kal> d;

    private kau(wzi<ije> wzi, wzi<ija> wzi2, wzi<kbv> wzi3, wzi<kal> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static kau a(wzi<ije> wzi, wzi<ija> wzi2, wzi<kbv> wzi3, wzi<kal> wzi4) {
        return new kau(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (List) wil.a(Arrays.asList(new kci[]{(ije) this.a.get(), (ija) this.b.get(), (kbv) this.c.get(), (kal) this.d.get()}), "Cannot return null from a non-@Nullable @Provides method");
    }
}
