package defpackage;

import io.reactivex.functions.Function;

/* renamed from: sqa reason: default package */
public final class sqa implements wig<spz> {
    private final wzi<slm> a;
    private final wzi<Function<sjh, hcs>> b;

    private sqa(wzi<slm> wzi, wzi<Function<sjh, hcs>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sqa a(wzi<slm> wzi, wzi<Function<sjh, hcs>> wzi2) {
        return new sqa(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new spz((slm) this.a.get(), (Function) this.b.get());
    }
}
