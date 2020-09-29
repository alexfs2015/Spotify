package defpackage;

import io.reactivex.functions.Function;

/* renamed from: spw reason: default package */
public final class spw implements wig<spv> {
    private final wzi<slm> a;
    private final wzi<Function<sjg, hcs>> b;

    private spw(wzi<slm> wzi, wzi<Function<sjg, hcs>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static spw a(wzi<slm> wzi, wzi<Function<sjg, hcs>> wzi2) {
        return new spw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new spv((slm) this.a.get(), (Function) this.b.get());
    }
}
